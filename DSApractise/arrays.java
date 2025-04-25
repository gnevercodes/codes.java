package DataStructuresHeadfirst;

import java.util.Arrays;

// this one is fixed size 
// it is a zero based indexing 
// only type of elements can be stored all across. 
// fast access : O(1) 
// one dimensional or two dimensional . 
// accessing can be done using indexing. 
public class arrays 
{
    int[] numbers = new int[5] ; 
    int[] num1 = {10,20,30,40,50}  ; 
    int[] copy = Arrays.copyOf(numbers,numbers.length);{
    // iterating through a loop 
    for(int i = 0 ; i<numbers.length; i++ )
    {
        System.out.println(numbers[i]);
    }
    for ( int numby : numbers)
    {
        System.out.println(numby);
    }
}}

