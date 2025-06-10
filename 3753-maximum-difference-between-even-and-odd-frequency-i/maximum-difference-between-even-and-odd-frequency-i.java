class Solution {
    public int maxDifference(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        List<Integer> oddFreqs = new ArrayList<>();
        List<Integer> evenFreqs = new ArrayList<>();
        for (int freq : freqMap.values()) {
            if (freq % 2 == 1) {
                oddFreqs.add(freq);
            } else {
                evenFreqs.add(freq);
            }
        }

        int maxDiff = Integer.MIN_VALUE;
        for (int odd : oddFreqs) {
            for (int even : evenFreqs) {
                maxDiff = Math.max(maxDiff, odd - even);
            }
        }

        return maxDiff;
    }
}
