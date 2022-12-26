package com.samlocal;

import java.io.Serializable;

public class Request implements Serializable {

    private String body;

    public Request(){}

    public String getBody() {
        return this.body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
