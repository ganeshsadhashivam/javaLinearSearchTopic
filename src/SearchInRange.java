import java.util.Arrays;

public class SearchInRange {
    public static void main(String[] args){
       int []arr = {18,12,-7,3,14,28};
       int target = 19;
    System.out.println("search value found at index");
        System.out.println(linearSearch(arr,target,0,4));
    }

    static int  linearSearch(int [] arr ,int target,int start,int end){
        if(arr.length==0){
            return -1;
        }

        for(int i=0;i<arr.length;i++){
            if(target == arr[i]){
                return i;
            }
        }



        return -1;
    }

}

