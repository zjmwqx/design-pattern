package com.jiminzhou.observer.advice;

public class ActivityMessage {
    public String getContent() {
        return content;
    }

    private String content = null;

    public void setContent(String content) {
        this.content = content;
    }

    public ActivityMessage(String content) {
        this.content = content;
    }
}
