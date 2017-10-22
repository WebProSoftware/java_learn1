package pk.edu.pl.main;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import pk.edu.pl.*;

public class Animals {
	
	private static List<Animal> animals = new ArrayList<Animal>();
	
	public static void main(String[] args){
		animals.add( new Dog() );
		animals.add( new Cat() );
		animals.add( new Cat() );
		animals.add( new Dog() );
		
		Iterator<Animal> it = animals.iterator();
		while (it.hasNext()){
			System.out.println(it.next().voice());
		}
	}
}
