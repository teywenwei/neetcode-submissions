class Solution {
    public int majorityElement(int[] nums) {

    // Step 1: create the "boxes"
    HashMap<Integer, Integer> count = new HashMap<>();

    // Step 2: fill the boxes
    for (int i = 0; i < nums.length; i++) {
        count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
    }

    // Step 3: check which box exceeds n/2
    int threshold = nums.length / 2;
    for (int key : count.keySet()) {
        if (count.get(key) > threshold) {
            return key;
        }
    }

    return -1;
    }

}