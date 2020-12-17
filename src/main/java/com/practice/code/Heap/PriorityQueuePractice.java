package com.practice.code.Heap;

import java.util.*;

public class PriorityQueuePractice {
    public static List<String> topKFrequent(String[] words, int k) {

        Map<String, Integer> count = new HashMap();
        for (String word : words) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }

        PriorityQueue<String> heap = new PriorityQueue<String>(
                (w1, w2) -> count.get(w1).equals(count.get(w2)) ?
                        w2.compareTo(w1) : count.get(w1) - count.get(w2));

        for (String word : count.keySet()) {
            heap.offer(word);
            if (heap.size() > k) heap.poll();
        }

        List<String> ans = new ArrayList();
        while (!heap.isEmpty()) ans.add(heap.poll());
        Collections.reverse(ans);
        return ans;
    }

    public static void main(String[] args) {
//        String[] str = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
//        List<String> kFrequent = topKFrequent(str, 3);
//        kFrequent.forEach(System.out::println);

        int[] num1 = {1, 2, 7, 11};
        int[] num2 = {2, 3, 4, 6};
        kSmallestPairs(num1, num2, 3);

    }

    private static List<List<Integer>> kSmallestPairs(int[] num1, int[] num2, int k) {
        List<List<Integer>> results = new ArrayList<>();
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        heap.add(2);
        heap.add(15);
        heap.add(2);
        heap.add(17);
        System.out.println(heap.poll());
        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num2.length; j++) {
                int sum = num1[i] + num2[j];

                if (heap.size() < k) {
                    heap.offer(sum);
                } else if (heap.size() >= k && heap.peek() > sum) {
                    heap.poll();
                    heap.offer(sum);
                } else if (heap.size() >= k && heap.peek() < sum) {
                    break;
                }
            }
        }
        return results;
    }
}
