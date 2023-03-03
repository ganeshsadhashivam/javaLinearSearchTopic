import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args){

        String name = "ganesh";
        char target = 'h';
        System.out.println(search(name,target));
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(searchUsingEnhancedFor(name,target));
    }

    static boolean search(String str,char target){
        if(str.length()==0){
            return false;
        }

        for(int i=0;i<str.length();i++){
            if(target == str.charAt(i)){
                return true;
            }
        }



        return false;
    }

    static boolean searchUsingEnhancedFor(String str,char target){
        if(str.length()==0){
            return false;
        }



        //enhanced for loop
        for(char ch:str.toCharArray()) {
            if (target == ch) {
                return true;
            }
        }

        return false;
    }
}
