package com.practice.code.array;

import java.util.*;

public class Race {

    private static String raceWinner(int pace, char[][] roads) {
        HashMap<Character, List<Character>> pathMap = new HashMap<>();
        for (char[] path : roads) {
            if (pathMap.containsKey(path[0])) {
                pathMap.get(path[0]).add(path[1]);
            } else {
                List<Character> newPath = new ArrayList<>();
                newPath.add(path[1]);
                pathMap.put(path[0], newPath);
            }
        }
        pathMap.put('H', new ArrayList<>());
        int distanceForF = getDistance(pathMap, 'F', 'H');
        int distanceForY = getDistance(pathMap, 'Y', 'H');
        int paceOfY = distanceForY * pace;
        if (distanceForF < 0 && paceOfY > 0) return "YOU WIN";
        else if (distanceForF > 0 && paceOfY < 0) return "FRIEND WINS";
        if (paceOfY < distanceForF) return "You WIN";
        return "Friend";
    }

    private static Integer getDistance(HashMap<Character, List<Character>> pathMap, char f, char h) {
        Map<Character, Integer> dist = new HashMap<>();
        BFS(pathMap, f, h, dist);
        if (!dist.containsKey(h)) return -1;
        return dist.get(h);
    }

    private static void BFS(HashMap<Character, List<Character>> pathMap, char src, char dest, Map<Character, Integer> dist) {
        Queue<Character> queue = new LinkedList<>();
        Map<Character, Boolean> visited = new HashMap<>();
        for (Character c : pathMap.keySet()) {
            visited.put(c, false);
        }

        visited.put(src, true);
        dist.put(src, 0);
        queue.add(src);
        while (!queue.isEmpty()) {
            char u = queue.remove();
            for (int i = 0; i < pathMap.get(u).size(); i++) {
                Character c = pathMap.get(u).get(i);
                if (visited.containsKey(c) && !visited.get(c)) {
                    visited.put(c, true);
                    dist.put(c, dist.get(u) + 1);
                    queue.add(c);
                    if (c == dest)
                        return;
                }
            }
        }
    }

    public static void main(String[] args) {
        char[][] path = {{'H', 'U'},
                {'C', 'E'},
                {'I', 'G'},
                {'J', 'K'},
                {'L', 'F'},
                {'A', 'B'},
                {'Y', 'A'},
                {'B', 'H'},
                {'U', 'E'},
                {'C', 'I'},
                {'G', 'J'},
                {'K', 'L'},
                {'F', 'Q'},
                {'B', 'N'},
                {'F', 'Z'},
                {'N', 'O'},
                {'C', 'O'},
                {'X', 'R'},
                {'P', 'G'},
                {'X', 'P'},
                {'L', 'R'},
                {'R', 'Z'},
                {'Q', 'Z'}};
        System.out.println(raceWinner(1, path));

    }
}
