package aparatCafeaPetri;

import java.util.LinkedList;

public class Tranzitie {
	
	String m_tag;
	LinkedList<Arc> m_listaArce;
	
	
	Tranzitie(String Tag, LinkedList<Arc> ListaArce)
	{
		this.m_tag = Tag;
		this.m_listaArce = ListaArce;
		
	}
	
	boolean IsValid()
	{
		for(Arc arc : m_listaArce)
		{
			if(!arc.IsValid()) {
				return false;
			}
		}
		return true;
	}
	
	public String GetTag()
	{
		return m_tag;
	}
	
	public void Update()
	{
		for(Arc arc : m_listaArce)
		{
			arc.Update();
		}
	}
	
	public LinkedList<Locatie> GetLocations()
	{
		LinkedList<Locatie> locatii = new LinkedList<Locatie>();
		for(Arc arc : m_listaArce)
		{
			locatii.add(arc.GetLocation());
		}
		return locatii;
	}
}
