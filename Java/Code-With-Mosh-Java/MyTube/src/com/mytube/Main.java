package com.mytube;

public class Main {

    public static void main(String[] args) {
        var video = new Video();
        video.setFileName("birthday.mp4");
        video.setTitle("Jennifer's birthday");
        video.setUser(new User("john@domain.com"));

        // command + B 直接到这个定义的地方
        var processor = new VideoProcessor(
                new XVideoEncoder(),
                new XVideoDatabase(),
                new XEmailService()
        );
    }
}
