import java.util.Scanner;

public class Gugudan {
	
	public static int[] calculate(int times) {
		
		int[] result = new int[9];
		for(int i=0; i<result.length; i++) {
			result[i] = times * (i+1);
		}
		return result;
		
	}
	
	public static void print(int[] result) {
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
		
	}	
	

	public static void main(String[] args) {
		
		for(int i=2; i<10; i++) {
			System.out.println("*** " + i +"단  ***");
			int[] result = calculate(i);
			print(result);
		}
		
		// 2단
		/*System.out.println(2 * 1);
		System.out.println(2 * 2);
		System.out.println(2 * 3);
		System.out.println(2 * 4);
		System.out.println(2 * 5);
		System.out.println(2 * 6);
		System.out.println(2 * 7);
		System.out.println(2 * 8);
		System.out.println(2 * 9);
		System.out.println();*/
		
		// 3단
		/*System.out.println(3 * 1);
		System.out.println(3 * 2);
		System.out.println(3 * 3);
		System.out.println(3 * 4);
		System.out.println(3 * 5);
		System.out.println(3 * 6);
		System.out.println(3 * 7);
		System.out.println(3 * 8);
		System.out.println(3 * 9);
		System.out.println();*/
		
		/*// 4단
		int number = 4;
		int result = number * 1;
		System.out.println(result);
		result = number * 2;
		System.out.println(result);
		result = number * 3;
		System.out.println(result);
		result = number * 4;
		System.out.println(result);
		result = number * 5;
		System.out.println(result);
		result = number * 6;
		System.out.println(result);
		result = number * 7;
		System.out.println(result);
		result = number * 8;
		System.out.println(result);
		result = number * 9;
		System.out.println(result);
		System.out.println();*/
		
		/*// 5단
		int number5 = 5;
		int result5 = number5 * 1;
		System.out.println(result5);
		result5 = number5 * 2;
		System.out.println(result5);
		result5 = number5 * 3;
		System.out.println(result5);
		result5 = number5 * 4;
		System.out.println(result5);
		result5 = number5 * 5;
		System.out.println(result5);
		result5 = number5 * 6;
		System.out.println(result5);
		result5 = number5 * 7;
		System.out.println(result5);
		result5 = number5 * 8;
		System.out.println(result5);
		result5 = number5 * 9;
		System.out.println(result5);
		System.out.println();*/
		
		/*System.out.println("구구단중 출력할 단은?: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int i;
		for(i=1; i<10; i++) {
			System.out.println(number * i);
		}*/
		
	/*	int i = 1;
		while(i < 10) {
			System.out.println(6 * i);
			i++;
		}
		
		for(int j = 1; j<10; j++) {
			System.out.println(7 * j);
		}*/
		
		//8,9단
		
		/*System.out.println("구구단중 출력할 단은?: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		System.out.println("사용자가 입력한 값: " + number);
		if(number < 2) {
			System.out.println("구구단 범위가 아닙니다.");
		} else if(number >9){
			System.out.println("구구단 범위가 아닙니다.");
		} else {
			for(int i = 1; i < 10; i++) {
				System.out.println(number * i);
			}
		}
		
		
		boolean run = true;
		while(run){
			
			System.out.println("구구단중 출력할 단은?: ");
			Scanner scanner = new Scanner(System.in);
			int number = scanner.nextInt();
			System.out.println("사용자가 입력한 값: " + number);
			
			
			if(number < 2 || number >10) {
				System.out.println("구구단 범위가 아닙니다.");
				
			} else {
				for(int i = 1; i < 10; i++) {
					System.out.println(number * i);
				}
				break;
			}
			
		}*/
		/*int[] first = new int[9];
		int[] result = new int[9];
        for(int i=2; i<=first.length; i++) {
           System.out.println("*** " + i +"단  ***");
           for (int j=1; j<=result.length; j++) {
        	   System.out.println(i + " * " + j + " = " + i*j);
           }*/
        }

        
    }
