package Strings;//-------------String Builder------------
//----------append()---------------

public class StringBufferAppend {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("");
        for(char ch='a'; ch<='z'; ch++){
            sb.append(ch);
        }
        System.out.println(sb);

        //Time complexity=O(26)
    }
    

    
}
