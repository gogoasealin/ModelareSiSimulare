package aparatCafeaPetri;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		PetriNetMasinaDeCafea petriNetMasinaDeCafea = new PetriNetMasinaDeCafea();
		Scanner scanner = new Scanner(System.in);
		int input = 0;
	
		while(true)
		{
			System.out.println("Credit: " + petriNetMasinaDeCafea.GetCurrentState());
			System.out.println("Introduceti o moneda: ");
			input += scanner.nextInt();
			
			switch(input)
			{
			case 5: petriNetMasinaDeCafea.Exec("goStarea5");
			break;
			case 10: petriNetMasinaDeCafea.Exec("goStarea10");
			break;
			case 15: petriNetMasinaDeCafea.Exec("goStarea15");
			break;
			case 20: petriNetMasinaDeCafea.Exec("goStarea20");
			break;
			case 25: petriNetMasinaDeCafea.Exec("goStarea25");
			break;
			}
			System.out.println(input);

		}
		
	}

}
