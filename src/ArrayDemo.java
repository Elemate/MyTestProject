import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.junit.Test;


public class ArrayDemo {
	public static void main(String[] args) {
		int[] i = {1,2};
		String[] str = new String[10];
		str[1] = "sss";
		for (String strs : str) {
			System.out.println(strs);
		}
		List<String> list = new ArrayList<String>();
	}
	
	@Test
	public void test1(){
		final List list = new ArrayList();
		list.add(1);
		
		System.out.println(list.get(0));
	}
	@Test
	public void test2(){
		Set tMap = new TreeSet();
		tMap.add("111");
		tMap.add(1);
		tMap.add("222");
	}
	
	@Test
	public void test3(){
		String s1 = new String("aa");
		String s2 = s1;
		System.out.println(s1.getClass());
		System.out.println(s2.getClass());
	}
	
	@Test
	public void test4(){
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("s1", "one");
		map.put("s1", "two");
		map.put("s3", "three");
		for(Map.Entry<String, String> map2 : map.entrySet()){
			System.out.print(map2.getValue()+"/");
			System.out.print(map2.getKey()+"/");
		}
	}
	
	@Test
	public void test5(){
		TreeMap<String, String> map = new TreeMap<String, String>();
		map.put("s1", "one");
		map.put("s2", "two");
		map.put("s3", "three");
		map.put("s1", "ssss");
		for(Map.Entry<String, String> map2 : map.entrySet()){
			System.out.print(map2.getValue()+"/");
			System.out.print(map2.getKey()+"/");
		}
	}
	
	@Test
	public void test6(){
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("", "one");
		map.put("s2", "two");
		map.put("s3", "three");
		map.put("s1", "ssss");
		for(Map.Entry<String, String> map2 : map.entrySet()){
			System.out.print(map2.getValue()+"/");
			System.out.print(map2.getKey()+"/");
		}
	}
	@Test
	public void test7(){
		LinkedList list = new LinkedList();
	}
}
