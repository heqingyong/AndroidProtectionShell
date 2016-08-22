LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)
LOCAL_LDLIBS :=-llog
LOCAL_MODULE := Security
LOCAL_SRC_FILES := club_younge_jni_Security.cpp
LOCAL_SRC_FILES += Security.cpp
include $(BUILD_SHARED_LIBRARY)