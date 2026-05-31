class Solution {
    public int[] getConcatenation(int[] nums) {
        
            // 1. calculate n
        // 2. create ans array
        // 3. fill ans with your loop
        // 4. return ans
        int n = nums.length;
        int[] ans = new int[2 * n];
        
        for(int i = 0; i < 2 * n; i++){
            ans[i] = nums[i % n];
        }

        return ans;
    }
}
