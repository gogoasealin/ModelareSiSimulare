package aparatCafeaPetri;

import java.util.LinkedList;


public class PetriNet {
	
	LinkedList<Tranzitie> m_MatriceTranziti; 
	
	PetriNet()
	{
		m_MatriceTranziti = new LinkedList<Tranzitie>();
	}
		
    public void Exec(String stareaUrmatoare)
    {

    	for(Tranzitie tranzitie : m_MatriceTranziti)
    	{
    		if(tranzitie.GetTag() == stareaUrmatoare && tranzitie.IsValid())
    		{
    			tranzitie.Update();
    			return;
    		}
    	}
    }
}
