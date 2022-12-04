package com.liskovsubprinciple;

public class WhatsApp extends SocialMedia{

    //whatsapp can not be the substitute of social media bcz both are not in sink
    // (whatsapp not support publishPost feature)

    @Override
    public void chatWithFriends() {

    }

    @Override
    public void publishPost(Object post) {          //whatsapp not support publish post feature
        //this feature is not applicable

    }

    @Override
    public void sendPhotoAndVideos() {

    }

    @Override
    public void groupVideoCall(String user) {

    }
}
