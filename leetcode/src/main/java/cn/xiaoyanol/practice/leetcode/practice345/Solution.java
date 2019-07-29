package cn.xiaoyanol.practice.leetcode.practice345;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: chenyanfeng
 * @Date: 2019-05-18
 * @Time: 下午1:16
 */
public class Solution {
    //是将元音序列反转
    // 元音包括a，e，i，o，u，A，E，I，O，U
    public String reverseVowels(String s) {
        if (s == null ) {
            return null;
        }
        int i = 0;
        int j = s.length() - 1;
        char[] chars = s.toCharArray();
        while (i < j) {
            while (!isVowel(chars[i]) && i < j) {
                i++;
            }
            while (!isVowel(chars[j]) && j > i) {
                j--;
            }
            if (i < j) {
                char tmp = chars[i];
                chars[i] = chars[j];
                chars[j] = tmp;
            }
            i++;
            j--;
        }
        return new String(chars);
    }

    private boolean isVowel(Character character) {
        switch (character) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return true;
            default:
                return false;

        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().reverseVowels(".,"));
    }
}
