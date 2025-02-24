/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class edu_alibaba_mpc4j_common_tool_crypto_ecc_openssl_SecP256k1OpensslNativeEcc */

#ifndef _Included_edu_alibaba_mpc4j_common_tool_crypto_ecc_openssl_SecP256k1OpensslNativeEcc
#define _Included_edu_alibaba_mpc4j_common_tool_crypto_ecc_openssl_SecP256k1OpensslNativeEcc
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     edu_alibaba_mpc4j_common_tool_crypto_ecc_openssl_SecP256k1OpensslNativeEcc
 * Method:    init
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_edu_alibaba_mpc4j_common_tool_crypto_ecc_openssl_SecP256k1OpensslNativeEcc_init
    (JNIEnv *, jobject);

/*
 * Class:     edu_alibaba_mpc4j_common_tool_crypto_ecc_openssl_SecP256k1OpensslNativeEcc
 * Method:    precompute
 * Signature: (Ljava/lang/String;)Ljava/nio/ByteBuffer;
 */
JNIEXPORT jobject JNICALL Java_edu_alibaba_mpc4j_common_tool_crypto_ecc_openssl_SecP256k1OpensslNativeEcc_precompute
    (JNIEnv *, jobject, jstring);

/*
 * Class:     edu_alibaba_mpc4j_common_tool_crypto_ecc_openssl_SecP256k1OpensslNativeEcc
 * Method:    destroyPrecompute
 * Signature: (Ljava/nio/ByteBuffer;)V
 */
JNIEXPORT void JNICALL Java_edu_alibaba_mpc4j_common_tool_crypto_ecc_openssl_SecP256k1OpensslNativeEcc_destroyPrecompute
    (JNIEnv *, jobject, jobject);

/*
 * Class:     edu_alibaba_mpc4j_common_tool_crypto_ecc_openssl_SecP256k1OpensslNativeEcc
 * Method:    singleFixedPointMultiply
 * Signature: (Ljava/nio/ByteBuffer;Ljava/lang/String;)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_edu_alibaba_mpc4j_common_tool_crypto_ecc_openssl_SecP256k1OpensslNativeEcc_precomputeMultiply
    (JNIEnv *, jobject, jobject, jstring);

/*
 * Class:     edu_alibaba_mpc4j_common_tool_crypto_ecc_openssl_SecP256k1OpensslNativeEcc
 * Method:    singleMultiply
 * Signature: (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_edu_alibaba_mpc4j_common_tool_crypto_ecc_openssl_SecP256k1OpensslNativeEcc_multiply
    (JNIEnv *, jobject, jstring, jstring);

/*
 * Class:     edu_alibaba_mpc4j_common_tool_crypto_ecc_openssl_SecP256k1OpensslNativeEcc
 * Method:    reset
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_edu_alibaba_mpc4j_common_tool_crypto_ecc_openssl_SecP256k1OpensslNativeEcc_reset
    (JNIEnv *, jobject);

#ifdef __cplusplus
}
#endif
#endif
