class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int n = bits.length;
        for(int i = 0;i<bits.length;i++){
            System.out.println(bits[i]);
            if(bits[i] == 1){
                i+=1;
            }else if(bits[i] == 0 && i == n-1){
                return true;
            }
        }
        return false;
    }
}