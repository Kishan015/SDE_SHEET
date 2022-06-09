
class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
      int n = arr.length;
        
        
      int[] xor = new int[n];
       xor[0] = arr[0];
        
        for(int i = 1; i< n; i++)
         xor[i] = xor[i-1] ^ arr[i];        
        int size = queries.length; 
        int[] res = new int[size];
        
        

      for (int i = 0; i < size; i++) {
        int start = queries[i][0];
          int end = queries[i][1];
          
          if(start==0)
              res[i] = xor[end];
          else
              res[i] = xor[end] ^ xor[start -1];
      }
      return res;
    }
}
