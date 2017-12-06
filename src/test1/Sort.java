package test1;

public class Sort {

	public static void main(String[] args) {
		int[] numberList = {10,5,3,4,6,9,5,6};
		int pass=0;
		int temp;
		int counter = 0;
		for(int x =0; x<numberList.length; x++){
			for(int y = 0; y<numberList.length-1; y+=2){
				if(numberList[y]>numberList[y+1]){
					temp =numberList[y+1];
					numberList[y+1] = numberList[y];
					numberList[y] = temp;
				}
				counter++;
			}
		}
		System.out.println(counter);
//			for (int i = 0; i < numberList.length; i++) {
//				System.out.println(numberList[i]);
//			}
	}
	
	

}
