package damian_kleszcz;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


public class ZAD_2 {
	private static Scanner dateInput;


	public static void main(String[] args) throws FileNotFoundException{
		
	
		float[] numbers = fileReader();
		
		System.out.println("\nPrzed sortowaniem: ");
		showArray(numbers);
		Arrays.sort(numbers);
		System.out.println("\nPo sortowaniu: ");
		showArray(numbers);
		
		float s = sum (numbers);
		System.out.println("suma: "+s+"\n");
		
		float a = average (s, numbers.length);
		System.out.println("œrednia: "+a+"\n");
	}
	
	private static float sum (float[] numbers){
		float s =  0;
		for (int i=0; i<numbers.length; i++)
			s = s + numbers[i];
		return s;
	}
	
	private static float average (float sum, int elements){
		float a = sum / elements;
		return a;
	}
	
	private static void showArray(float[] numbers){
		System.out.print("[");
		for(int i=0; i<numbers.length-1;i++){
			System.out.print(numbers[i]);
			if (i != numbers.length-2)
				System.out.print("][");
		}
		System.out.print("]\n");

	}
	
	
	private static float[] fileReader() throws FileNotFoundException{
		String oneLine;
		dateInput = new Scanner(new File("dane.txt"));
		int size = 0;
		while(dateInput.hasNext()){
			size++;
			dateInput.next();
		}	
		dateInput.close();
		dateInput = new Scanner(new File("dane.txt"));
		float[] numbers = new float[size];
		int lastOne = 0;
		
		
		while(dateInput.hasNext()){
		
			oneLine = dateInput.next();
			numbers[lastOne] = Float.parseFloat(oneLine);
			lastOne++;
			
		}
		return numbers;
	}
	

}

