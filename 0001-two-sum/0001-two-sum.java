class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map <Integer,Integer> num =new HashMap<>();
        for(int i=0;i<nums.length;i++){
            Integer numIndex = num.get(nums[i]);
            if(numIndex != null){
                return new int[]{i,numIndex};
            }
            num.put(target - nums[i] , i);
        }

     return nums;   
    }
    
}