package sdpwj.gui;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Przedmiot implements Serializable{
	private static final long serialVersionUID = 1L;
	Map<Integer, String> godziny = new TreeMap<>();
	String nazwa = "";
	ArrayList<Integer> ilo��_wolnych= new ArrayList<Integer>();

	
	
	public Przedmiot(String nazwa, Map<Integer, String> godziny ,ArrayList<Integer> ilo��_wolnych){
		this.nazwa = nazwa;
		this.godziny = godziny;
		this.ilo��_wolnych = ilo��_wolnych;

	}


	public Map<Integer, String> getGodziny() {
		return godziny;
	}


	@Override
	public String toString() {
		return "Przedmiot [godziny=" + godziny + ", nazwa=" + nazwa + ", ilo��_wolnych=" + ilo��_wolnych + "]";
	}


	public void setGodziny(Map<Integer, String> godziny) {
		this.godziny = godziny;
	}


	public String getNazwa() {
		return nazwa;
	}


	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}


	public ArrayList<Integer> getIlo��_wolnych() {
		return ilo��_wolnych;
	}


	public void setIlo��_wolnych(ArrayList<Integer> ilo��_wolnych) {
		this.ilo��_wolnych = ilo��_wolnych;
	}



}
