package com.example.testrestservice.service;

import com.example.testrestservice.model.Response;

public class ModifyUid implements MyModifyService {
    @Override
    public Response modify(Response response) {

        response.setUid("New Uid");
        return response;
    }
}