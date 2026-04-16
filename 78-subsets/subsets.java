
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), result);
        return result;
    }
    
    public void backtrack(int[] nums, int start, List<Integer> current, List<List<Integer>> result) {
        // Add current subset
        result.add(new ArrayList<>(current));
        
        for (int i = start; i < nums.length; i++) {
            // include nums[i]
            current.add(nums[i]);
            
            // recurse with next index
            backtrack(nums, i + 1, current, result);
            
            // backtrack (remove last element)
            current.remove(current.size() - 1);
        }
    }
}

