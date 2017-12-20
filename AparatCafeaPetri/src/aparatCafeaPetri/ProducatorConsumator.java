package aparatCafeaPetri;

import java.util.ArrayList;

public class ProducatorConsumator extends PetriNet {
	
    ProducatorConsumator(int numarProducatori, int numarConsumatori, int numarLocuriLibere)
	{
    	m_MatriceTranziti = new ArrayList<Tranzitie>();
		m_TranzitiValide = new ArrayList<Tranzitie>();
				
		Locatie producatori = new Locatie("Producatori", numarProducatori);
		Locatie consumatori = new Locatie("Consumatori", numarConsumatori);
		Locatie elementProdus = new Locatie("ElementWrite", 0);
		Locatie elementConsumat = new Locatie("ElementRead", 0);
		Locatie locuriLibere = new Locatie("LocuriLibere", numarLocuriLibere);
		Locatie locuriPline = new Locatie ("LocuriPline", 0);
		Locatie mutex = new Locatie("Mutex", 1);
		
		m_MatriceTranziti.add(new Tranzitie("Produs", new ArrayList<Arc>(){
			{
				add(new Arc(1, Directie.iesire, producatori));
				add(new Arc(1, Directie.intrare, elementProdus));
			}
		}));
		
		m_MatriceTranziti.add(new Tranzitie("Push", new ArrayList<Arc>(){
			{
				add(new Arc(1, Directie.iesire, elementProdus));
				add(new Arc(1, Directie.iesire, mutex));
				add(new Arc(1, Directie.intrare, mutex));
				add(new Arc(1, Directie.iesire, locuriLibere));
				add(new Arc(1, Directie.intrare, locuriPline));
			}
		}));
		
		m_MatriceTranziti.add(new Tranzitie("Pop", new ArrayList<Arc>(){
			{
				add(new Arc(1, Directie.intrare, mutex));
				add(new Arc(1, Directie.iesire, mutex));
				add(new Arc(1, Directie.intrare, locuriLibere));
			}
		}));
	}
}
