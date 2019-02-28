package com.hashcode.rush;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Slide {

    private List<Photo> photos;
    private Integer distance;
    private List<Slide> shortestPath;
    private List<String> tags;
    private Map<Slide, Integer> transitions;

    public Slide(List<Photo> photos) {
        this.photos = photos;
        this.distance = Integer.MAX_VALUE;
        this.transitions = new HashMap<>();
        this.tags = new ArrayList<>();
        this.shortestPath = new LinkedList<>();
    }

    public Slide(List<Photo> photos, List<String> tags) {
        this.photos = photos;
        this.tags = tags;
        this.distance = Integer.MAX_VALUE;
        this.transitions = new HashMap<>();
        this.shortestPath = new LinkedList<>();
    }

    public Slide(List<Photo> photos, Integer distance, List<Slide> shortestPath, List<String> tags, Map<Slide, Integer> transitions) {
        this.photos = photos;
        this.distance = distance;
        this.shortestPath = shortestPath;
        this.tags = tags;
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

    public List<Slide> getShortestPath() {
        return shortestPath;
    }

    public void setShortestPath(List<Slide> shortestPath) {
        this.shortestPath = shortestPath;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
