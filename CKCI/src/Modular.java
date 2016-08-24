
public class Modular {

	public static int mod(int a, int b){
		return (int) (a - Math.floor(a/b)*b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mod(16, 13));
	}

}
