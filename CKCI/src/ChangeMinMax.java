
public class ChangeMinMax {

	public static int[] changeMinMax(int[] input){
		int minIdx = getMinIdx(input);
		int maxIdx = getMaxIdx(input);
		int tmp = input[minIdx];
		input[minIdx] = input[maxIdx];
		input[maxIdx] = tmp;
		return input;
	}
	
	public static int getMinIdx(int[] input){
		int minIdx = -1;
		int minValue = 9999999;
		for(int i = 0 ; i < input.length ; i++){
			if(minValue > input[i]){
				minValue = input[i];
				minIdx = i;
			}
		}
		return minIdx;
	}
	
	public static int getMaxIdx(int[] input){
		int maxIdx = -1;
		int maxValue = -9999999;
		for(int i = 0 ; i < input.length ; i++){
			if(maxValue < input[i]){
				maxValue = input[i];
				maxIdx = i;
			}
		}
		return maxIdx;
	}
	
	
	public static void printArray(int[] input){
		System.out.print("[");
		for(int i = 0 ; i < input.length ; i++){
			if(i != 0) System.out.print(", ");
			System.out.print(input[i]);
		}
		System.out.println("]");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {15, 8, 9, 10, 13, 22, 41, 9};
		printArray(input);
		printArray(changeMinMax(input));
	}

}
