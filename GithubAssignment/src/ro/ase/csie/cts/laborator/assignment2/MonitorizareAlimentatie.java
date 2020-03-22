package ro.ase.csie.cts.laborator.assignment2;

import java.util.ArrayList;

public class MonitorizareAlimentatie implements EvidentaCalorii {
	TipAlimentatie tipAlimentatie;
	int nrZi;
	ArrayList<Integer> caloriiPerMasa;

	public static int necesarCaloricZilnic = 1800;

	public MonitorizareAlimentatie(TipAlimentatie tipAlimentatie, int nrZi, ArrayList<Integer> caloriiPerMasa) {
		super();
		this.tipAlimentatie = tipAlimentatie;
		this.nrZi = nrZi;
		this.caloriiPerMasa = caloriiPerMasa;
	}

	@Override
	public String toString() {
		StringBuilder stringbuilder = new StringBuilder();
		stringbuilder.append("Tip Alimentatie: ").append(this.tipAlimentatie).append(". Ziua ").append(this.nrZi)
				.append(", caloriile pe fiecare masa: ").append(this.caloriiPerMasa);
		return stringbuilder.toString();
	}

	@Override
	public int calculTotalCalorii() {
		if (this.caloriiPerMasa.size() > 0) {
			int totalCalorii = 0;
			for (int nrCalorii : this.caloriiPerMasa) {
				totalCalorii += nrCalorii;
			}
			return totalCalorii;
		} else {
			return 0;
		}
	}

	@Override
	public int calculCaloriiRamase() {
		return necesarCaloricZilnic - calculTotalCalorii();
	}
}
