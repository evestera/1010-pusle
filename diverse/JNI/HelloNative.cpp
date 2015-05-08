#include <jni.h>
#include <iostream>
#include "HelloNative.h"
using namespace std;

JNIEXPORT void JNICALL
Java_HelloNative_nativeHello(JNIEnv *env, jclass cl) {
    cout << "Oh JNI, how cumbersome you are!\n";
    return;
}

JNIEXPORT jint JNICALL
Java_HelloNative_nativeMethod(JNIEnv *env, jobject obj) {
	cout << "Hello object!\n";
	return 5;
}

JNIEXPORT jint JNICALL
Java_HelloNative_adder(JNIEnv *env, jclass cl, jint a, jint b) {
	return a + b;
}