package be.vdab.entities;

public class Saus {
	private long nummer;
	private String naam;
	private String[] ingrediŽnten;
	
	public Saus() {
	}

	public Saus(long nummer, String naam, String[] ingrediŽnten) {
		this.nummer = nummer;
		this.naam = naam;
		this.ingrediŽnten = ingrediŽnten;
	}

	public long getNummer() {
		return nummer;
	}

	public void setNummer(long nummer) {
		this.nummer = nummer;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String[] getIngrediŽnten() {
		return ingrediŽnten;
	}

	public void setIngrediŽnten(String[] ingrediŽnten) {
		this.ingrediŽnten = ingrediŽnten;
	}
}
