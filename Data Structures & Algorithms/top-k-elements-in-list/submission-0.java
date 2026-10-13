class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        PriorityQueue<FreqOfN> topK = new PriorityQueue<FreqOfN>(k, (f1, f2) -> Integer.compare(f1.count(), f2.count()));
        
        for (int n: nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        for (int key: freq.keySet()) {
            int count = freq.get(key);
            FreqOfN freqOfN = new FreqOfN(key, count);
            if (topK.size() < k) {
                topK.add(freqOfN);
            } else {
                if (count > topK.peek().count()) {
                    topK.poll();
                    topK.add(freqOfN);
                }
            }
        }

        int[] result = new int[k];
        int i = 0;
        while (topK.size() > 0) {
            result[i] = topK.poll().n();
            i++;
        }

        return result;
    }
}

record FreqOfN(int n, int count) {}



