package Strings;

/*
 * String Compression
 * "aaabbcccdd" -----> "a3b2c3d2"
 */
public class Compress_String {

    public static String compressString(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<str.length(); i++){
            Integer count = 1; //because we have to convert count to string later
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count > 1){
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }

    public static void main(String args[]){
        String str = "aaabbcccdd";
        //String str = "abc";
        System.out.println(compressString(str));
    }
    
}
