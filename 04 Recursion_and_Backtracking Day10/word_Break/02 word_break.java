class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        
        for (int lo = 1; lo <= n; lo++) {
            if (!dp[lo - 1]) continue;
            for (String word : wordDict) {
                int hi = lo - 1 + word.length();
                if (hi <= n && s.substring(lo - 1, hi).equals(word)) {
                    dp[hi] = true;
                }
            }
        }
        
        return dp[n];
    }
}
