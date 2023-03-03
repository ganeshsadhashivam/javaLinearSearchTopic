public class EvenDigits {
    public static void main(String[] args) {

       // int[] nums = {12,345,2,6,7896};
        int [] nums = {555,901,482,1771};
        int result = findNumbers(nums);
        System.out.println(result);
    }
static int findNumbers(int [] numbers) {
    int count = 0;
    for (int i = 0; i < numbers.length; i++) {
        if (evenNoOfDigits(numbers[i])) {
            count++;
        }
    }

    return count ;
}

static boolean evenNoOfDigits(int value){
        boolean res = false;
        int count =0;
        while(value > 0){
            int rem = value/10;
            value =rem;
            count++;
        }
        if(count%2==0){
            res = true;
        }

        return res;
}

}


//leetcode problem 1295
//int count = 0;
//    for (int i = 0; i < nums.length; i++) {
//        if (evenNoOfDigits(nums[i])) {
//        count++;
//        }
//        }
//
//        return count ;
//        }
//
//        boolean evenNoOfDigits(int value){
//        boolean res = false;
//        int count =0;
//        while(value > 0){
//        int rem = value/10;
//        value =rem;
//        count++;
//        }
//        if(count%2==0){
//        res = true;
//        }
//
//        return res;
//        }
