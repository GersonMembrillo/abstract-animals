package org.lessons.java.animals;

import org.lessons.java.animals.abs.Animale;
import org.lessons.java.animals.inter.PuoVolare;

public class Passerotto extends Animale implements PuoVolare {

	@Override
	public void verso() {
		
		System.out.println("Cip cip, Oh, oh! Mi è semblato di vedele un gatto...");
	}

	@Override
	public void mangia() {

		System.out.println("Semi e vermi, gnam!");
	}
	
	@Override
	public void vola() {
		
		System.out.println("Vola vola vola vola vola l'ape maya!");
	}
}
