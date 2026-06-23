class Solution {
    public boolean isAnagram(String s, String t) {
        boolean toReturn = true;
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        int value1 =0;
        int value2 =0;
        for (int i = 0; i < s.length();i++){
            if (map1.containsKey(s.charAt(i)) == false){
                 value1 =0;
            }else{
                value1=map1.get(s.charAt(i));
            }
            
            map1.put(s.charAt(i), value1+1 );
            if (map2.containsKey(t.charAt(i)) == false){
                 value2 =0;
            }else{
                value2=map2.get(t.charAt(i));
            }
            map2.put(t.charAt(i), value2+1 );    
        }

        for(int i = 0; i < s.length();i++){
            if (map1.get(s.charAt(i)).equals(map2.get(s.charAt(i)))){
                continue;
            }
            else{
                toReturn = false;
                break;
            }
        }

        return toReturn;
    }
}
