package main.java.Tries;

import java.util.HashMap;
import java.util.Map;

class TrieIINode {
    private final Map<Character, TrieIINode> map;
    public int prefixCount;
    public int endCount;

    public TrieIINode() {
        this.map = new HashMap<>();
        this.prefixCount = 0;
        this.endCount = 0;
    }

    public TrieIINode getOrModify(char c) {
        TrieIINode next = map.computeIfAbsent(c, k -> new TrieIINode());
        next.prefixCount++;
        return next;
    }

    public TrieIINode get(char c) {
        return map.get(c);
    }
}

public class TrieII {
    private final TrieIINode root;

    public TrieII() {
        this.root = new TrieIINode();
    }

    public void insert(String word) {
        TrieIINode currNode = root;

        for (int i = 0; i < word.length(); i++) {
            currNode = currNode.getOrModify(word.charAt(i));
        }

        currNode.endCount++;
    }

    public int countWordEqualTo(String word) {
        TrieIINode currNode = root;

        for (int i = 0; i < word.length() && currNode != null; i++) {
            currNode = currNode.get(word.charAt(i));
        }

        return currNode == null ? 0 : currNode.endCount;
    }

    public int countStartingWith(String prefix) {
        TrieIINode currNode = root;

        for (int i = 0; i < prefix.length() && currNode != null; i++) {
            currNode = currNode.get(prefix.charAt(i));
        }

        return currNode == null ? 0 : currNode.prefixCount;
    }

    public void erase(String word) {
        TrieIINode currNode = root;
        TrieIINode[] visited = new TrieIINode[word.length()];

        for (int i = 0; i < word.length(); i++) {
            currNode = currNode.get(word.charAt(i));

            if (currNode == null) {
                for (int j = 0; j < i; j++) {
                    visited[j].prefixCount++;
                }
                return;
            }

            currNode.prefixCount--;
            visited[i] = currNode;
        }

        if (currNode.endCount == 0) {
            for (TrieIINode node : visited) {
                node.prefixCount++;
            }
            return;
        }

        currNode.endCount--;
    }
}