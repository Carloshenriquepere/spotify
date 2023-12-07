package com.my_exercise.spotify.controller;

import com.my_exercise.spotify.client.AuthSpotifyClient;
import com.my_exercise.spotify.client.GoogleClient;
import com.my_exercise.spotify.client.LoginRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spotify/api")
public class AlbumController {

    private final AuthSpotifyClient authSpotifyClient;

    public AlbumController(AuthSpotifyClient authSpotifyClient) {
        this.authSpotifyClient = authSpotifyClient;
    }

    @GetMapping("/albums")
    public ResponseEntity<String> helloWord(){
        var request = new LoginRequest(
                "client_credentials",
                "03d97f5e81a0439a8fe692d94b32c0cc",
                "1a9633be3a394d7e821f9d3c6b6327f6"
        );
        return ResponseEntity.ok(authSpotifyClient.login(request).getAccessToken());
    }
}
