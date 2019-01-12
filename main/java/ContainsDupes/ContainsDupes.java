package ContainsDupes;

//PROBLEM DOMAIN
//Given an array of integers, find if the array contains any duplicates.
//Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
//
//# Example 1:
//Input: [1,2,3,1]
//Output: true
//
//# Example 2:
//Input: [1,2,3,4]
//Output: false
//
//# Example 3:
//Input: [1,1,1,3,3,4,3,2,4,2]
//Output: true

//PSEUDOCODE
//ALGORITHM => containsDupes (inputArray)
//DECLARE boolean result = false to start
//EDGE CASE: if array empty return result
//DECLARE int searchValue
//FOR i <- 0 to inputArray.length -1
  //searchValue = inputArray[i]
  //FOR j<-1 to inputArray.length -1
 //if inputArray[i] == searchValue  RETURN result = true
//RETURN result

//BIG 0
//O(n^2) in time because you'll go through the outer loop n times * inner loop n times
//O(1) in space because only creating a single int variable

public class ContainsDupes {

    public static void main(String[] args) {
        int[] noDupes = {0,1,2,3};

        int[] tinyDupes = {1,1,2,4};

        int[] randomDupes = {1,3,4,3,2,7};

        System.out.println(containsDupes(noDupes));

        System.out.println(containsDupes(tinyDupes));

        System.out.println(containsDupes(randomDupes));
    }

    public static boolean containsDupes(int[] inputArray){
        boolean dupeCheckResult = false;
        if(inputArray.length <=1){
            return dupeCheckResult;
        }
        int searchValue;
        for(int j = 0; j < inputArray.length-1 ; j++) {
            for (int i = 0; i < inputArray.length - 1; i++) {
                searchValue = inputArray[i];
                if (searchValue == inputArray[i + 1]) {
                    dupeCheckResult = true;
                    return dupeCheckResult;
                }
            }
        }
        return dupeCheckResult;
    }
}
