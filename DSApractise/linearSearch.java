package DataStructuresHeadfirst; 
import java.util.Arrays; 
public class linearSearch {
    public static void main(String[] args) {
    
    
    // for normal for loops . 

    int[] nums = {3,2,1,22,8,9} ; 
    int resultIndex = linearSearch1(nums,8); 
    if(resultIndex != -1 ){
        System.out.println("target found at indexa" + resultIndex );
    }
    else{
        System.out.println("target not found");
    }

    // for recursive calls. 
    
    int target1  = 8 ; 
    int recurseResult = linearSearchRecursive(nums, target1 , 0);
    if(recurseResult == -1)
    {
        System.out.println("not found");
    }
    else{
        System.out.println("found at index" + recurseResult);
    }
    // for enhaced for loop 
    int resultofEnhanced = LinearEnhancedApproach(nums ,target1); 
    if(resultofEnhanced == -1 ){
        System.out.println("target not found ");

    }
    else{
        System.out.println("target found at " + resultofEnhanced);
    }
} 
   
    private static int linearSearch1(int[] arr, int target) 
    {
       for(int i = 0 ; i < arr.length; i++ ){
         if(arr[i]==target){
            return i ; 
         }
         
       }
       return -1; 
    }

    private static int linearSearchRecursive(int[] arr, int target , int indexForRecursing){
        if( indexForRecursing == arr.length)
        {
            return -1 ; 
        }
        if( arr[indexForRecursing] == target){
            return indexForRecursing; 
        }
        return linearSearchRecursive(arr, target, indexForRecursing+1); 
    }
    // careful bro 
    
    


    private static int LinearEnhancedApproach(int[] arr , int anotherTarget)
    {
        int index  = 0 ; 
        for(int localVal : arr)
        {
           if(localVal == anotherTarget){
            return index ; 

           }
           index ++ ; 
        }
        return -1 ; 

    }

}