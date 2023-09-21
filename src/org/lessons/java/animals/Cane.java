package org.lessons.java.animals;

import org.lessons.java.animals.abs.Animale;
import org.lessons.java.animals.inter.PuoNuotare;

public class Cane extends Animale implements PuoNuotare {

	@Override
	public void verso() {
		
		System.out.println("Bau bau");
	}
	
	@Override
	public void mangia() {

		System.out.println("Carne umana se selvaggiio, croccantini se addomesticato");
	}
	
	@Override
	public void nuota() {
		
		System.out.println("I'm swimming bitch!!!");
	}
}
