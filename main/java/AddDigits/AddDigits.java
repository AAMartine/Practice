package AddDigits;//PROBLEM DOMAIN
//Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
//
//Example:
//
//Input: `38`
//Output: `2`
//Explanation: The process is like: `3 + 8 = 11`, `1 + 1 = 2`.
//             Since `2` has only one digit, return it.
//Follow up:
//Could you do it without any loop/recursion in O(1) runtime?

//PSEUDOCODE
//ALGORITHM ==> addDigits
//Base case (if inputNum <10 return inputNum)
//DECLARE int newSum (track sum when adding digits)
//While inputNum != 0
   //newSum += inputNum % 10 [to find 1st value in inputNum (1st digit)]
   //inputNum = inputNum/10 [ to find the 2nd value in inputNum (2nd digit)]
// return newsum in RECURSIVE call of method

public class AddDigits {
    //main method as quick run/test harness
    public static void main(String[] args) {

        System.out.println(addDigits(77));

        System.out.println(addDigits(38));

        System.out.println(addDigits(100));

        System.out.println(addDigits(1110));
    }

    public static int addDigits(int inputNum){
        if(inputNum < 10){
            return inputNum;
        }
        int newSum = 0;

        while (inputNum !=0){
            newSum += inputNum % 10;
            inputNum = inputNum/10;
        }

        return addDigits(newSum);
    }




}
