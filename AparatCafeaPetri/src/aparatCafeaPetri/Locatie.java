package aparatCafeaPetri;

public class Locatie {
	
	String m_tag;
	int m_jeton;
	
    Locatie(String tag){
		this.m_tag = tag;
		m_jeton = 0;
	}
	
    Locatie(String tag,int m_jeton){
		this.m_tag = tag;
		this.m_jeton = m_jeton;
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
