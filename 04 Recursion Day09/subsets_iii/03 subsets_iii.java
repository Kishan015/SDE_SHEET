
class Solution {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> subset = new ArrayList();
        dfs(subset,0,nums,new ArrayList());
        return subset;  
    }   
    
     void dfs( List<List<Integer>> subset,int index,int[] nums,List<Integer> current){
                subset.add(new ArrayList(current));
                for(int i=index;i<nums.length;i++){
                    if(i>index && nums[i]==nums[i-1])continue;  
                    current.add(nums[i]);
                    dfs(subset,i+1,nums, current);
                    current.remove(current.size()-1);           
                } 
    }

}

  
  
