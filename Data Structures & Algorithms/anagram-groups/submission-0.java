class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++){
            int[] counts = new int[26];
            for (int k = 0; k < strs[i].length();k++){
                counts[strs[i].charAt(k) - 'a']++;
            }
            StringBuilder str = new StringBuilder();
            for (int j = 0; j < 26; j++){
                str.append(",");
                str.append(""+counts[j]);
            }

            map.putIfAbsent(str.toString(), new ArrayList<>());
            map.get(str.toString()).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
    
}
