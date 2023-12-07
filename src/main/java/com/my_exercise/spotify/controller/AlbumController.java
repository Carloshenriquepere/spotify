package com.my_exercise.spotify.controller;

import com.my_exercise.spotify.client.GoogleClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spotify/api")
public class AlbumController {

    private final GoogleClient googleClient;

    public AlbumController(GoogleClient googleClient) {
        this.googleClient = googleClient;
    }

    @GetMapping("/albums")
    public ResponseEntity<String> helloWord(){
        return ResponseEntity.ok(googleClient.helloWord());
    }
}
