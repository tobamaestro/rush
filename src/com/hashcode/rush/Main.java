package com.hashcode.rush;

import org.apache.commons.lang.ArrayUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("a_example.txt");
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
            List<String> tags = Arrays.asList(tagsArray);

            photos.add(new Photo(lineCounter - 1, splitItems[0], tags));
        }

        for (Photo p : photos) {
            System.out.println(p.toString());
        }
    }

    public static int transitionScore(Slide s1, Slide s2) {
        int score = 0;
        int presek;
        for (Photo p : s1.getPhotos()) {
        }

        return score;
    }
}
