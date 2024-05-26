package Anudip;

import java.util.ArrayList;

public class array_list {
	public static void main(String[] args) {
		ArrayList<String> colorlist = new ArrayList<String>(2);
		colorlist.add("red");
		colorlist.add("blue");
		
		for(String value: colorlist) {
			System.out.println("value from arralist:"+value);
		}
		Object[] obj = colorlist.toArray();
		for(Object value2: obj) {
			System.out.println("value from array:"+value2);
		}
		
	}

}
