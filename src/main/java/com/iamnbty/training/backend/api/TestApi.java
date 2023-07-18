package com.iamnbty.training.backend.api;


import com.iamnbty.training.backend.business.TestBusiness;
import com.iamnbty.training.backend.model.MRegisterRequest;
import com.iamnbty.training.backend.model.TestResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/test")
public class TestApi {

    private final TestBusiness business;
    public TestApi(TestBusiness business) {
        this.business = business;
    }

    @GetMapping
    public TestResponse test() {
        TestResponse response = new TestResponse();
        response.setName("nat");
        response.setFood("kfc");

      return response;
    }

    @PostMapping
    @RequestMapping("/register")
    public ResponseEntity<String>  register(@RequestBody MRegisterRequest request){
        String response ;
        try {
            response = business.register(request);
            return ResponseEntity.ok(response);
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).build();
        }

    }

}

