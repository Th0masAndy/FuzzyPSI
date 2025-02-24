package edu.alibaba.mpc4j.s2pc.pcg.ot.bnot.mr19;

import edu.alibaba.mpc4j.common.rpc.desc.SecurityModel;
import edu.alibaba.mpc4j.common.rpc.pto.AbstractMultiPartyPtoConfig;
import edu.alibaba.mpc4j.s2pc.pcg.ot.bnot.BaseNotConfig;
import edu.alibaba.mpc4j.s2pc.pcg.ot.bnot.BaseNotFactory;

/**
 * MR19-椭圆曲线-基础n选1-OT协议配置项。
 *
 * @author Hanwen Feng
 * @date 2022/07/25
 */
public class Mr19EccBaseNotConfig extends AbstractMultiPartyPtoConfig implements BaseNotConfig {
    /**
     * 是否使用压缩椭圆曲线编码
     */
    private final boolean compressEncode;

    private Mr19EccBaseNotConfig(Builder builder) {
        super(SecurityModel.MALICIOUS);
        compressEncode = builder.compressEncode;
    }

    @Override
    public BaseNotFactory.BaseNotType getPtoType() {
        return BaseNotFactory.BaseNotType.MR19_ECC;
    }

    public boolean getCompressEncode() {
        return compressEncode;
    }

    public static class Builder implements org.apache.commons.lang3.builder.Builder<Mr19EccBaseNotConfig> {
        /**
         * 是否使用压缩椭圆曲线编码
         */
        private boolean compressEncode;

        public Builder() {
            compressEncode = true;
        }

        public Builder setCompressEncode(boolean compressEncode) {
            this.compressEncode = compressEncode;
            return this;
        }

        @Override
        public Mr19EccBaseNotConfig build() {
            return new Mr19EccBaseNotConfig(this);
        }
    }
}
