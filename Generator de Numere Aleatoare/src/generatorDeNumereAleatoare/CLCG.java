package generatorDeNumereAleatoare;

public class CLCG implements IGenerator{
	static int lcgSeed = 10;
	static int[] lcgSeedTest = new int[11];
	static int nrExecutie = 0;
	
	@Override
	public float Next(){
		
		float numarGenerat;
		lcgSeedTest[nrExecutie] = lcgSeed;	
		numarGenerat = (27*lcgSeed+56) % 100;
		
		for(int i = 0;i < lcgSeedTest.length ; i++){
			if(lcgSeed == lcgSeedTest[i]){
				if(numarGenerat > 50){
					numarGenerat -= 0.96f;
					lcgSeed = Math.round(numarGenerat);
				}
				else if(numarGenerat < 50){
					numarGenerat += 0.96f;
					lcgSeed = Math.round(numarGenerat);
				}
			}
		}
		nrExecutie++;
		if(nrExecutie > 10){
			nrExecutie = 0;
			
		}
		lcgSeed = Math.round(numarGenerat);
		return numarGenerat/100;
	} 
}
