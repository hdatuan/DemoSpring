package com.demoSpring.demoSpring.controller;

import com.demoSpring.demoSpring.entity.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/baiviet")
public class BaiVietController {

    @GetMapping
    public ResponseEntity<String> getBaiViet(@RequestParam String baiViet ) {

        return ResponseEntity.ok( "Insert " + baiViet + " successful");
    }

    @PostMapping
    public ResponseEntity<String> insertBaiViet(@RequestParam String name, @RequestParam String desc ) {
        return ResponseEntity.ok(name + " - " + desc);
    }

    @GetMapping("/{idBaiViet}")
    public ResponseEntity<String> getDetailBaiViet(@PathVariable String idBaiViet) {
        return ResponseEntity.ok("Detail bai viet " + idBaiViet);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Product> deleteBaiViet(@PathVariable long id , @RequestParam String name) {

        Product product = new Product();

        product.setProductId(id);
        product.setProductName(name);

        return ResponseEntity.ok(product);
    }

    @PutMapping
    ResponseEntity<Product> updateBaiViet(@RequestBody Product product){

        return ResponseEntity.ok(product);
    }

}
