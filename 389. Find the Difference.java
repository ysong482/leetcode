//用哈希表处理。
class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> hashs = new HashMap();
        HashMap<Character, Integer> hasht = new HashMap();
        for(int i=0; i<s.length() ; i++){
            if(hashs.containsKey(s.charAt(i))==false){
                hashs.put(s.charAt(i),1);
            }else{
                int temp = hashs.get(s.charAt(i));
                temp++;
                hashs.remove(s.charAt(i));
                hashs.put(s.charAt(i),temp);
            }
        }
        for(int i=0; i<t.length() ; i++){
            if(hasht.containsKey(t.charAt(i))==false){
                hasht.put(t.charAt(i),1);
            }else{
                int temp = hasht.get(t.charAt(i));
                temp++;
                hasht.remove(t.charAt(i));
                hasht.put(t.charAt(i),temp++);
            }
        }
        for(char i = 'a'; i <= 'z';i++){
            if(hashs.get(i) != hasht.get(i)){
                return i;
            }
        }
        return ' ';
    }
}
