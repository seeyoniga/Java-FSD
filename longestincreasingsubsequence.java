import java.util.*;
import java.util.stream.IntStream;

public class longestincreasingsubsequence{
   static int increasingsubsequence(int a[], int len){
      int ar[] = new int[len];
      int i, j, max = 0;
      for (i = 0; i < len; i++)
         ar[i] = 1;
      	 for (i = 1; i < len; i++)
      		 for (j = 0; j < i; j++)
      			 if (a[i]> a[j] && ar[i] < ar[j] + 1)
      				 ar[i] = ar[j] + 1;
      	 for (i = 0; i < len; i++)
      		 if (max < ar[i])
      			 max =ar[i];
      	 return max;
   }
   public static void main(String args[]){
	  int a1[]= {35,12,9,21,3,54};
	  int a2[]= IntStream.generate(() -> new Random().nextInt(99)).limit(99).toArray();
      int length1 = a1.length;
      int length2 = a2.length;
      System.out.println("The length of the longest increasing subsequence is " +  increasingsubsequence(a1, length1));
      System.out.println("The length of the longest increasing subsequence is " +  increasingsubsequence(a2, length2));
   }
}
