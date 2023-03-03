import java.util.Arrays;

public class searchInTwoDimensionalArray {
    public static void main(String[] args) {
        int[][] arr={
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,12}
        };

//        int ans = searchInTwoDimArrays(arr,56);
//        System.out.println(ans);

         int[] ans = searchInTwoDimArrays(arr,0);
         System.out.println(Arrays.toString(ans));


        int max = searchMaxiumValueInTwoDimArrays(arr);
        System.out.println(max);

        int min = searchMinimumValueInTwoDimArrays(arr);
        System.out.println(min);
    }


    static int[] searchInTwoDimArrays(int [][] arr,int value){

//        for(int row=0;row<arr.length;row++){
//            for(int column = 0;column<arr[row].length;column++){
//                if(arr[row][column] == value){
//                    System.out.println(row + " " + column);
//                    return arr[row][column];
//                }
//            }
//        }

                for(int row=0;row<arr.length;row++){
            for(int column = 0;column<arr[row].length;column++){
                if(arr[row][column] == value){

                    return new int[]{row,column};
                }
            }
        }
        //return -1;

        return new int[]{-1,-1};
    }

    //for searching maximum value in 2D array
    static int searchMaxiumValueInTwoDimArrays(int [][] arr){

//        for(int row=0;row<arr.length;row++){
//            for(int column = 0;column<arr[row].length;column++){
//                if(arr[row][column] == value){
//                    System.out.println(row + " " + column);
//                    return arr[row][column];
//                }
//            }
//        }
       int value=0;
       //using normal for loop
//        for(int row=0;row<arr.length;row++){
//
//            for(int column = 0;column<arr[row].length;column++){
//                if(arr[row][column] > value){
//                    value = arr[row][column];
//
//                }
//            }
//        }
       //using enhanced for loop
        for (int[] ints : arr) {

            for (int anInt : ints) {
                if (anInt > value) {
                    value = anInt;

                }
            }
        }
        //return -1;

        return value;
    }

    static int searchMinimumValueInTwoDimArrays(int [][] arr){

//        for(int row=0;row<arr.length;row++){
//            for(int column = 0;column<arr[row].length;column++){
//                if(arr[row][column] == value){
//                    System.out.println(row + " " + column);
//                    return arr[row][column];
//                }
//            }
//        }
        int value=arr[0][0];
//        //using normal for loop
//        for(int row=0;row<arr.length;row++){
//
//            for(int column = 0;column<arr[row].length;column++){
//                if(arr[row][column] < value){
//                    value = arr[row][column];
//
//                }
//            }
//        }

        for (int[] ints : arr) {

            for (int anInt : ints) {
                if (anInt < value) {
                    value = anInt;

                }
            }
        }

        //return -1;

        return value;
    }
}
