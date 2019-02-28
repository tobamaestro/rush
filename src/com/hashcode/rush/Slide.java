package com.hashcode.rush;

import java.util.List;
import java.util.Map;

public class Slide {

    private List<Photo> photos;
    private Integer distance = Integer.MAX_VALUE;
    private Map<Slide, Integer> transitions;

    public Slide(List<Photo> photos, Integer distance, Map<Slide, Integer> transitions) {
        this.photos = photos;
        this.distance = distance;
        this.transitions = transitions;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Map<Slide, Integer> getTransitions() {
        return transitions;
    }

    public void setTransitions(Map<Slide, Integer> transitions) {
        this.transitions = transitions;
    }
}
