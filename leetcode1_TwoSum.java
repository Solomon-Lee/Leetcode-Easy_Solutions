/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
* 
*/

class Solution {
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		int[] res = new int[2];
		
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])) {
				res[0] = i;
				res[1] = map.get(target - nums[i]);
			} else
				map.put(nums[i], i);
		}
		
		return res;
	}
}

/*
 * Create a hashmap to implement a one pass solution which gives a time complexity of O(n)
 * 
 * Example:
 * 
 * nums = [2, 1, 5, 3]
 * Target = 4
 * 
 * 				HashMap
 * 		Value	   :      Index
 * 
 * At index = 0, 4-2 = 2
 * We check the hashmap to see if it contains the value 2, if it does then we found a solution.
 * If the hashmap does not contain the complement value of 2, then we haven't found a solution so we add 
 * the value and index to our hashmap.
 * 
 * 				HashMap
 * 		Value 	   :	  Index
 * 		  2		   :		0
 * 
 * At index = 1, 4-1 = 3
 * Check if our map contains the value 3, which it doesn't, so we add it to our hashmap.
 * 
 * We continue doing this until we finally reach our solution.
 * 
 * 				HashMap
 * 				  2:0
 * 				  1:1
 * 				  5:2
 * 				  3:3
 * 
 * At index = 3, 4-3 = 1
 * We check the hashmap to see if it contains the value 1. 
 * The hash map does have the value 1 so we get the index where the value 1 is located at 
 * and store it into index 1 of result array since index 0 of result array is filled with the index index of 3.
 * 
 */
 
		
		
