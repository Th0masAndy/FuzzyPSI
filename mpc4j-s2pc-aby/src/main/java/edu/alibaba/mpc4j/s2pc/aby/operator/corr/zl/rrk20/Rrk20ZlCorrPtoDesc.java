package edu.alibaba.mpc4j.s2pc.aby.operator.corr.zl.rrk20;

import edu.alibaba.mpc4j.common.rpc.desc.PtoDesc;
import edu.alibaba.mpc4j.common.rpc.desc.PtoDescManager;

/**
 * RRK+20 Zl Corr protocol description. The protocol comes from Algorithm 5 of the following paper:
 * <p>
 * Rathee, Deevashwer, Mayank Rathee, Nishant Kumar, Nishanth Chandran, Divya Gupta, Aseem Rastogi, and Rahul Sharma.
 * CrypTFlow2: Practical 2-party secure inference. CCS 2020, pp. 325-342. 2020.
 * </p>
 *
 * @author Liqiang Peng
 * @date 2023/10/1
 */
public class Rrk20ZlCorrPtoDesc implements PtoDesc {
    /**
     * protocol ID
     */
    private static final int PTO_ID = Math.abs((int) 584256132451167562L);
    /**
     * protocol name
     */
    private static final String PTO_NAME = "RRK+20_ZL_CORR";

    /**
     * protocol step
     */
    enum PtoStep {
        /**
         * sender send s
         */
        SENDER_SENDS_S,
    }

    /**
     * singleton mode
     */
    private static final Rrk20ZlCorrPtoDesc INSTANCE = new Rrk20ZlCorrPtoDesc();

    /**
     * private constructor.
     */
    private Rrk20ZlCorrPtoDesc() {
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
