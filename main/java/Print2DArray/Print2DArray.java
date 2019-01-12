package Print2DArray;

//PROBLEM DOMAIN
//take in a whole positive integer  equal to or greater than 1 and print that integer's worth of rows of arrays
//with each array holding each value plus the values that are multiples of the original value (total size is size of
// input number
// and
// the next value
//until the the length equals the input integer
//each array must be printed in a single line with spaces between each integer
//there must be a total number of lines that equals the input number of rows

//EXAMPLE OUTPUT
//1  2  3  4  5
//2  4  6  8  10
//3  6  9  12 15
//4  8  12 16 20
//5  10 15 20 25

//PSEUDOCODE
//ALGORITHM => Print2DArray
//edge case if inputNum <=0  System.out.println("empty array because value <= 0")
//DECLARE int[] for each array line
//FOR LOOP up to value of inputNum
//INNER FOR LOOP to generate ea array value for length array
  //index value = inputNum * value
//System.out.println (output array)
//END

import java.util.Arrays;

public class Print2DArray {

    //main method as quick run/test harness
    public static void main(String[] args) {

        System.out.println(Print2DArray.print2DArray(3));

        System.out.println(Print2DArray.print2DArray(5));

        System.out.println(Print2DArray.print2DArray(1));

        System.out.println(Print2DArray.print2DArray(0));

        System.out.println(Print2DArray.print2DArray(-1));

        System.out.println(Print2DArray.print2DArray(22));

    }

    public static String print2DArray(int numRows){

        if(numRows <=0){
            return "This won't work. Please input a value > 0 and try again.";
        }

        int[] numArray = new int[numRows];

        for(int i = 1; i <= numRows; i++){

            for(int j = 1 ; j < numRows +1 ; j++){
                int value = i * j;
                numArray[j-1] = value;
            }
            System.out.println(Arrays.toString(numArray));
        }
        return "print 2D array complete";
    }
}
