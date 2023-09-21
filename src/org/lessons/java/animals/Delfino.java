package org.lessons.java.animals;

import org.lessons.java.animals.abs.Animale;
import org.lessons.java.animals.inter.PuoNuotare;

public class Delfino extends Animale implements PuoNuotare {

	@Override
	public void verso() {
		
		System.out.println("eEeEeEeEeEeEeEeEeEeE");
	}
	
	@Override
	public void mangia() {

		System.out.println("Pesce? che ne so, curiosità: lo sapevi che i delfini sono squali gay?");
	}
	
	@Override
	public void nuota() {
		
		System.out.println("Nuoto, ma dai?!");
	}
}