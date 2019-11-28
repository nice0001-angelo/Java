package transport;

import java.util.*;

public class LinkedListExc {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i=0 ; i<10000 ; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList RunTime: " +(endTime-startTime)+"ns");
		
		startTime = System.nanoTime();
		for(int i = 0 ; i<10000 ; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList RunTime: "+(endTime-startTime)+"ns");
	}

}
