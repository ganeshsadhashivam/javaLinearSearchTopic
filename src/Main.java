public class Main {
    public static void main(String[] args) {

        int[] nums = {23,45,1,2,8,19,-3,16,-11,28};
        int index = linearSearch(nums,199);
        System.out.println(index);
        int element = linearSearch(nums,19);
        System.out.println(element);

    boolean booleanAnswer = linearSearchToReturnTrueOrFalse(nums,19);
        System.out.println(booleanAnswer);
    }

    //Search in the array : return the index if item found
    //otherwise if item not found return -1

    static  int linearSearch(int []arr,int target){

        if(arr.length == 0){
            return -1;
        }

        //run for loop
        for(int index = 0;index<arr.length;index++){
            //check for element at every index
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        //this line execute if none of the return statement above
        //have executed hence the target not found

        return -1;
    }

   // return element
    static  int linearSearchToReturnElement(int []arr,int target){

    if(arr.length == 0){
        return -1;
    }

    //run for loop
    for (int element : arr) {
        //check for element at every index
        if (element == target) {
            return element;
        }
    }
    //this line execute if none of the return statement above
    //have executed hence the target not found

    return -1;
}

//return true or false
static  boolean linearSearchToReturnTrueOrFalse(int []arr,int target){

    if(arr.length == 0){
        return false;
    }

    //run for loop
    for (int element : arr) {
        //check for element at every index
        if (element == target) {
            return true;
        }
    }
    //this line execute if none of the return statement above
    //have executed hence the target not found

    return false;
}
}