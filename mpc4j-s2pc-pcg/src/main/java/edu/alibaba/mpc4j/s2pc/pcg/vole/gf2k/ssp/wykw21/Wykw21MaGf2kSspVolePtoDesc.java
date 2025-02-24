package edu.alibaba.mpc4j.s2pc.pcg.vole.gf2k.ssp.wykw21;

import edu.alibaba.mpc4j.common.rpc.desc.PtoDesc;
import edu.alibaba.mpc4j.common.rpc.desc.PtoDescManager;

/**
 * semi-honest WYKW21-SSP-GF2K-VOLE protocol description. The protocol comes from the following paper:
 * <p>
 * Weng, Chenkai, Kang Yang, Jonathan Katz, and Xiao Wang. Wolverine: fast, scalable, and communication-efficient
 * zero-knowledge proofs for boolean and arithmetic circuits. S&P 2021, pp. 1074-1091. IEEE, 2021.
 * </p>
 * The malicious version requires Consistency check shown in Figure 7.
 *
 * @author Weiran Liu
 * @date 2023/7/19
 */
class Wykw21MaGf2kSspVolePtoDesc implements PtoDesc {
    /**
     * protocol ID
     */
    private static final int PTO_ID = Math.abs((int) 355143244246768381L);
    /**
     * protocol name
     */
    private static final String PTO_NAME = "WYKW21_MA_GF2K_SSP_VOLE";

    /**
     * protocol step
     */
    enum PtoStep {
        /**
         * receiver sends d = γ - Σ_{i ∈ [0, n)} v[i]
         */
        RECEIVER_SEND_D,
        /**
         * sender sends seed for {χ_i}_{i ∈ [0, n)} and x^*
         */
        SENDER_SEND_CHI_SEED_X_STAR,
        /**
         * receiver commits VB
         */
        RECEIVER_COMMIT_VB,
        /**
         * sender sends VA
         */
        SENDER_SEND_VA,
        /**
         * receiver opens VB
         */
        RECEIVER_OPEN_VB,
    }

    /**
     * singleton mode
     */
    private static final Wykw21MaGf2kSspVolePtoDesc INSTANCE = new Wykw21MaGf2kSspVolePtoDesc();

    /**
     * private constructor
     */
    private Wykw21MaGf2kSspVolePtoDesc() {
        // empty
    }

    public static PtoDesc getInstance() {
        return INSTANCE;
    }

    static {
        PtoDescManager.registerPtoDesc(getInstance());
    }

    @Override
    public int getPtoId() {
        return PTO_ID;
    }

    @Override
    public String getPtoName() {
        return PTO_NAME;
    }
}
