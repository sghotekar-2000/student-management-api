package com.example.api;

public class MyMessage {
	private String message;

    public MyMessage() {} // Default constructor required for JSON conversion

    public MyMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
