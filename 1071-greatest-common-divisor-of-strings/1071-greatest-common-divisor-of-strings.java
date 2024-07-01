class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int str1len=str1.length();
        int str2len=str2.length();
        if(str1len<str2len)
        {
            return gcdOfStrings( str2,  str1);
        }
        if(str1.equals(str2))
        {
            return str1;
        }
        if(str1.startsWith(str2))
        {
            return gcdOfStrings( str1.substring(str2len),  str2);
        }
        return "";
        
    }
}