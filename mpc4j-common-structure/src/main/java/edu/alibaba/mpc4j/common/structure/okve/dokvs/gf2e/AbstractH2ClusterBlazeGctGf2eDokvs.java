package edu.alibaba.mpc4j.common.structure.okve.dokvs.gf2e;

import edu.alibaba.mpc4j.common.structure.okve.dokvs.H2BlazeGctDokvsUtils;
import edu.alibaba.mpc4j.common.structure.okve.dokvs.H2ClusterBlazeGctDokvsUtils;
import edu.alibaba.mpc4j.common.tool.EnvType;
import edu.alibaba.mpc4j.common.tool.MathPreconditions;
import edu.alibaba.mpc4j.common.tool.crypto.kdf.Kdf;
import edu.alibaba.mpc4j.common.tool.crypto.kdf.KdfFactory;
import edu.alibaba.mpc4j.common.tool.crypto.prf.Prf;
import edu.alibaba.mpc4j.common.tool.crypto.prf.PrfFactory;
import edu.alibaba.mpc4j.common.tool.hashbin.MaxBinSizeUtils;
import edu.alibaba.mpc4j.common.tool.utils.BytesUtils;
import edu.alibaba.mpc4j.common.tool.utils.CommonUtils;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * abstract clustering blazing fast DOKVS using garbled cuckoo table with 2 hash functions.
 *
 * @author Weiran Liu
 * @date 2023/8/3
 */
abstract class AbstractH2ClusterBlazeGctGf2eDokvs<T> extends AbstractGf2eDokvs<T> implements BinaryGf2eDokvs<T> {
    /**
     * number of bins
     */
    protected final int binNum;
    /**
     * number of key-value pairs in each bin
     */
    protected final int binN;
    /**
     * left m in each bin
     */
    protected final int binLm;
    /**
     * right m in each bin
     */
    protected final int binRm;
    /**
     * m for each bin
     */
    protected final int binM;
    /**
     * bin hash
     */
    protected final Prf binHash;
    /**
     * bins
     */
    protected final ArrayList<H2BlazeGctGf2eDokvs<T>> bins;

    AbstractH2ClusterBlazeGctGf2eDokvs(EnvType envType, int n, int l, byte[][] keys, SecureRandom secureRandom) {
        super(n, H2ClusterBlazeGctDokvsUtils.getM(n), l, secureRandom);
        // calculate bin_num and bin_size
        binNum = CommonUtils.getUnitNum(n, H2ClusterBlazeGctDokvsUtils.EXPECT_BIN_SIZE);
        binN = MaxBinSizeUtils.approxMaxBinSize(n, binNum);
        binLm = H2BlazeGctDokvsUtils.getLm(binN);
        binRm = H2BlazeGctDokvsUtils.getRm(binN);
        binM = binLm + binRm;
        // clone keys
        MathPreconditions.checkEqual("keys.length", "hash_num", keys.length, H2ClusterBlazeGctDokvsUtils.HASH_KEY_NUM);
        // init bin hash
        binHash = PrfFactory.createInstance(envType, Integer.BYTES);
        binHash.setKey(keys[0]);
        byte[][] cloneKeys = new byte[H2ClusterBlazeGctDokvsUtils.HASH_KEY_NUM - 1][];
        for (int keyIndex = 0; keyIndex < H2ClusterBlazeGctDokvsUtils.HASH_KEY_NUM - 1; keyIndex++) {
            cloneKeys[keyIndex] = BytesUtils.clone(keys[keyIndex + 1]);
        }
        // create bins
        Kdf kdf = KdfFactory.createInstance(envType);
        bins = IntStream.range(0, binNum)
            .mapToObj(binIndex -> {
                for (int keyIndex = 0; keyIndex < H2ClusterBlazeGctDokvsUtils.HASH_KEY_NUM - 1; keyIndex++) {
                    cloneKeys[keyIndex] = kdf.deriveKey(cloneKeys[keyIndex]);
                }
                return new H2BlazeGctGf2eDokvs<T>(envType, binN, l, cloneKeys, secureRandom);
            })
            .collect(Collectors.toCollection(ArrayList::new));
    }

    @Override
    public int maxPositionNum() {
        return H2ClusterBlazeGctDokvsUtils.SPARSE_HASH_NUM + binNum * binRm;
    }
}
