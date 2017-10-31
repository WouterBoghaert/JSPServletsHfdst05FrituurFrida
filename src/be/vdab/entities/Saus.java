package be.vdab.entities;

public class Saus {
	private long nummer;
	private String naam;
	private String[] ingredi�nten;
	
	public Saus() {
	}

	public Saus(long nummer, String naam, String[] ingredi�nten) {
		this.nummer = nummer;
		this.naam = naam;
		this.ingredi�nten = ingredi�nten;
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

	public String[] getIngredi�nten() {
		return ingredi�nten;
	}

	public void setIngredi�nten(String[] ingredi�nten) {
		this.ingredi�nten = ingredi�nten;
	}
}
