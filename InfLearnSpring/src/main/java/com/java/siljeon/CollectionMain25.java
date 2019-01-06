package com.java.siljeon;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionMain25 {

	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("Hello");
		list.add("Java");
		list.add("World");

		list.add(2, "Programing"); // added
		System.out.println("list : " + list);
		System.out.println();

		list.set(1, "C"); // update
		System.out.println("list : " + list);
		System.out.println();

		String str = list.get(2);
		System.out.println("list.get(2): " + str);
		System.out.println();

		str = list.remove(2);
		System.out.println("list.remove(2): " + str);
		System.out.println();

		list.clear();
		System.out.println("list.clear(): " + list);
		System.out.println();

		boolean b = list.isEmpty();
		System.out.println("list.isEmpty() " + b);
		System.out.println();

		System.out.println("########################");
		// key 를 이용해서 데이터 관리
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		System.out.println("map.size() : " + map.size());

		map.put(5, "Hello");
		map.put(6, "Java");
		map.put(7, "World");
		System.out.println();
		System.out.println("map : " + map);
		System.out.println("map size : " + map.size());
		System.out.println();

		map.put(8, "!!!!!!!!!!");
		System.out.println("map : " + map);
		System.out.println("map size : " + map.size());
		System.out.println();

		map.put(6, "C");
		System.out.println("map : " + map);
		System.out.println("map size : " + map.size());
		System.out.println();

		str = map.get(5);
		System.out.println("map : " + map);
		System.out.println("map . get(5) : " + str);
		System.out.println();

		map.remove(8);
		System.out.println("map : " + map);
		System.out.println("map size : " + map.size());
		System.out.println();

		b = map.containsKey(7);
		System.out.println("map.containsKey (7) : " + b);
		System.out.println();

		b = map.containsValue("World");
		System.out.println("map.containsValue(World) : " + b);
		System.out.println();

		map.clear();
		System.out.println("map clear : " + map);

		b = map.isEmpty();
		System.out.println("map is empty? : " + b);
	}
}
