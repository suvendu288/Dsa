package String;

public class EvenPositionReplac {
    public static void main(String[] args){
        String s="suvendu pal";
        String str="";

        for(int i=0;i<s.length();i++){
            if(i%2==0) str+='a';
            else str+= s.charAt(i);

        }
        System.out.println(str);


    }
}
