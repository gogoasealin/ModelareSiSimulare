package aparatCafeaPetri;

import java.util.ArrayList;

public class ReaderWriter extends PetriNet{
	
	ReaderWriter()
	{
		m_MatriceTranziti = new ArrayList<Tranzitie>();
		
		Locatie Read = new Locatie("Read");
		Locatie StopRead = new Locatie("StopRead");
		Locatie Write = new Locatie("Write");

		
		
		m_MatriceTranziti.add(new Tranzitie("Read", new ArrayList<Arc>(){{
			add(new Arc(1, Directie.iesire, Read));
			add(new Arc(1, Directie.intrare, StopRead));
			}}
		));
		
		m_MatriceTranziti.add(new Tranzitie("StopRead", new ArrayList<Arc>(){{
			add(new Arc(1, Directie.iesire, StopRead));
			add(new Arc(1, Directie.intrare, Read));
			}}
		));
		m_MatriceTranziti.add(new Tranzitie("Write", new ArrayList<Arc>(){{
			add(new Arc(1, Directie.iesire, Read));
			add(new Arc(1, Directie.intrare, Write));
			}}
		));
		
		m_MatriceTranziti.add(new Tranzitie("StopWrite", new ArrayList<Arc>(){{
			add(new Arc(1, Directie.iesire, Write));
			add(new Arc(1, Directie.intrare, Read));
			}}
		));
		
	}
	
	
}
