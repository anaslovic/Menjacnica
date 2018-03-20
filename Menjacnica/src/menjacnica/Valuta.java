package menjacnica;

import java.util.LinkedList;

public class Valuta {
	private String naziv;
	private String skraceniNaziv;
	private LinkedList<Kurs> kursevi = new LinkedList<Kurs>();
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		if(naziv==null || naziv.equals(""))
			throw new RuntimeException("Naziv ne moze biti null niti prazan String!");
		this.naziv = naziv;
	}
	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}
	public void setSkraceniNaziv(String skraceniNaziv) {
		if(skraceniNaziv==null || skraceniNaziv.equals(""))
			throw new RuntimeException("Skraceni naziv ne moze biti null niti prazan String!");
		this.skraceniNaziv = skraceniNaziv;
	}
	public LinkedList<Kurs> getKursevi() {
		return kursevi;
	}
	public void setKursevi(LinkedList<Kurs> kursevi) {
		if(kursevi==null)
			throw new RuntimeException("Prosledili ste praznu listu.");
		this.kursevi = kursevi;
	}
	
	@Override
	public String toString() {
		return "Naziv valute:"+naziv+" Skraceni naziv:"+skraceniNaziv;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kursevi == null) ? 0 : kursevi.hashCode());
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + ((skraceniNaziv == null) ? 0 : skraceniNaziv.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Valuta))
			throw new RuntimeException("Uneti objekat nije valuta!");
		Valuta v = (Valuta)obj;
		if(v.getNaziv().equals(naziv))
			return true;
		return false;
	}
	
	
}
