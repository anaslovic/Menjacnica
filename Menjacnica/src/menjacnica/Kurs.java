package menjacnica;

import java.util.GregorianCalendar;

public class Kurs {
	private GregorianCalendar datum;
	private double kupovni;
	private double prodajni;
	private double srednji;
	
	public GregorianCalendar getDatum() {
		return datum;
	}
	public void setDatum(GregorianCalendar datum) {
		if(datum==null)
			throw new RuntimeException("Datum ne moze biti null!");
		this.datum = datum;
	}
	public double getKupovni() {
		return kupovni;
	}
	public void setKupovni(double kupovni) {
		if(kupovni<=0)
			throw new RuntimeException("Kupovni kurs mora biti veci od nule.");
		this.kupovni = kupovni;
	}
	public double getProdajni() {
		return prodajni;
	}
	public void setProdajni(double prodajni) {
		if(prodajni<=0)
			throw new RuntimeException("Prodajni kurs mora biti veci od nule.");
		this.prodajni = prodajni;
	}
	public double getSrednji() {
		return srednji;
	}
	public void setSrednji(double srednji) {
		if(srednji<=0)
			throw new RuntimeException("Srednji kurs mora biti veci od nule.");
		this.srednji = srednji;
	}
	@Override
	public String toString() {
		return "Dnevni kurs:\t Datum:"+datum+" Prodajni kurs:"+prodajni+" Kupovni kurs:"+kupovni+" Srednji kurs:"+srednji;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		long temp;
		temp = Double.doubleToLongBits(kupovni);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(prodajni);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(srednji);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Kurs))
			throw new RuntimeException("Uneti objekat nije kurs.");
		Kurs k = (Kurs)obj;
		if(k.getDatum().compareTo(datum)==0 && k.getKupovni()==kupovni && k.getProdajni()==prodajni && k.getSrednji()==srednji)
			return true;
		return false;
	}
	
	
	
}
