class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int diff[] = new int[nums.length+1];
        Arrays.fill(diff , 0);
        for(int i = 0;i<queries.length;i++){
            int l = queries[i][0];
            int r = queries[i][1];
            diff[l]+=1;
            if(r+1<nums.length){
                diff[r+1] -= 1;
            }
        }
        int c = 0;
        for(int i = 0;i<nums.length;i++){
            c+= diff[i];
            if(c< nums[i]){
                return false;
            }
        }
        return true;
    }
}