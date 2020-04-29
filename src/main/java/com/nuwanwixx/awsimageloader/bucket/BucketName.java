package com.nuwanwixx.awsimageloader.bucket;

public enum BucketName {

    PROFILE_IMAGE("nuwanwixx-image-upload");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
