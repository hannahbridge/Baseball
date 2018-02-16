public class BaseballStat 
{	
	private int Hits;
	private int AB;
	private int BB;
	private int HBP;
	private int SF;
	private int singles;
	private int doubles;
	private int triples;
	private int HR;
	
	private double BA;
	private double OBP;
	private double SLG;
	private double OBS;
	private double TB;
	
	public BaseballStat(int hits, int aB, int bB, int hBP, int sF, int doubles, int triples, int hR) 
	{
		super();
		Hits = hits;
		AB = aB;
		BB = bB;
		HBP = hBP;
		SF = sF;
		this.doubles = doubles;
		this.triples = triples;
		HR = hR;
		
		singles = this.Hits - this.doubles - this.triples - this.HR;
		this.BA = this.calculateBA();
		this.OBP = this.calculateOBP();
		this.SLG = this.calculateSLG();
		this.OBS = this.calculateOBS();
		this.TB = this.calculateTB();
		
	}
	public double calculateBA()
	{
		return (double)this.Hits / (double)this.AB;
	}
	public double getBA()
	{
		return this.BA;
	}
	public double calculateOBP()
	{
		return ((double)this.Hits + (double)this.BB + (double)this.HBP) / ((double)this.AB + (double)this.BB + (double)this.HBP + (double)this.SF);
	}
	public double getOBP()
	{
		return this.OBP;
	}
	public double calculateSLG()
	{
		return (((double)singles + (2.0 * (double)this.doubles) + (3.0 * (double)this.triples) + (4.0 * (double)this.HR)) / (double)this.AB);
	}
	public double getSLG()
	{
		return this.SLG;
	}
	public double calculateOBS()
	{
		return this.OBP + this.SLG;
	}
	public double getOBS()
	{
		return this.OBS;
	}
	public double calculateTB()
	{
		return (double)singles + (2.0 * (double)this.doubles) + (3.0 * (double)this.triples) + (4.0 * (double)this.HR);
	}
	public double getTB()
	{
		return this.TB;
	}
	public int getHits() 
	{
		return Hits;
	}
	public void setHits(int hits) 
	{
		Hits = hits;
	}
	public int getAB() 
	{
		return AB;
	}
	public void setAB(int aB) 
	{
		AB = aB;
	}
	public int getBB() 
	{
		return BB;
	}
	public void setBB(int bB) 
	{
		BB = bB;
	}
	public int getHBP() 
	{
		return HBP;
	}
	public void setHBP(int hBP) 
	{
		HBP = hBP;
	}
	public int getSF() 
	{
		return SF;
	}
	public void setSF(int sF) 
	{
		SF = sF;
	}
	public int getDoubles() 
	{
		return doubles;
	}
	public void setDoubles(int doubles) 
	{
		this.doubles = doubles;
	}
	public int getTriples() 
	{
		return triples;
	}
	public void setTriples(int triples) 
	{
		this.triples = triples;
	}
	public int getHR() 
	{
		return HR;
	}
	public void setHR(int hR) 
	{
		HR = hR;
	}	
}
