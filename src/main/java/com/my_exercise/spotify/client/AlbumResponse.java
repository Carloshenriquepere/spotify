package com.my_exercise.spotify.client;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AlbumResponse {

    private AlbumWrapper albums;

    public AlbumResponse() {
    }

    public AlbumResponse(AlbumWrapper albums) {
        this.albums = albums;
    }

    public AlbumWrapper getAlbums() {
        return albums;
    }

    public void setAlbums(AlbumWrapper albums) {
        this.albums = albums;
    }
}
