import java.util.HashSet;
import java.util.Set;

class LongestSubstringWithoutRepetition {

    public int result(String str) {

        Set<Character> set = new HashSet<>();
        int left = 0;
        int res = 0;

        for (int right = 0; right < str.length(); right++) {

            char ch = str.charAt(right);

            while (set.contains(ch)) {
                set.remove(str.charAt(left));
                left++;
            }

            set.add(ch);

            int length = right - left + 1;
            res = Math.max(res, length);
        }

        return res;
    }

    public static void main(String[] args) {

        String str = "abcabcbb";

        LongestSubstringWithoutRepetition obj =
                new LongestSubstringWithoutRepetition();

        System.out.println(obj.result(str));
    }
}