class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String output = "";
        String[] textArr = text.split(" ");
        int n=textArr.length;
        for(int i=0;i<n-2;i++){
            if(textArr[i].equals(first)&&
              textArr[i+1].equals(second))
                output+=textArr[i+2]+" ";
        }
        String[] out = output.split(" ");
        if(out[0].equals(""))return new String[0];
        return out;
        
        
            
        
    }
}