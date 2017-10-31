package generatorDeNumereAleatoare;

public class Main {

	static CMidSq midSq = new CMidSq();
	static CLCG lcg = new CLCG(); 
	static CEvaluator midSqEvaluator = new CEvaluator(midSq , 1000);
 	static CEvaluator lcgEvaluator = new CEvaluator(lcg , 1000);
 	static CBinomialGenerator midSqBinomial = new CBinomialGenerator(midSq, 1000, 0.9f);
	static CBinomialGenerator lcgBinomial = new CBinomialGenerator(lcg, 1000, 0.9f);
	static CPoissonGenerator midSqPoisson = new CPoissonGenerator(midSq, 1000, 2.2f, 3f);
	static CPoissonGenerator lcgPoisson = new CPoissonGenerator(lcg, 1000, 2.2f, 3f);
	
	public static void main(String[] args) {
		float rezultat;
		
////////////////////////////////////////////////////////////
		/// folosirea metodelor
		System.out.println("Metoda LCG ");
		for(int i=0; i< 20 ; i++){
			rezultat = lcg.Next();		
			System.out.println(rezultat);
		}
		
		System.out.println("Metoda MidSq ");
		for(int i=0; i< 20 ; i++){
			rezultat = midSq.Next();		
			System.out.println(rezultat);
		}
		
		////////////////////////////////////////////////////////////
		/// Evaluatorul metodelor
		System.out.println("Metoda MidSq-Evaluator ");
			rezultat = midSqEvaluator.Evaluate();
			System.out.println(rezultat);
		
		
	    System.out.println("Metoda lcg-Evaluator ");
			rezultat = lcgEvaluator.Evaluate();
			System.out.println(rezultat);
	
////////////////////////////////////////////////////////////
			////// Generator binomial
		System.out.println("Metoda midSq-BinomialGenerator ");
			rezultat = midSqBinomial.Next();
			System.out.println(rezultat);	
			
	    System.out.println("Metoda lcg-BinomialGenerator ");
			rezultat = lcgBinomial.Next();
			System.out.println(rezultat);
			
////////////////////////////////////////////////////////////
			//// Generator Poisson
		System.out.println("Metoda midSq-Poisson ");
			rezultat = midSqBinomial.Next();
			System.out.println(rezultat);	
			
	    System.out.println("Metoda lcg-Poisson ");
			rezultat = lcgBinomial.Next();
			System.out.println(rezultat);
			
		
		
		
	}

}
