/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class edu_alibaba_mpc4j_s2pc_upso_ucpsi_sj23_peqt_Sj23PeqtUcpsiNativeUtils */

#ifndef _Included_edu_alibaba_mpc4j_s2pc_upso_ucpsi_sj23_peqt_Sj23PeqtUcpsiNativeUtils
#define _Included_edu_alibaba_mpc4j_s2pc_upso_ucpsi_sj23_peqt_Sj23PeqtUcpsiNativeUtils
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     edu_alibaba_mpc4j_s2pc_upso_ucpsi_sj23_peqt_Sj23PeqtUcpsiNativeUtils
 * Method:    genEncryptionParameters
 * Signature: (IJ[I)[B
 */
JNIEXPORT jbyteArray JNICALL Java_edu_alibaba_mpc4j_s2pc_upso_ucpsi_sj23_peqt_Sj23PeqtUcpsiNativeUtils_genEncryptionParameters
  (JNIEnv *, jclass, jint, jlong, jintArray);

/*
 * Class:     edu_alibaba_mpc4j_s2pc_upso_ucpsi_sj23_peqt_Sj23PeqtUcpsiNativeUtils
 * Method:    keyGen
 * Signature: ([B)Ljava/util/List;
 */
JNIEXPORT jobject JNICALL Java_edu_alibaba_mpc4j_s2pc_upso_ucpsi_sj23_peqt_Sj23PeqtUcpsiNativeUtils_keyGen
  (JNIEnv *, jclass, jbyteArray);

/*
 * Class:     edu_alibaba_mpc4j_s2pc_upso_ucpsi_sj23_peqt_Sj23PeqtUcpsiNativeUtils
 * Method:    computeEncryptedPowers
 * Signature: ([B[BLjava/util/List;[[I[II)Ljava/util/List;
 */
JNIEXPORT jobject JNICALL Java_edu_alibaba_mpc4j_s2pc_upso_ucpsi_sj23_peqt_Sj23PeqtUcpsiNativeUtils_computeEncryptedPowers
  (JNIEnv *, jclass, jbyteArray, jbyteArray, jobject, jobjectArray, jintArray, jint);

/*
 * Class:     edu_alibaba_mpc4j_s2pc_upso_ucpsi_sj23_peqt_Sj23PeqtUcpsiNativeUtils
 * Method:    optComputeMatches
 * Signature: ([B[B[B[[JLjava/util/List;I[J)[B
 */
JNIEXPORT jbyteArray JNICALL Java_edu_alibaba_mpc4j_s2pc_upso_ucpsi_sj23_peqt_Sj23PeqtUcpsiNativeUtils_optComputeMatches
  (JNIEnv *, jclass, jbyteArray, jbyteArray, jbyteArray, jobjectArray, jobject, jint, jlongArray);

/*
 * Class:     edu_alibaba_mpc4j_s2pc_upso_ucpsi_sj23_peqt_Sj23PeqtUcpsiNativeUtils
 * Method:    naiveComputeMatches
 * Signature: ([B[B[[JLjava/util/List;[J)[B
 */
JNIEXPORT jbyteArray JNICALL Java_edu_alibaba_mpc4j_s2pc_upso_ucpsi_sj23_peqt_Sj23PeqtUcpsiNativeUtils_naiveComputeMatches
  (JNIEnv *, jclass, jbyteArray, jbyteArray, jobjectArray, jobject, jlongArray);

/*
 * Class:     edu_alibaba_mpc4j_s2pc_upso_ucpsi_sj23_peqt_Sj23PeqtUcpsiNativeUtils
 * Method:    generateQuery
 * Signature: ([B[B[B[[J)Ljava/util/List;
 */
JNIEXPORT jobject JNICALL Java_edu_alibaba_mpc4j_s2pc_upso_ucpsi_sj23_peqt_Sj23PeqtUcpsiNativeUtils_generateQuery
  (JNIEnv *, jclass, jbyteArray, jbyteArray, jbyteArray, jobjectArray);

/*
 * Class:     edu_alibaba_mpc4j_s2pc_upso_ucpsi_sj23_peqt_Sj23PeqtUcpsiNativeUtils
 * Method:    decodeReply
 * Signature: ([B[B[B)[J
 */
JNIEXPORT jlongArray JNICALL Java_edu_alibaba_mpc4j_s2pc_upso_ucpsi_sj23_peqt_Sj23PeqtUcpsiNativeUtils_decodeReply
  (JNIEnv *, jclass, jbyteArray, jbyteArray, jbyteArray);

#ifdef __cplusplus
}
#endif
#endif
