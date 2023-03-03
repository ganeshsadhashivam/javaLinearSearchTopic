public class MaxWealth {
    public static void main(String[] args) {
        //1672 no
//https://leetcode.com/problems/richest-customer-wealth/
        int[][] arr = {
                {1,5},
                {7,3},
                {3,5}
        };

        System.out.println(maximumWealth(arr));
    }


    static int maximumWealth(int [][] accounts){
int ans = Integer.MIN_VALUE;
        for(int person=0;person<accounts.length;person++){
            int value=0;
            for(int account = 0 ; account<accounts[person].length;account++){
//                if(accounts[person][account] > value){
                    value += accounts[person][account];
//                }
            }

            if(value>ans){
                ans= value;
            }
        }

        return ans;
    }
}
