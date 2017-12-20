package aparatCafeaPetri;

import java.util.ArrayList;

public class PetriNetMasinaDeCafea extends PetriNet{

	PetriNetMasinaDeCafea()
	{
		m_MatriceTranziti = new ArrayList<Tranzitie>();
		
		Locatie starea0 = new Locatie("starea0");
		Locatie starea5 = new Locatie("starea5");
		Locatie starea10 = new Locatie("starea10");
		Locatie starea15 = new Locatie("starea15");
		Locatie starea20 = new Locatie("starea20");
		Locatie starea25 = new Locatie("starea25");
		
		starea0.UpdateJeton(1);
		
		m_MatriceTranziti.add(new Tranzitie("goStarea5", new ArrayList<Arc>(){{
			add(new Arc(1, Directie.iesire, starea0));
			add(new Arc(1, Directie.intrare, starea5));
			}}
		));
		
		m_MatriceTranziti.add(new Tranzitie("goStarea5", new ArrayList<Arc>(){{
			add(new Arc(1, Directie.iesire, starea5));
			add(new Arc(1, Directie.intrare, starea10));
			}}
		));
		m_MatriceTranziti.add(new Tranzitie("goStarea5", new ArrayList<Arc>(){{
			add(new Arc(1, Directie.iesire, starea10));
			add(new Arc(1, Directie.intrare, starea15));
			}}
		));
		
		m_MatriceTranziti.add(new Tranzitie("goStarea5", new ArrayList<Arc>(){{
			add(new Arc(1, Directie.iesire, starea15));
			add(new Arc(1, Directie.intrare, starea20));
			}}
		));
		
		m_MatriceTranziti.add(new Tranzitie("goStarea5", new ArrayList<Arc>(){{
			add(new Arc(1, Directie.iesire, starea20));
			add(new Arc(1, Directie.intrare, starea25));
			}}
		));
		
		m_MatriceTranziti.add(new Tranzitie("goStarea10", new ArrayList<Arc>(){{
			add(new Arc(1, Directie.iesire, starea0));
			add(new Arc(1, Directie.intrare, starea10));
			}}
		));
		
		m_MatriceTranziti.add(new Tranzitie("goStarea10", new ArrayList<Arc>(){{
			add(new Arc(1, Directie.iesire, starea5));
			add(new Arc(1, Directie.intrare, starea15));
			}}
		));
		
		m_MatriceTranziti.add(new Tranzitie("goStarea10", new ArrayList<Arc>(){{
			add(new Arc(1, Directie.iesire, starea10));
			add(new Arc(1, Directie.intrare, starea20));
			}}
		));
		
		m_MatriceTranziti.add(new Tranzitie("goStarea10", new ArrayList<Arc>(){{
			add(new Arc(1, Directie.iesire, starea15));
			add(new Arc(1, Directie.intrare, starea25));
			}}
		));

		m_MatriceTranziti.add(new Tranzitie("cumparare", new ArrayList<Arc>(){{
			add(new Arc(1, Directie.iesire, starea20));
			add(new Arc(1, Directie.intrare, starea0));
			}}
		));
		
		m_MatriceTranziti.add(new Tranzitie("cumparare", new ArrayList<Arc>(){{
			add(new Arc(1, Directie.iesire, starea25));
			add(new Arc(1, Directie.intrare, starea5));
			}}
		));
	}
	
	
	public String GetCurrentState()
	{
		for(Tranzitie tranzitie : m_MatriceTranziti)
		{
			ArrayList<Locatie> locatii = tranzitie.GetLocations();
			for(Locatie locatie : locatii)
			{
				if(locatie.GetJeton() == 1)
				{
					return locatie.GetTag();
				}
			}
		}
		return null;
	}
	
}
