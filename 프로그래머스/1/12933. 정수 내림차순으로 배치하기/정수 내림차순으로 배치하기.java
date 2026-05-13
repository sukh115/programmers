import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String a = Long.toString(n);
        
        char[] b = a.toCharArray();
        
        Arrays.sort(b);
        
        StringBuilder c = new StringBuilder(new String(b)).reverse();
        
        return Long.parseLong(c.toString());
    }
}