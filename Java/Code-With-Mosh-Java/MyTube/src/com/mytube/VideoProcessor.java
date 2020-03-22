package com.mytube;

public class VideoProcessor {
    // tightly coupled
    public VideoProcessor(VideoEncoder encoder, VideoDatabase database, XEmailService emailService) {
        this.encoder = encoder;
        this.database = database;
        this.emailService = emailService;
    }

    private VideoEncoder encoder;
    private VideoDatabase database;
    private XEmailService emailService;

    public void process(Video video) {
        encoder.encode(video);
        database.store(video);
        emailService.sendEmail(video.getUser());
    }
}

