package com.hashcode.rush;

import java.util.List;

public class Slide {

    private List<Photo> photos;

    public Slide(List<Photo> photos) {
        this.photos = photos;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }
}
