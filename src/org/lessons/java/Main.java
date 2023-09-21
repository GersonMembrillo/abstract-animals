package org.lessons.java;

import org.lessons.java.animals.Aquila;
import org.lessons.java.animals.Cane;
import org.lessons.java.animals.Delfino;
import org.lessons.java.animals.Passerotto;
import org.lessons.java.animals.abs.Animale;
import org.lessons.java.animals.inter.PuoNuotare;
import org.lessons.java.animals.inter.PuoVolare;

public class Main {

	public static void main(String[] args) {
		
		Cane c1 = new Cane();
		Passerotto p1 = new Passerotto();
		Aquila a1 = new Aquila();
		Delfino d1 = new Delfino();
		
		System.out.println("Cane:");
		System.out.println("--------------------");
		
		c1.dormi();
		c1.verso();
		c1.mangia();
		
		Nuota(c1);
		
		System.out.println("--------------------\n");
		
		System.out.println("Passerotto:");
		System.out.println("--------------------");
		
		p1.dormi();
		p1.verso();
		p1.mangia();
		
//		p1.nuota();
		
		Vola(p1);
		
		System.out.println("--------------------\n");
		
		System.out.println("Aquila:");
		System.out.println("--------------------");
		
		a1.dormi();
		a1.verso();
		a1.mangia();
		
		Vola(a1);
		Nuota(a1);
		
		System.out.println("--------------------\n");
		
		System.out.println("Delfino:");
		System.out.println("--------------------");
		
		d1.dormi();
		d1.verso();
		d1.mangia();
		
		Nuota(d1);
		
		System.out.println("--------------------\n");
		System.out.println("--------------------");
		
		Animale[] animali = new Animale[4];
		animali[0] = c1;
		animali[1] = p1;
		animali[2] = a1;
		animali[3] = d1;
		
		for (int x=0;x<animali.length;x++) {
			
			Animale a = animali[x];
			
			System.out.println(a.getClass().getSimpleName() + ":");
			System.out.println("--------------------");
			
			a.dormi();
			a.verso();
			a.mangia();
			
			if (a instanceof PuoNuotare) {
				
				PuoNuotare aNuotante = (PuoNuotare) a;
				
				Nuota(aNuotante);
			}
			if (a instanceof PuoVolare) {
				
				PuoVolare aVolante = (PuoVolare) a;
				
				Vola(aVolante);
			}
			
			System.out.println("--------------------");
		}
	}
	
	static void Vola(PuoVolare animaleVolante) {
		
		animaleVolante.vola();
	}
	static void Nuota(PuoNuotare animaleNuotante) {
		
		animaleNuotante.nuota();
	}
}

