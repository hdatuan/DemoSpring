package com.cybersoft.demoSpring.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post")
public class PostControlller {
        /**
         * 2 loại truyền tham số
         * - Trực tiếp trên url
         *      - Query param : tham số truyền trực tiếp trên url ?key=value&key=value (GET)
         *      - PathVariable : đóng vai trò là một đường dẫn /post/business
         * - Truyền ngầm : POST, PUT, DELETE
         *
         *
         * @RequestParam : quy định tham số client bắt buộc (mặc định ) phải truyền lên
         *
         *
         */

    @GetMapping
    public ResponseEntity<String> getPost() {


        return ResponseEntity.ok("Hello Restful API");
    }

}
