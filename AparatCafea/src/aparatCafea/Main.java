package aparatCafea;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		AparatCafea aparatCafea = new AparatCafea(0);
		Scanner scanner = new Scanner(System.in);
		int input;
	
		while(true)
		{
			System.out.println("Credit: " + aparatCafea.stareaCurenta);
			System.out.println("Introduceti o moneda: ");
			input = scanner.nextInt();
			aparatCafea.TranzitieStare(input);
			if(aparatCafea.stareaCurenta >= 20)
			{
				aparatCafea.stareaCurenta -=20;
				System.out.println("Cafeaua se pregateste.Va rugam asteptati");
			}
		}
	}

}
