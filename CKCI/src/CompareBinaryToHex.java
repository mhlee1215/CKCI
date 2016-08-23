
public class CompareBinaryToHex {

	public static boolean compareBinToHex(String binary, String hex){
		int b1 = convertToBase(binary, 2);
		int b2 = convertToBase(hex, 16);
		if(b1 == b2) return true;
		return false;//hello
	}
	
	public static int convertToBase(String number, int base){
		int result = 0;
		number = number.toUpperCase();
		for(int i = number.length()-1 ; i >= 0 ; i--){
//			System.out.println(number.charAt(i));
//			System.out.println(convertToInt(number.charAt(i)));
//			System.out.println(-(i-number.length()+1));
//			System.out.println(Math.pow(base, -(i-number.length()+1))*convertToInt(number.charAt(i)));
			result+=Math.pow(base, -(i-number.length()+1))*convertToInt(number.charAt(i));
		}
		return result;
	}
	
	public static int convertToInt(char a){
		if(isDigit(a)) return a - 48;
		else return a - 55; 
		//return 0;
	}
	
	public static boolean isDigit(char a){
		if(a-0 >= 48 && a-0 <= 57) return true;
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "1101";
		String b = "C";

//		System.out.println(convertToInt('a'));
		//System.out.println(convertToBase("A1", 16));
		//System.out.println(compareBinToHex(a, b));
		System.out.println((int)'A');
	}

}
