class Solution {

    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < strs.size(); i++){
            str.append(strs.get(i));
            str.append("-");
        }
        return str.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded  = new ArrayList<>();
        int index = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == '-'){
                String s = str.substring(index,i);
                decoded.add(s);
                index = i + 1;

            }
            
        }
        return decoded;
    }
}
