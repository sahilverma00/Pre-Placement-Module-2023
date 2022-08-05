 class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
      if(nums==null || nums.length < 3) return 0;
 		int res = 0;
 		int slow = 0, fast = 1;
 		int diff = nums[fast] - nums[slow];
 		fast++; // fast = 2 now.
 		for(; fast < nums.length; fast++){
 			if(nums[fast] - nums[fast - 1] == diff){
 				if(fast - slow + 1 >= 3){
 					res += fast - 2 - slow + 1;
 				}
 				continue;
 			}else{   // diff changes
 				slow = fast - 1;
 				diff = nums[fast] - nums[fast - 1];
 			}
 		}
 		return res;
    }
}