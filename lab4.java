package lab4;

import org.junit.jupiter.params.provider.Arguments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/** @author [Paulo Manalo]
  * @date [03/10/22]
  * This program returns the multisum factors of n
  **/
public class lab4 {
/** This program checks to see if n is divisible by for loop iterator i. If so, we add the appropriate values into the inner
 * array and then add the inner array into the outer array list as it is a array list of arrays
  * @param n integer to calculate for unique combination of factors
  * @returns an arraylist of unique arraylist of factors to n
  **/
  public static List<List<Integer>> multiSum(int n){
      List<List<Integer>> outer = new ArrayList<>();
      List<Integer> inner;
	  if(n<0) { 
		  throw new NumberFormatException("try again with a positive integer");
	  }
	  else if(n==0) {
		  inner = new ArrayList<>();
		  inner.add(n);
	  outer.add(inner);
	  }
	  for (int i = 1; i * i <= n; i++) {
		  inner = new ArrayList<>();
		  boolean match = false;
          if (n % i == 0) {
              System.out.println(i + "*" + n / i);
             inner.add(i);
              inner.add(n/i);
              outer.add( inner);
          }
		 inner = new ArrayList<>();
         int temp = n/i; //setting temp value
         if(i>1 && n%i==0) {  //checking if temp value is further divisible, if so we enter loop
          for(int j = temp-1; !match; j--) {
        	  if(j>1) {
        	  if(temp%j==0) { //checking if temp value is divisible by for loop iterator
        		  if(i%Math.sqrt(i)==0) { //checking if value is divisible by itself
        			  inner.add((int) Math.sqrt(i)); //if so we add the split values
        			  inner.add((int) Math.sqrt(i));
        		  }
        		  else { //else we just add the value
        		  inner.add(i);
        		  }
        		  inner.add(temp/j); // then we add the next value which is temp divided by current index
        		  inner.add(j); //adding the iterator value of j
        		  outer.add(inner); //add this to our current collection list of arrays 
        		  match=true; //set boolean value to true to break loop
        	  }
        	  }
        	  else
        		  break;
          	}
         }
	  }
	  return outer;//return out arraylist
}
  public static void main(String[] args){
    int n = 16;
    System.out.print("Expected result for " + n + ":\n" + " [[1,16], [2,8], [2,2,4], [2,2,2,2], [4,4]]\n");
    System.out.print("A total number of unique results found: 5\n");
    System.out.print("------------------------\n");
    System.out.print("Actual result for " + n + ": " + multiSum(n));
  }
}
