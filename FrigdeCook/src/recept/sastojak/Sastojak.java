package recept.sastojak;

public class Sastojak {
	private String ime;
	private boolean posan;
	
	public Sastojak(String ime, boolean posan) {
		this.ime = ime;
		this.posan = posan;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public boolean isPosan() {
		return posan;
	}
	public void setPosan(boolean posan) {
		this.posan = posan;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ime == null) ? 0 : ime.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sastojak other = (Sastojak) obj;
		if (ime == null) {
			if (other.ime != null)
				return false;
		} else if (!ime.equals(other.ime))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return ime;
	}
	
	
	
	
}
