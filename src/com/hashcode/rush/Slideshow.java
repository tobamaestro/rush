package com.hashcode.rush;

import java.util.List;

public class Slideshow {

    private int score;
    private List<Slide> slides;

    public Slideshow(int score, List<Slide> slides) {
        this.score = score;
        this.slides = slides;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public List<Slide> getSlides() {
        return slides;
    }

    public void setSlides(List<Slide> slides) {
        this.slides = slides;
    }
}
