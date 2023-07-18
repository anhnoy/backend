package com.iamnbty.training.backend.business;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class ProductBusiness {
    public String getProductById(String id) {
        // Todo: get data from database
        return id;

    }
}
