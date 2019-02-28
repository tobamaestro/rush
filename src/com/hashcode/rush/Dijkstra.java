package com.hashcode.rush;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class Dijkstra {

    public static Graph calculateShortestPathFromSource(Graph graph, Slide source) {
        source.setDistance(0);

        Set<Slide> settledSlides = new HashSet<>();
        Set<Slide> unsettledSlides = new HashSet<>();

        unsettledSlides.add(source);

        while (unsettledSlides.size() != 0) {
            Slide currentSlide = getLowestDistanceSlide(unsettledSlides);
            unsettledSlides.remove(currentSlide);
            for (Map.Entry<Slide, Integer> adjacencyPair :
                    currentSlide.getTransitions().entrySet()) {
                Slide adjacentSlide = adjacencyPair.getKey();
                Integer edgeWeight = adjacencyPair.getValue();
                if (!settledSlides.contains(adjacentSlide)) {
                    calculateMinimumDistance(adjacentSlide, edgeWeight, currentSlide);
                    unsettledSlides.add(adjacentSlide);
                }
            }
            settledSlides.add(currentSlide);
        }
        return graph;
    }

    private static Slide getLowestDistanceSlide(Set<Slide> unsettledSlides) {
        Slide lowestDistanceSlide = null;
        int lowestDistance = Integer.MAX_VALUE;
        for (Slide node : unsettledSlides) {
            int nodeDistance = node.getDistance();
            if (nodeDistance < lowestDistance) {
                lowestDistance = nodeDistance;
                lowestDistanceSlide = node;
            }
        }
        return lowestDistanceSlide;
    }

    private static void calculateMinimumDistance(Slide evaluationSlide,
                                                 Integer edgeWeigh, Slide sourceSlide) {
        Integer sourceDistance = sourceSlide.getDistance();
        if (sourceDistance + edgeWeigh < evaluationSlide.getDistance()) {
            evaluationSlide.setDistance(sourceDistance + edgeWeigh);
            LinkedList<Slide> shortestPath = new LinkedList<>(sourceSlide.getShortestPath());
            shortestPath.add(sourceSlide);
            evaluationSlide.setShortestPath(shortestPath);
        }
    }

}
