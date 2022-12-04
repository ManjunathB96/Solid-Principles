package com.liskovsubprinciple;

public class FaceBook extends SocialMedia{

    //FaceBook is the substitute of  SocialMedia bcz parent class  can be replaced to the facebook
    //all the features of parent and child classes  are substitute to each other

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
    public void groupVideoCall(String user) {

    }
}
