package com.hashcode.rush;

import java.util.HashSet;
import java.util.Set;

public class Graph {

    private Set<Slide> nodes = new HashSet<>();

    public void addSlides(Slide nodeA) {
        nodes.add(nodeA);
    }

    public Set<Slide> getNodes() {
        return nodes;
    }

    public void setNodes(Set<Slide> nodes) {
        this.nodes = nodes;
    }
}
