package ro.ase.csie.cts.laborator.assignment2;

import java.util.ArrayList;

public class MonitorizareAlimentatie {
	TipAlimentatie tipAlimentatie;
	int nrZi;
	ArrayList<Integer> caloriiPerMasa;

	public MonitorizareAlimentatie(TipAlimentatie tipAlimentatie, int nrZi, ArrayList<Integer> caloriiPerMasa) {
		super();
		this.tipAlimentatie = tipAlimentatie;
		this.nrZi = nrZi;
		this.caloriiPerMasa = caloriiPerMasa;
	}
}
