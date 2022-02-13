package thisandsuper;

public class Dog extends Animal {    //Subclass (child)
	
	public void animalSound() {
		
		super.animalSound(); // call the superclass method
		
		System.out.println("The dog says: bow wow");
		
		
	}

     }




