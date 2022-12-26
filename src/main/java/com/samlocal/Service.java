package com.samlocal;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Service {

    public static Response getResponse(Request input) {
        Response response = new Response();

        ObjectMapper mapper = new ObjectMapper();

        try {
            BasicUserInfo basicUserInfo = mapper.readValue(input.getBody(), BasicUserInfo.class);
            response.setBody(basicUserInfo.toString());
            response.setStatusCode(200);
        } catch (JsonProcessingException e) {
            response.setBody(e.getMessage());
            response.setStatusCode(500);
        }

        return response;
    }
}
