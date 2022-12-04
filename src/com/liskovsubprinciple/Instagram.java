package com.liskovsubprinciple;

public class Instagram extends SocialMedia{

    //Instagram can not be the substitute of social media bcz both are not in sink
    // (instagram not support groupVideoCall feature)

    @Override
    public void chatWithFriends() {

    }

    @Override
    public void publishPost(Object post) {

    }

    @Override
    public void sendPhotoAndVideos() {

    }

    @Override
    public void groupVideoCall(String user) {           //instagram not support groupVideoCall feature

    }
}
