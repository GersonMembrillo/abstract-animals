package org.lessons.java.animals;

import org.lessons.java.animals.abs.Animale;
import org.lessons.java.animals.inter.PuoNuotare;
import org.lessons.java.animals.inter.PuoVolare;

public class Aquila extends Animale implements PuoNuotare, PuoVolare {

	@Override
	public void verso() {
		
		System.out.println("Kakà Kakà (aspetta, quello è un Cacatua)");
	}

	@Override
	public void mangia() {

		System.out.println("Roditori, c'è un video dove rapisce un bebe vestito da coniglio");
	}
	
	@Override
	public void nuota() {
		
		System.out.println("Nuotare? diciamo più tuffarsi");
	}
	@Override
	public void vola() {
		
		System.out.println("Non volare, cadere con stile");
	}
}
