/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class edu_alibaba_mpc4j_common_tool_polynomial_zp_NtlZpPoly */

#ifndef _Included_edu_alibaba_mpc4j_common_tool_polynomial_zp_NtlZpPoly
#define _Included_edu_alibaba_mpc4j_common_tool_polynomial_zp_NtlZpPoly
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     edu_alibaba_mpc4j_common_tool_polynomial_zp_NtlZpPoly
 * Method:    nativeRootInterpolate
 * Signature: ([BI[[B[B)[[B
 */
JNIEXPORT jobjectArray JNICALL Java_edu_alibaba_mpc4j_common_tool_polynomial_zp_NtlZpPoly_nativeRootInterpolate
  (JNIEnv *, jclass, jbyteArray, jint, jobjectArray, jbyteArray);

/*
 * Class:     edu_alibaba_mpc4j_common_tool_polynomial_zp_NtlZpPoly
 * Method:    nativeInterpolate
 * Signature: ([BI[[B[[B)[[B
 */
JNIEXPORT jobjectArray JNICALL Java_edu_alibaba_mpc4j_common_tool_polynomial_zp_NtlZpPoly_nativeInterpolate
  (JNIEnv *, jclass, jbyteArray, jint, jobjectArray, jobjectArray);

/*
 * Class:     edu_alibaba_mpc4j_common_tool_polynomial_zp_NtlZpPoly
 * Method:    nativeSingleEvaluate
 * Signature: ([B[[B[B)[B
 */
JNIEXPORT jbyteArray JNICALL Java_edu_alibaba_mpc4j_common_tool_polynomial_zp_NtlZpPoly_nativeSingleEvaluate
  (JNIEnv *, jclass, jbyteArray, jobjectArray, jbyteArray);

/*
 * Class:     edu_alibaba_mpc4j_common_tool_polynomial_zp_NtlZpPoly
 * Method:    nativeEvaluate
 * Signature: ([B[[B[[B)[[B
 */
JNIEXPORT jobjectArray JNICALL Java_edu_alibaba_mpc4j_common_tool_polynomial_zp_NtlZpPoly_nativeEvaluate
  (JNIEnv *, jclass, jbyteArray, jobjectArray, jobjectArray);

#ifdef __cplusplus
}
#endif
#endif
