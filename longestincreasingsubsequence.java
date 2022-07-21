import java.util.*;
import java.util.stream.IntStream;

public class longestincreasingsubsequence {
	public static void main(String[] args) {
		int a[] = IntStream.generate(() -> new Random().nextInt(99)).limit(99).toArray();;
		int b[]= {35,12,9,21,3,54}; ;
		ArrayList li = new ArrayList();
		ArrayList longli = new ArrayList();
		int curmax;
		int hc = 0;
		for(int i = 0; i < a.length;i++)
		{
			curmax = Integer.MIN_VALUE;
			for(int j = i;j < a.length; j++)
			{
				if(a[j] > curmax)
				{
					li.add(a[j]);
					curmax = a[j];
				}
			}
			if(hc < li.size())
			{
				hc = li.size();
				longli = new ArrayList(li);
			}
			li.clear();
		}
		System.out.println();
		Iterator itr = longli.iterator();
		System.out.println("The Longest subsequence");
		while(itr.hasNext())
		{ 
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		System.out.println("Length of LIS: " + hc);
		ArrayList li1 = new ArrayList();
		ArrayList longli1 = new ArrayList();
		int curmax1;
		int hc1 = 0;
		for(int i = 0; i < b.length;i++)
		{
			curmax1 = Integer.MIN_VALUE;
			for(int j = i;j < b.length; j++)
			{
				if(b[j] > curmax1)
				{
					li1.add(b[j]);
					curmax1 = b[j];
				}
			}
			if(hc1 < li1.size())
			{
				hc1 = li1.size();
				longli1 = new ArrayList(li1);
			}
			li1.clear();
		}
		System.out.println();
		Iterator itr1 = longli1.iterator();
		System.out.println("The Longest subsequence");
		while(itr1.hasNext())
		{
			System.out.print(itr1.next() + " ");
		}
		System.out.println();
		System.out.println("Length of LIS: " + hc1);
	}
	
}

