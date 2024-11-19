package day20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		//decleration
		HashSet myset = new HashSet();
		//Set myset = new HashSet();
		myset.add(100);
		myset.add(10.5);
		myset.add("welcome");
		myset.add(true);
		myset.add(100);
		myset.add(null);
		myset.add(null);
		
		System.out.println(myset.size());
		
		System.out.println(myset);//from that we can say that indexing order not preserved
		//duplicate element do not gives syntax error but automatically duplicate element 
		//and duplicate null gate eliminated
		
		myset.remove(10.5);  //here we directly pass value but in arraylist we pass index
		System.out.println("hashset after removing"+myset);
		
		//Inseting element = not posible
		
		//Access specific element is not possible
		
		//convert hashset to arraylist
		ArrayList  al = new ArrayList(myset);
		System.out.println(al);
		System.out.println(al.get(2));
		
		//read all value the element using for loop not possible because indexing not preserved 
		//without converting arraylist
		//read all value the element using enhanced for loop  
	/*	for (Object x : myset) {
			System.out.println(x);
		}*/
		
		Iterator <Object> it= myset.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// from hashset we cannot remove multipal value
		
		myset.clear();
		System.out.println(myset);
		
		
		System.out.println(myset.isEmpty());
		
	}

}
