public class example1 {
    public static void main(String[] args) {
        String str = "the sky is blue";
        System.out.println(str);
        String result = Solution.reverseWords(str);
        System.out.println(result);
    }
}

class Solution {
    public static String reverseWords(String str) {
        String[] words = str.split(" ");
        String ans = "";
        for (int i = words.length - 1; i >= 0; i--) {
            if (words[i] != " ") {
                ans += words[i] + " ";
            }
        }
        return ans;
    }
}