class Solution {

    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < strs.size(); i++){
            str.append( strs.get(i).length()+"#");
            str.append(strs.get(i));
            
        }
        return str.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        int i = 0;
        
        while (i < str.length()) {
            int j = i;
            
            while (str.charAt(j) != '#') {
                j++;
            }
            
            int size = Integer.parseInt(str.substring(i, j));
            
            String s = str.substring(j + 1, j + 1 + size);
            decoded.add(s);
            
            i = j + 1 + size;
        }
        return decoded;
    }
}
