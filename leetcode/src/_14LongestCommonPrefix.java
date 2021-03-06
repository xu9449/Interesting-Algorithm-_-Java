public class _14LongestCommonPrefix {
    public static void main(String[] args) {
        _14LongestCommonPrefix s = new _14LongestCommonPrefix();
        String[] str = {"flower", "flow", "flight"};
        String res = s.longestCommonPrefix(str);
        System.out.println(res);
    }
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }
}
