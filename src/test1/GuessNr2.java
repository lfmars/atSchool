package test1;

import java.util.Random;

public class GuessNr2 {

	static int min =1;
	static int max = 100;
	
	public static void main(String[] args){
		Random random = new Random();
		
		int secretNumber = random.nextInt(100)+1;
		int guessNumber = (min + max)/2;
		int check = 0;
		while(true){
			check++;
			if(check(guessNumber, secretNumber)){
				break;
			}
			guessNumber = (min + max)/2;
		}
		System.out.println(check);
	}
	
	static boolean check(int guess, int secret){
		if(guess ==  secret){
			return true;
		}else if(guess > secret){
			max=guess;
		}else{
			min=guess+1;
		}
		return false;
	}
}
