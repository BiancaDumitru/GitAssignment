package ro.ase.csie.cts.laborator.assignment2;

import java.util.ArrayList;

public class TestGit {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		System.out.println("Hello Git ! Denumirea proiectului de licenta este: "
				+ "Aplicatie mobila pentru facilitarea unui stil de viata echilibrat.");

		ArrayList<Integer> calorii = new ArrayList<>();
		calorii.add(400);
		calorii.add(550);
		calorii.add(170);
		calorii.add(150);
		calorii.add(300);

		MonitorizareAlimentatie m1 = new MonitorizareAlimentatie(TipAlimentatie.NORMAL, 1, calorii);
		System.out.print(m1);

		StringBuilder sb = new StringBuilder();
		sb.append(". Total calorii consumate: ").append(m1.calculTotalCalorii()).append("/")
				.append(m1.necesarCaloricZilnic);
		System.out.print(sb);

		StringBuilder sb2 = new StringBuilder();
		sb2.append(". Calorii ramase de consumat: ").append(m1.calculCaloriiRamase());
		System.out.print(sb2);
	}
}
