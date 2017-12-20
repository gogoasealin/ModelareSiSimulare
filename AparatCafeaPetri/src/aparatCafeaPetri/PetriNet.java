package aparatCafeaPetri;

import java.util.ArrayList;


public class PetriNet {
	
	ArrayList<Tranzitie> m_MatriceTranziti; 
	ArrayList<Tranzitie> m_TranzitiValide; 
	
	PetriNet()
	{
		m_MatriceTranziti = new ArrayList<Tranzitie>();
		m_TranzitiValide = new ArrayList<Tranzitie>();
	}
		
    public void Exec(String stareaUrmatoare)
    {

    	for(Tranzitie tranzitie : m_MatriceTranziti)
    	{
    		if(tranzitie.GetTag() == stareaUrmatoare && tranzitie.IsValid())
    		{
    			m_TranzitiValide.add(tranzitie);
    		}
    	}
    	
    	
    	for(Tranzitie tranzitie: m_TranzitiValide){
    		tranzitie.Update();
    	}
    }
}
