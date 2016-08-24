import java.util.HashMap;
import java.util.Map;

public class P1_1 {
	public static boolean isUnique(String test){
		Map<Character, Boolean> m = new HashMap<Character, Boolean>();
		
		for(int i = 0 ; i < test.length() ; i++){
			Character c = test.charAt(i);
			if(m.get(c) != null){
				return false;
			}else{
				m.put(c, true);
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "abcd";
		System.out.println(isUnique(test));
	}

}
