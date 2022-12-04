package com.liskovsubprinciple;

public abstract class SocialMedia {

    //Liskov substitution principle: states that derived types
    // must be completely substitutable for their base types


    public abstract  void chatWithFriends();

    public abstract  void publishPost(Object post);

    public abstract  void sendPhotoAndVideos();

    public abstract  void groupVideoCall(String user);

}
