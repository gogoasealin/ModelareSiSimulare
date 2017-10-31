package generatorDeNumereAleatoare;

public class CPoissonGenerator 
{
	IGenerator generator;
	float e;
	float landa;
	int k;
	int n;
	float p;
	float L;
	
	CPoissonGenerator(IGenerator generator,int n,float e, float landa )
	{
		this.generator = generator;
		this.n = n;
		this.e = e;
		this.landa = landa;
	}
	
	public float Next()
	{
		float u;
		L = (float)Math.pow(e, -landa);
		k = 0;
		p = 1;
		do
		{
			k += 1;
			u = generator.Next();
			System.out.println(u);
			p *= u;
				
		}while(p > L && k < n);
		
		
		return  k-1;
	}
}
