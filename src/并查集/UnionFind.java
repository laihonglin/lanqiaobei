package 并查集;

import java.util.Collection;
import java.util.HashMap;

public class UnionFind {
    public static class Node {
        int val;
    }

    private HashMap<Node, Node> fatherMap;
    private HashMap<Node, Integer> rankMap;

    public UnionFind() {
        fatherMap = new HashMap<>();
        rankMap = new HashMap<>();
    }

    private Node findFather(Node n) {
        Node father = fatherMap.get(n);
        if (father != n) {
            father = findFather(father);
        }
        fatherMap.put(n, father);
        return father;
    }

    public void makeSets(Collection<Node> nodes) {
        fatherMap.clear();
        rankMap.clear();
        for (Node node : nodes) {
            fatherMap.put(node, node);
            rankMap.put(node, 1);
        }
    }

    public boolean isSameSet(Node a, Node b) {
        return findFather(a) == findFather(b);
    }

    public void union(Node a, Node b) {
        if (a == null || b == null) {
            return;
        }
        Node aFather = findFather(a);
        Node bFather = findFather(b);
        if (aFather != bFather) {
            int aFrank = rankMap.get(aFather);
            int bFrank = rankMap.get(bFather);
            if (aFrank <= bFrank) {
                fatherMap.put(aFather, bFather);
                rankMap.put(bFather, aFrank + bFrank);
            } else {
                fatherMap.put(bFather, aFather);
                rankMap.put(aFather, aFrank + bFrank);
            }
        }
    }
}
