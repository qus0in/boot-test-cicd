package org.example.boottestcicd.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/fishcake")
public class FishCakeController {
    @GetMapping
    public ResponseEntity<List<FishCake>> list() {
        List<FishCake> fishCakes = List.of(new FishCake("루비"), new FishCake("아유무"), new FishCake("시키"), new FishCake("민나"));
        return ResponseEntity.ok(fishCakes);
    }

//    public record FishCake(String shape) {}
    public record FishCake(String shape) {}
}