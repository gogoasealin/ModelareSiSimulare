package aparatCafea;

import java.util.HashMap;

public class MasinaDeStari {
	
	int stareaCurenta;
	public HashMap<Integer, HashMap<Integer, Integer>> matriceAdiacenta;
	
	MasinaDeStari()//Pentru a permite constructorul AparatCafea
	{
	}
	
	MasinaDeStari(int stareaCurenta)
	{
		this.stareaCurenta = stareaCurenta;
	}
	
	
	
    public void TranzitieStare(int stareaUrmatoare)
    {
    	if(matriceAdiacenta.get(stareaCurenta).get(stareaUrmatoare)!=null)
		{
			stareaCurenta = matriceAdiacenta.get(stareaCurenta).get(stareaUrmatoare);
		}else System.out.println("Inputul introdus nu este valid");
    }

	
}
