#include <stdio.h>
#include <stdlib.h>
#include<android/log.h>
#include "club_younge_jni_Security.h"
#include "Security.h"

#define TAG  "younge-jni" // // 这个是自定义的LOG的标识
#define LOGD(...)  __android_log_print(ANDROID_LOG_DEBUG, TAG, __VA_ARGS__) //


Security *pSecurity = NULL;
JNIEXPORT jbyteArray JNICALL Java_club_younge_jni_Security_decrypt(JNIEnv *env, jobject object, jbyteArray data){
	if(pSecurity == NULL){
		pSecurity = new Security;
	}
	jbyte* temp = (jbyte*)env->GetByteArrayElements(data, 0);
	jsize len = env->GetArrayLength(data);
	for(int i=0; i<len; i++){
		*(temp + i) = *(temp + i) ^ 42;
		//LOGD("------data byte: -----%c --- %c ", *(temp + i), dataa[i]);
	}
	//LOGD("------data: -----%s", temp);
	jbyteArray result = env->NewByteArray(len);
	env->SetByteArrayRegion(result, 0, len, temp);
	return result;
}

JNIEXPORT void JNICALL Java_club_younge_jni_Security_destroy(JNIEnv *env, jobject object){
	if(pSecurity != NULL){
		pSecurity = NULL;
	}
}

JNIEXPORT jint JNICALL Java_club_younge_jni_Security_add(JNIEnv *env, jobject object, jint x, jint y){
	return x + y;
}

