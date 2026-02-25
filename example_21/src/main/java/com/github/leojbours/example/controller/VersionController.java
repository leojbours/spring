package com.github.leojbours.example.controller;

import com.github.leojbours.example.versioning.MediaVersion;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/new")
public class VersionController {

    @GetMapping(value = "/{version}/hello", version = "v1")
    public ResponseEntity<String> getHelloPathV1() {
        return ResponseEntity.ok( "Hello new v1" );
    }

    @GetMapping(value = "/{version}/hello", version = "v2")
    public ResponseEntity<String> getHelloPathV2() {
        return ResponseEntity.ok( "Hello new v2" );
    }

    @GetMapping(path = "/hello", version = "v1")
    public ResponseEntity<String> getHelloHeadersV1() {
        return ResponseEntity.ok( "Hello new v1" );
    }

    @GetMapping(path = "/hello", version = "v2")
    public ResponseEntity<String> getHelloHeadersV2() {
        return ResponseEntity.ok( "Hello new v2" );
    }
}
