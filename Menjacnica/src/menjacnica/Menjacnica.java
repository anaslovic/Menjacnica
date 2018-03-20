package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import interfejsZaMenjacnicu.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {
	private LinkedList<Valuta> valute = new LinkedList<Valuta>();
	@Override
	public void dodajKurs(String valuta, GregorianCalendar datum, double prodajni, double kupovni, double srednji) {
		if(valuta==null) {
            System.out.println("Valuta ne moze biti null.");
            return;
        }
        Kurs novi = new Kurs(); 
        novi.setDatum(datum); 
        novi.setKupovni(kupovni); 
        novi.setProdajni(prodajni); 
        novi.setSrednji(srednji); 
        for(int i=0;i<valute.size();i++) { 
            if(valute.get(i).getNaziv().equals(valuta)) { 
                if(valute.get(i).getKursevi().contains(novi)) 
                    throw new RuntimeException("Uneti kurs vec postoji za unetu valutu."); 
                valute.get(i).getKursevi().addLast(novi); 
            } 
        } 
	}

	@Override
	public void obrisiKurs(String valuta, GregorianCalendar datum) {
		if(valuta==null || datum==null) 
            throw new RuntimeException("Nijedan od parametara ne sme biti null"); 
        for(int i=0;i<valute.size();i++) 
            if(valute.get(i).getNaziv().equals(valuta)) 
                for(int j=0;j<valute.get(i).getKursevi().size();j++) 
                    if(valute.get(i).getKursevi().get(j).getDatum().compareTo(datum)==0) { 
                        valute.get(i).getKursevi().remove(j);  
                    } 
	}

	@Override
	public Kurs vratiKurs(String valuta, GregorianCalendar datum) {
		if(valuta==null || datum==null) {
			System.out.println("Nijedan od parametara ne moze biti null.");
			return null;
		} 
        for(int i=0;i<valute.size();i++) 
            if(valute.get(i).getNaziv().equals(valuta)) 
                for(int j=0;j<valute.get(i).getKursevi().size();j++) 
                    if(valute.get(i).getKursevi().get(j).getDatum().compareTo(datum)==0) 
                        return valute.get(i).getKursevi().get(j);
		return null;
	}
}
