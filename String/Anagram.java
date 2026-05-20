package DSA.String;

class Anagram {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        if(s1.length()!=s2.length()){
            return false;
        }
        
HashMap<Character,Integer> hm=new HashMap<>();
        for(char c1:s1.toCharArray()){
            hm.put(c1,hm.getOrDefault(c1,0)+1);
        }
        for(char c2:s2.toCharArray()){
            if(!hm.containsKey(c2)){
                return false;
            }
            hm.put(c2,hm.get(c2)-1);
            if(hm.get(c2)==0){
                hm.remove(c2);
            }
            
        }
        return true;
        
    }
}