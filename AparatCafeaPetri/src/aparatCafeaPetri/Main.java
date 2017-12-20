package aparatCafeaPetri;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
	    boolean cumparareCafea = false;
		PetriNetMasinaDeCafea petriNetMasinaDeCafea = new PetriNetMasinaDeCafea();
		Scanner scanner = new Scanner(System.in);
		int input = 0;
	
		while(true)
		{
			System.out.println("Credit: " + petriNetMasinaDeCafea.GetCurrentState());
			System.out.println("Introduceti o moneda intre 5 si 10 sau 0 pentru a cumpara cafea: ");
			input = scanner.nextInt();
			
			if(petriNetMasinaDeCafea.GetCurrentState() == "starea20" || petriNetMasinaDeCafea.GetCurrentState() == "starea25")
			{
				cumparareCafea = true;
			}
			if(input == 0) {
				if(cumparareCafea) {
					petriNetMasinaDeCafea.Exec("cumparare");
					cumparareCafea = false;
					System.out.println("Cafeaua se pregateste! ");
				}else System.out.println("Nu aveti suficienti bani pentru a cumpara cafea");
			}
			else if(input == 5) {
				petriNetMasinaDeCafea.Exec("goStarea5");
			}
			else if(input == 10)
			{
			petriNetMasinaDeCafea.Exec("goStarea10");
			}
				
		
			
		}
		

		
	}

}
