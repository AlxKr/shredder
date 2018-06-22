package com.shredder.node;

import com.shredder.edge.IEdge;

import java.util.ArrayList;
import java.util.HashSet;

public class ColumnNode implements INode {

    private ArrayList<Node> nodes = new ArrayList<Node>();

    private HashSet<IEdge> edges = new HashSet();

    public void addNode(Node node) {
        nodes.add(node);
    }

    public ArrayList<Node> getNodes() {
        return nodes;
    }

    @Override
    public ArrayList<IEdge> getSortedEdges() {
        return new ArrayList<IEdge>(edges);
    }

    @Override
    public boolean isValid() {
        return false;
    }

    @Override
    public void print() {

    }

    @Override
    public boolean fillEdges(ArrayList<ColumnNode> columnNodes) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public INode getFirstNode() {
        if (nodes.size() > 0) {
            return nodes.get(0);
        }
        return null;
    }

    @Override
    public INode getLastNode() {
        if (nodes.size() > 0) {
            return nodes.get(nodes.size() - 1);
        }

        return null;
    }

    @Override
    public char getLetter(int vertPos, int horizPos) {
        if (nodes.size() <= vertPos) {
            return 0;
        }

        return nodes.get(vertPos).getLetter(vertPos,horizPos);
    }

    @Override
    public String toString() {
        return nodes.toString();
    }
}
