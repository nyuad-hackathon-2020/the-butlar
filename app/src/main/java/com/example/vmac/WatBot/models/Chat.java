package com.example.vmac.WatBot.models;

import java.util.Date;

public class Chat {
    String request;
    String response;
    Date date;

    public Chat(String request, String response, Date date) {
        this.request = request;
        this.response = response;
        this.date = date;
    }

    public Chat() {
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
