public class MaxAndMinNumber {

    public static void main(String[] args){
        int []arr = {18,12,-7,3,14,28};
    int ans = minNumber(arr);

    System.out.println(ans);
    }

    static int minNumber(int []arr){
        int minNumber = arr[0];
         int maxNumber = arr[0];
        // 1 method
//        for(int i=1;i<arr.length;i++){
//            if(minNumber > arr[i]){
//                minNumber = arr[i];
//            }
//        }

    //2nd method
        for(int i=1;i<arr.length;i++){
            if(arr[i] < minNumber  ){
                minNumber = arr[i];
            }
        }

        //for max value
        for(int i=1;i<arr.length;i++){
            if(arr[i] > maxNumber  ){
                maxNumber = arr[i];
            }
        }


        //return maxNumber;

        return minNumber;
    }
}
