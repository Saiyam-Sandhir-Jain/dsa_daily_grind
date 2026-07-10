package main.java.LeetCode;

import java.util.Map;
import java.util.HashMap;
import java.util.Queue;
import java.util.PriorityQueue;

class Problems {
    public static void topKFrequentWords(String[] words, int k) {
        Map<String, Integer> freqMap = new HashMap<>(words.length);
        for (String s : words) {
            freqMap.put(s, freqMap.getOrDefault(s, 0)+1);
        }

        Queue<Map.Entry<String, Integer>> minHeap = new PriorityQueue<>(k, (a, b) -> { 
                                                                                        if (a.getValue() != b.getValue()) {
                                                                                            return a.getValue()-b.getValue();
                                                                                        } return b.getKey().compareTo(a.getKey());
                                                                                    });
        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            minHeap.offer(entry);

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        } System.out.println();
    }
}

public class Day2 {
    public static void main() {
        System.out.println("Day2 Solutions:-\n");

        // 692. Top K Frequent Words
        {
            System.out.println("692. Top K Frequent Words");
            String[] words = {"the","day","is","sunny","the","the","the","sunny","is","is"};
            int k = 4;
            System.out.printf("The top %d most frequent words are: ", k);
            Problems.topKFrequentWords(words, k);
        }
    }
}
