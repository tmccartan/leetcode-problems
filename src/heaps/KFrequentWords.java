package heaps;

import java.util.*;

public class KFrequentWords {

    /*
    *
    * Given a non-empty list of words, return the k most frequent elements.

    Your answer should be sorted by frequency from highest to lowest. If two words have the same frequency, then the word with the lower alphabetical order comes first.

    Example 1:
    Input: ["i", "love", "leetcode", "i", "love", "coding"], k = 2
    Output: ["i", "love"]
    Explanation: "i" and "love" are the two most frequent words.
        Note that "i" comes before "love" due to a lower alphabetical order.
    * */
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        List<String> freqWords = new ArrayList<String>();

        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        Queue<String> heap = new PriorityQueue<String>(
                (n1, n2) -> map.get(n1).equals(map.get(n2)) ?
                        n2.compareTo(n1) : map.get(n1) - map.get(n2));

        for (String word : map.keySet()) {
            heap.offer(word);
            if (heap.size() > k) {
                heap.poll();
            }
        }

        while (!heap.isEmpty()) {
            freqWords.add(heap.poll());
        }
        Collections.reverse(freqWords);

        return freqWords;
    }
}
