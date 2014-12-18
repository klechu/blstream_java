package kleszcz.damian;

public class First {

	public static void main(String[] args) {
	
		if(args.length == 1)
			for (int i = args[0].length()-1 ; i >= 0 ; i--)
				System.out.print(args[0].charAt(i));
		else if(args.length == 0)
			System.out.print("BRAK ARGUMENTU");
		else
			System.out.print("PODAJ TYLKO JEDEN ARGUMENT");

	}

}
