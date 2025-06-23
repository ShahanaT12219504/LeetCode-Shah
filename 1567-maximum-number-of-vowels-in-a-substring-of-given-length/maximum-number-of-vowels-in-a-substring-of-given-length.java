class Solution {
    public int maxVowels(String s, int k) {
        int l = 0;
        int r = 0;

        int countVow = 0;
        int ans=0;

        while (r < s.length()) {
            char ch = s.charAt(r);
            if (isVowel(ch))
                countVow++;

            if (r - l + 1 == k) {
                ans = Math.max(ans, countVow);

                char ch2 = s.charAt(l);
                if (isVowel(ch2))
                    countVow--;
                l++;
                r++;

            } else
                r++;
        }

        return ans;
    }

    public boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            return true;
        else
            return false;
    }
}