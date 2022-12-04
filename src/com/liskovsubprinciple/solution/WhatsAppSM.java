package com.liskovsubprinciple.solution;

public class WhatsAppSM implements SocialMedia,SocialVideoCallManager{



    // public void groupVideoCall(String user) this mtd  support by whatsapp but not the public void publishPost(Object post)

    @Override
    public void chatWithFriends() {

    }

    @Override
    public void sendPhotoAndVideos() {

    }

    @Override
    public void groupVideoCall(String user) {

    }
}
