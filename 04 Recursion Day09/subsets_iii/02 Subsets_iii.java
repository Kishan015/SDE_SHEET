class Solution {
   
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
         List<List<Integer>> result = new ArrayList();
        
        
        Arrays.sort(nums);
        subsets(nums,0, new ArrayList(), result);
        return result;  
    }   
    
    
    private void subsets (int[] nums, int start, List<Integer> list, List<List<Integer>> result){
        if(start > nums.length)
            return;
        result.add(list);
        for(int i = start; i< nums.length; i++){
            if(i > start && nums[i]== nums[i-1] )
                continue;
            
            List<Integer> newList = new ArrayList(list);
            newList.add(nums[i]);
            subsets(nums, i+1, newList, result);
        }
    }

}
