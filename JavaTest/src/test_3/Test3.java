package test_3;

import java.util.HashMap;
import java.util.Map;

public class Test3 {
	public static void main(String[] args) {

		Map<String, String> prefs = new HashMap<String, String>();
		prefs.put("リンゴ", "赤色");
		prefs.put("空", "青");
		prefs.put("夜", "黒");
		prefs.put("バニラアイス", "白");

		for (Map.Entry<String, String> entry : prefs.entrySet()) {
			System.out.println(entry.getKey() + "は" + entry.getValue());
		}
	}

}
