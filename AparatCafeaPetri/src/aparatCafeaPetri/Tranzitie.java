package aparatCafeaPetri;

import java.util.ArrayList;
import java.util.LinkedList;

public class Tranzitie {
	
	String m_tag;
	ArrayList<Arc> m_listaArce;
	
	
	Tranzitie(String Tag, ArrayList<Arc> arrayList)
	{
		this.m_tag = Tag;
		this.m_listaArce = arrayList;
		
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
	
	public ArrayList<Locatie> GetLocations()
	{
		ArrayList<Locatie> locatii = new ArrayList<Locatie>();
		for(Arc arc : m_listaArce)
		{
			locatii.add(arc.GetLocation());
		}
		return locatii;
	}
}
