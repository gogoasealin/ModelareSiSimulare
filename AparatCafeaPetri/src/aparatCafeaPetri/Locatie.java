package aparatCafeaPetri;

public class Locatie {
	
	String m_tag;
	int m_jeton;
	
	Locatie(String Tag){
		this.m_tag = Tag;
		m_jeton = 0;
	}
	
	public boolean UpdateJeton(int valoare)
	{
		int rezultat = m_jeton + valoare;
		if(rezultat < 0)
		{
			return false;
		}
		m_jeton = rezultat;
		return true;
	}
	
	public int GetJeton()
	{
		return m_jeton;
	}
	
	public String GetTag()
	{
		return m_tag;
	}
	
	
	
}
