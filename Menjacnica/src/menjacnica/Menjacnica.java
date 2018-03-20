package menjacnica;

import java.util.GregorianCalendar;

import interfejsZaMenjacnicu.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {

	@Override
	public void dodajKurs(String valuta, GregorianCalendar datum, double prodajni, double kupovni, double srednji) {
		
	}

	@Override
	public void obrisiKurs(String valuta, GregorianCalendar datum) {
	
	}

	@Override
	public Kurs vratiKurs(String valuta, GregorianCalendar datum) {
		
		return null;
	}

}
