package aparatCafeaPetri;

public class Arc {
	
	int m_capacitate;
	Directie m_directie;
	Locatie m_locatie;

	
	Arc(int capacitate, Directie directie, Locatie locatie)
	{
		this.m_capacitate = capacitate;
		this.m_directie = directie;
		this.m_locatie = locatie;
	}
	
	boolean IsValid()
	{
		if(m_directie == Directie.intrare)
		{
			return true;
		}else 
			return (m_capacitate <= m_locatie.GetJeton());
		
	}
	
	void Update()
	{
		if(m_directie == Directie.intrare)
		{
			m_locatie.UpdateJeton(m_capacitate);
		}
		else 
		{
			m_locatie.UpdateJeton(-m_capacitate);
		}
	}
	
	public Locatie GetLocation()
	{
		return m_locatie;
	}
}
