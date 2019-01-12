package MaxSubarray;

//PROBLEM DOMAIN
//Given an integer array nums, find the contiguous subarray (containing at least one number)
// which has the largest sum and return its sum.
//
//Example:
//Input: [-2,1,-3,4,-1,2,1,-5,4],
//Output: 6

//Explanation: [4,-1,2,1] has the largest sum = 6.
//
//Input: [-2,1]
//Output: 1
//
//Follow up:
//
//If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.

//PSEUDOCODE
//ALGORITHM => greatestSum(int[] inputArray)
//EDGE CASE: if inputArray.length == 0  return 0
//DECLARE int greatestSum =  inputArray[0]
//DECLARE int largestSumSoFar = greatestSum
//FOR i <- 1 to inputArray.length  [create new subArray]
  //largestSumSoFar = Math.max(inputArray[i], inputArray[i] + largestSumSoFar)
  //greatestSum = Math.max(largestSumSoFar, greatestSum)
//return greatestSum

//Big O
//TIME => O(n) because outerloop goes n times * inner loop going n times
//SPACE => O(1) only two in variables created

public class MaxSubArray {

    //using main as quick run/test harness
    public static void main(String[] args) {

        int[] testArray1 = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(greatestSum(testArray1));

        int[] testArray2 = {-2, 1};

        System.out.println(greatestSum(testArray2));
    }

    public static int greatestSum(int[] inputArray){
        if(inputArray.length < 1){
            return 0;
        }
        int largestSumSoFar = inputArray[0];
        int greatestSum = largestSumSoFar;

        for(int i = 1; i < inputArray.length ; i ++){

                largestSumSoFar = Math.max(inputArray[i], inputArray[i] + largestSumSoFar);
                greatestSum = Math.max(greatestSum, largestSumSoFar);
            }
        return greatestSum;
    }
}
