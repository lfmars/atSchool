package test1;

import java.util.Random;

public class GuessNumber {

	static int max = 100;
	static int min = 1;
	
	public static void main(String[] args) {
		Random random = new Random();
		
		int myRandom = random.nextInt(max)+min;
		System.out.println(myRandom);
		int guessingNumber = random.nextInt(max)+min;
		System.out.println(guessingNumber);
		int counter = 0;
		
		while(true){
			counter++;
			if(myRandom == guessingNumber){
				break;
			}
			System.out.println("bandom spet su " + guessingNumber );
			check(myRandom, guessingNumber);
			guessingNumber = random.nextInt(max)+min;
		
		}	
		System.out.println("buvo skaicius " + myRandom);
		System.out.println("bandyts spet " + counter + " kartu ;)");
}
	
	public static void check(int ran, int guess){
		if (ran>guess){
			min = guess;
			max = max-guess;
		}else{
			max = guess;
		}
	}
}