package interfejsZaMenjacnicu;

import java.util.GregorianCalendar;

import menjacnica.Kurs;

public interface MenjacnicaInterfejs {
	
	public void dodajKurs(String valuta, GregorianCalendar datum, double prodajni, double kupovni, double srednji);
	
	public void obrisiKurs(String valuta, GregorianCalendar datum);
	
	public Kurs vratiKurs(String valuta, GregorianCalendar datum);
}
