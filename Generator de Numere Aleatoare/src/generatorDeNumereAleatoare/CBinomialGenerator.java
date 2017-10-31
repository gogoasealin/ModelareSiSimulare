package generatorDeNumereAleatoare;

public class CBinomialGenerator 
{
	IGenerator generator;
	int n;
	float p;
	
	CBinomialGenerator(IGenerator gen,int n, float p)
	{
		this.generator = gen;
		this.n = n;
		this.p = p;
	}
	
	public float Next()
	{
		int x = 0;
		float u;
		for(int i=0 ; i < n; i++)
		{
			u = generator.Next();
			System.out.println(u);
			if(u < p)
			{
				x++;
			}
		}
		return (float)x/(n-1);
	}
}
