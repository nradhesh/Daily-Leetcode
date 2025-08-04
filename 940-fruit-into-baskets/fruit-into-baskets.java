class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        if (n <= 2) return n;
        int a = -1, b = -1;
        int lastBCount = 0;
        int currLen = 0, maxLen = 0;
        for (int i = 0; i < n; i++) {
            int fruit = fruits[i];
            if (fruit == a || fruit == b) {
                currLen++;
            } else {
                currLen = lastBCount + 1;
            }
            if (fruit == b) {
                lastBCount++;
            } else {
                a = b;
                b = fruit;
                lastBCount = 1;
            }
            maxLen = Math.max(maxLen, currLen);
        }
        return maxLen;
    }
}