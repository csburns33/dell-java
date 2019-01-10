package calculator;

public class Fib {
	
	public static void main(String[] args) {
		getFibNumatPos(6);
	}
	
	public static int getFibNumatPos(int index) {
		
		int counter = 0;
		int firstNum = 1;
		int secondNum = 1;
		System.out.println("index: " + index);
		
		if (counter < index) {
			counter = firstNum + secondNum;
			System.out.println(counter);
			firstNum = secondNum;
			secondNum = counter;
		}
		System.out.println(counter);
		return counter;
		
		
		
	}

}
