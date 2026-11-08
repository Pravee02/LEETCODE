class Solution {
    public List<List<String>> findMismatchedSegments(String s1, String s2) {
        List<List<String>> result = new ArrayList<>();

        int i = 0;

        while (i < s1.length()) {

            if (s1.charAt(i) != s2.charAt(i)) {

                int start = i;

                while (i < s1.length() &&
                       s1.charAt(i) != s2.charAt(i)) {
                    i++;
                }

                List<String> list = new ArrayList<>();

                list.add(s1.substring(start, i));
                list.add(s2.substring(start, i));

                result.add(list);

            } else {
                i++;
            }
        }

        return result;
    }
    
}