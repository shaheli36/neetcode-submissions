class Solution {
    public boolean isAnagram(String s, String t) 
    {
        if(s.length()!=t.length())
           return false;

        char[] char1 = s.toCharArray();
        Arrays.sort(char1);
        String sort1 = new String(char1);

        char[] char2=t.toCharArray();
        Arrays.sort(char2);
        String sort2= new String(char2);

        if(sort1.equals(sort2))
           return true;
        return false;   
    }
}
