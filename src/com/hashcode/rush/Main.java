package com.hashcode.rush;

import org.apache.commons.lang.ArrayUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws Exception {
//        FileReader fr = new FileReader("a_example.txt");
//        FileReader fr = new FileReader("b_lovely_landscapes.txt");
//        FileReader fr = new FileReader("c_memorable_moments.txt");
//        FileReader fr = new FileReader("d_pet_pictures.txt");
        FileReader fr = new FileReader("e_shiny_selfies.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        int lineCounter = -1;
        int nPhotos;
        List<Photo> photos = new ArrayList<>();

        while ((line = br.readLine()) != null) {
            lineCounter++;
            if (lineCounter == 0) {
                nPhotos = Integer.valueOf(line);
                continue;
            }
            String[] splitItems = line.split(" ");
            String[] tagsArray = (String[]) ArrayUtils.subarray(splitItems, 2, splitItems.length);
            Set<String> tags = new HashSet<>(Arrays.asList(tagsArray));

            photos.add(new Photo(lineCounter - 1, splitItems[0], tags));
        }

//        for (Photo p : photos) {
//            System.out.println(p.toString());
//        }

        List<Slide> allSlides = createAllSlides(photos);

    }

    private static List<Slide> createAllSlides(List<Photo> photos) {
        List<Slide> slides = new ArrayList<>();
        for (Photo currentPhoto : photos) {
            if ("H".equals(currentPhoto.getOrientation())) {
                slides.add(new Slide(Collections.singletonList(currentPhoto), currentPhoto.getTags()));
                continue;
            }
            List<Photo> remainingPhotos = photos.subList(photos.indexOf(currentPhoto), photos.size());
            for (Photo vertPhoto : remainingPhotos) {
                if ("V".equals(vertPhoto.getOrientation())) {
                    List<Photo> slidePhotos = new ArrayList<>();
                    slidePhotos.add(currentPhoto);
                    slidePhotos.add(vertPhoto);

                    Set<String> slideTags = new HashSet<>();
                    slideTags.addAll(currentPhoto.getTags());
                    slideTags.addAll(vertPhoto.getTags());
                    slides.add(new Slide(slidePhotos, slideTags));
                }
            }
        }
        return slides;
    }

    public static int transitionScore(Slide s1, Slide s2) {
        int score = 0;
        int presek;
        for (Photo p : s1.getPhotos()) {
        }

        return score;
    }
}
