package DSA.String;

class JwelsAndStons {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> jewelset=new HashSet<>();
        for(char ch:jewels.toCharArray()){
            jewelset.add(ch);
        }int count=0;
        for(char c:stones.toCharArray()){
            if(jewelset.contains(c)){
                count++;
            }
        }
        return count;
    }
}