package day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap <Integer, String> hm = new HashMap  <Integer, String> ();//writing wrapper class in compulsion

		//adding pairs(key and value together)
		hm.put(101, "john");
		hm.put(102, "Scott");
		hm.put(103, "Mary");
		hm.put(104, "Scott");
		hm.put(102, "David"); //it key duplicate does not allow so it take updated value for same key
		
		System.out.println(hm);
		
		
		
		System.out.println(hm.size());
		
		//remove pair by entering key
		hm.remove(102);
		System.out.println(hm);
		
		//to access value of key
		hm.get(101);
		System.out.println(hm.get(101));
		
		//get all keys from hashmap
		System.out.println(hm.keySet());
		
		System.out.println(hm.values());
		
		System.out.println(hm.entrySet());
		
		//resding data from hashmap
	/*	for(int k : hm.keySet())
		{
			System.out.println(k+"     "+hm.get(k));
		}*/
		
		//using interator
		Iterator<Entry<Integer, String>> it = hm.entrySet().iterator();
		while(it.hasNext())
		{
			Entry<Integer, String> entry = it.next();
			System.out.println(entry.getKey()+"     "+entry.getValue());
		}
		
		hm.clear();
		System.out.println(hm.isEmpty());
	}

}
