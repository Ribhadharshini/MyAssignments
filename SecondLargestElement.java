package week5.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SecondLargestElement {
	public static void main(String[] args) {
		int[] data= {3,2,11,4,6,7,2,3,3,6,7};
		//create a empty set using TreeSet
		Set<Integer> datas=new TreeSet<Integer>();
		Arrays.sort(data);
		//declare for loop iterator from 0 to data.length and add into set
		for(int i=0;i<data.length;i++) {
			datas.add(data[i]);
		}
		//converted set into list
		List<Integer> list=new ArrayList<Integer>(datas);
		//print the second last element from list.
        if (list.size() >= 2) {
            int secondLargest = list.get(list.size() - 2);
            System.out.println("The second largest element is: " + secondLargest);
        } else {
            System.out.println("There is no second largest element in the array.");
		
	}
		}
}
