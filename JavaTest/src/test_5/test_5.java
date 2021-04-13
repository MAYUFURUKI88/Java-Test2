package test_5;


import java.util.Arrays;
import java.util.List;


public class test_5 {
	
	public static void main(String[] args) {
		
		test_5 main = new test_5();
		
		List<Pasokon> list = main.createInstance();
		
		list.forEach(System.out::println);
	}
	
	private List<Pasokon> createInstance(){
		
		
		Pasokon server = new Server();
		Pasokon note= new NotePC();
		Pasokon desktop = new Desktop();
		Pasokon tablet = new Tablet();
		
		return Arrays.asList(server, note, desktop, tablet);
	}

}
