package day20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		//decleration
		//ArrayList mylist = new ArrayList();
     //List mylist = new ArrayList();
		//ArrayList <Integer> mylist3 = new ArrayList<Integer>();
		ArrayList <Integer> mylist3 = new <Integer>ArrayList();
		mylist3.add(12);
		ArrayList <String> mylist2 = new ArrayList<String>();
		mylist2.add("hi");
		//mylist2.add(12);
		ArrayList <Character> mylist1 = new ArrayList <Character>();
		mylist1.add('d');
		//mylist1.add(10);
		//ArrayList <Double>mylist = new ArrayList<Double>();
		ArrayList <Float> mylist4 = new  ArrayList <Float>();
		mylist4.add(10.5f);
		//mylist.add("komal");
		ArrayList  mylist = new ArrayList();
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("welcome");
		mylist.add(true);
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);
		
		//size of ArrayList
		System.out.println("Size of arrayList "+mylist.size());

		//printing Arraylist
		System.out.println("arrayList "+mylist);
		
		
		//Remove element from arraylist
		mylist.remove(5);
		System.out.println("arrayList after removining element of index 5 "+mylist);
		
		mylist.add(2, "java");
		System.out.println("arrayList after inseration element "+mylist);
		
		mylist.set(2, "python");
		System.out.println("arrayList after replacing element "+mylist);
		
		//to access element from aarylist
		System.out.println(mylist.get(3));
		
		//Reading all the element from arraylist
		//by using for loop
		/*for(int i=0; i< mylist.size(); i++)
		{
			System.out.println(mylist.get(i));
		}*/
		/*for (Object x : mylist) {
			System.out.println(x);
		}*/
		
		//hasNext method point first time first object then evry time it point for next element
		//next() method print that method
		//like str = "komal;
		//str.upperCase() we stored in String type variable so
		
		Iterator it = mylist.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		ArrayList  mylist7 = new ArrayList();
		mylist7.add(100);
		mylist7.add("welcome");
		
		mylist.removeAll(mylist7);
		System.out.println("arrayList after removing multipal element "+mylist);
		
		mylist.clear();
		System.out.println(mylist);
		
		boolean status = mylist.isEmpty();
		System.out.println("is arraylist empty "+status);
		
		
		
		
		
		
		
		
	}

}
