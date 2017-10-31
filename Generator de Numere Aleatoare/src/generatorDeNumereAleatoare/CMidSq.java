package generatorDeNumereAleatoare;

public class CMidSq implements IGenerator{
	static int midSqSeed = 2415;
	static int[] midSqSeedTest = new int[11];
	static int nrExecutie = 0;
	
	@Override
	public float Next(){
		float numarGenerat;
		
		midSqSeedTest[nrExecutie] = midSqSeed;
		midSqSeed = midSqSeed * midSqSeed;
		midSqSeed /= 100;
		numarGenerat = midSqSeed % 10000;
		midSqSeed = Math.round(numarGenerat);
		for(int i = 0;i < midSqSeedTest.length ; i++){
			if(midSqSeed == midSqSeedTest[i]){
				if(numarGenerat > 5000){
					numarGenerat -= 121f;
					midSqSeed = Math.round(numarGenerat);
				}
				else if(numarGenerat < 5000){
					numarGenerat += 215f;
					midSqSeed = Math.round(numarGenerat);
				}
			}
		}
		nrExecutie++;
		if(nrExecutie > 10){
			nrExecutie = 0;	
		}
		return numarGenerat/10000;
	}
}
