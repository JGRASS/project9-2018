package recept;

import java.util.LinkedList;

import recept.sastojak.Sastojak;

public class Recept {
	private String ime;
	private LinkedList<Sastojak> sastojci=new LinkedList<Sastojak>();
	private String uputstvo;
	private int vreme;
	
	public Recept(String ime,  String uputstvo,int vreme) {
		this.ime = ime;
		this.uputstvo = uputstvo;
		this.vreme=vreme;
	}
	public Recept(String ime) {
		this.ime = ime;
	}
	public Recept(String ime,  LinkedList<Sastojak> sastojci, String uputstvo,int vreme) {
		
		this.ime = ime;
		this.sastojci = sastojci;
		this.uputstvo = uputstvo;
		this.vreme=vreme;
	}
	
	public boolean posan() {
		for(Sastojak i:sastojci)
			if(!i.isPosan())
				return false;
		
		
		return true;
	}
	private boolean sadrzi(LinkedList<Sastojak> sastojci   ,Sastojak s) {
		return sastojci.contains(s);
				
	}
	public boolean sadrzana(LinkedList<Sastojak> lista) {
		for(Sastojak i:sastojci) {
			if(!sadrzi(lista, i))
				return false;
		}
		
		return true;
	}
	public void dodajSastojak(Sastojak s) {
		if(s==null)throw new NullPointerException();
		if(!sastojci.contains(s))
			sastojci.add(s);
	}
	
	
	
	
	
	
	
	
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	
	public LinkedList<Sastojak> getSastojci() {
		return sastojci;
	}
	public void setSastojci(LinkedList<Sastojak> sastojci) {
		this.sastojci = sastojci;
	}
	public String getUputstvo() {
		return uputstvo;
	}
	public void setUputstvo(String uputstvo) {
		this.uputstvo = uputstvo;
	}
	public int getVreme() {
		return vreme;
	}
	public void setVreme(int vreme) {
		this.vreme = vreme;
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
		Recept other = (Recept) obj;
		if (ime == null) {
			if (other.ime != null)
				return false;
		} else if (!ime.equals(other.ime))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return this.ime;
	}
	
	
	
	
	
	
	
}
