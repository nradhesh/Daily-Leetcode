class Solution {
    public int longestPalindrome(String[] words) {
        HashMap<String , Integer> map = new HashMap<>();
        for(String x : words){
            map.put(x ,  map.getOrDefault(x , 0) + 1);
        }
        int ans = 0;
        boolean used = false;

        for(String x : map.keySet()){
            String rev = new StringBuilder(x).reverse().toString();
            if(!x.equals(rev) && map.containsKey(rev)){
                int pairs = Math.min(map.get(x), map.get(rev));
                ans += pairs * 4;
                map.put(x, map.get(x) - pairs);
                map.put(rev, map.get(rev) - pairs);
            }
        }

        for(String x : map.keySet()){
            if(x.charAt(0) == x.charAt(1)){
                int count = map.get(x);
                ans += (count / 2) * 4;
                if(count % 2 == 1 && !used){
                    ans += 2;
                    used = true;
                }
            }
        }

        return ans;
    }
}
