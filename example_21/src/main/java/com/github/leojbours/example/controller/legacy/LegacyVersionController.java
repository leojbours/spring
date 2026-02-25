package com.github.leojbours.example.controller.legacy;

import com.github.leojbours.example.versioning.MediaVersion;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LegacyVersionController {

    @GetMapping("/v1/hello")
    public ResponseEntity<String> getHelloPathV1() {
        return ResponseEntity.ok( "Hello v1" );
    }

    @GetMapping("/v2/hello")
    public ResponseEntity<String> getHelloPathV2() {
        return ResponseEntity.ok( "Hello v2" );
    }

    @GetMapping(path ="/hello", params = "version=1")
    public ResponseEntity<String> getHelloQueryV1() {
        return ResponseEntity.ok( "Hello v1" );
    }

    @GetMapping(path = "/hello", params = "version=2")
    public ResponseEntity<String> getHelloQueryV2() {
        return ResponseEntity.ok( "Hello v2" );
    }

    @GetMapping(path = "/hello", headers = "API-VERSION=1")
    public ResponseEntity<String> getHelloHeadersV1() {
        return ResponseEntity.ok( "Hello v1" );
    }

    @GetMapping(path = "/hello", headers = "API-VERSION=2")
    public ResponseEntity<String> getHelloHeadersV2() {
        return ResponseEntity.ok( "Hello v2" );
    }

    @GetMapping(path = "/hello", produces = MediaVersion.V1)
    public ResponseEntity<String> getHelloMediaTypeV1() {
        return ResponseEntity.ok( "Hello v1" );
    }

    @GetMapping(path = "/hello", produces = MediaVersion.V2)
    public ResponseEntity<String> getHelloMediaTypeV2() {
        return ResponseEntity.ok( "Hello v2" );
    }
}
