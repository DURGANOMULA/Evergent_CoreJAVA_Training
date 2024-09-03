package com.evergent.corejava.collections.collectionsClass;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CC10_SynchronizedMap 
{
	

	public static void main(String[] args) 
	{
		Map<Integer, String> map1=new HashMap<>();
		map1.put(1, "durga");
		map1.put(2, "sai");
		map1.put(3, "prasad");
		Map<Integer, String> synchronizeMap=Collections.synchronizedMap(map1);
		synchronizeMap.put(4, "nomula");
		System.out.println(synchronizeMap.get(1));
			for(Map.Entry<Integer, String> e:synchronizeMap.entrySet()) 
			{
				System.out.println(e.getKey()+" "+e.getValue());
			}
	
		
		
	}

}
