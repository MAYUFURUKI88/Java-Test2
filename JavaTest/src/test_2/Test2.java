package test_2;

import java.util.ArrayList;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		final List<String> List = new ArrayList<>(5);
		List.add("Java");
		List.add("Python");
		List.add("javascript");
		List.add("C#");
		List.add("kotlin");

		for(int i = 0; i < List.size(); i++) {
			System.out.println(List.get(i));
		}
	}

}
