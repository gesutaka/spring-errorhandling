package com.relation2012.sample;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * Created by kitagawa on 2017/07/24.
 */
@JsonSerialize
public class ErrorResponse {
    private String message;

    public ErrorResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
