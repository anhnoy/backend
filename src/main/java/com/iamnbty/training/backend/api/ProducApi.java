package com.iamnbty.training.backend.api;


import com.iamnbty.training.backend.business.ProductBusiness;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProducApi {

    private  final ProductBusiness business;

    public ProducApi(ProductBusiness business) {
        this.business = business;
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getProducById(@PathVariable("id") String id) {
       String response = business.getProductById(id);
        return ResponseEntity.ok(response);
    }
}
