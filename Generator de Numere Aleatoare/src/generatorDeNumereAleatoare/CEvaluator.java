package generatorDeNumereAleatoare;


public class CEvaluator {
    IGenerator generator;
    int nrPuncte;
	CEvaluator(IGenerator generator, int nrPuncte){
		this.generator = generator;
		this.nrPuncte = nrPuncte;
	}
	
	float Evaluate(){
		float x,y,eroarea;
		
		int nrPuncteInSfertDeCerc= 0;
		for (int i = 0; i < nrPuncte;i++){
			x = generator.Next();
			y = generator.Next();
			float suma = (x*x) + (y*y);
			if(suma < 1){
				nrPuncteInSfertDeCerc++;
			}

		}
		eroarea = Math.abs(3.14f - (4*(float)nrPuncteInSfertDeCerc/nrPuncte));
		
		return eroarea;
	}
	
	
}
