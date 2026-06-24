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
            
            // 1. Move j forward until it hits the delimiter '#'
            while (str.charAt(j) != '#') {
                j++;
            }
            
            // 2. Everything from i to j is your number string
            int size = Integer.parseInt(str.substring(i, j));
            
            // 3. The actual text starts at j + 1, and its length is 'size'
            String s = str.substring(j + 1, j + 1 + size);
            decoded.add(s);
            
            // 4. Jump i to the start of the NEXT string's length indicator
            i = j + 1 + size;
        }
        return decoded;
    }
}
