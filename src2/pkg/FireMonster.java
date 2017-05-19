package pkg;

public class FireMonster extends Monster {
	   // Constructor
	   public FireMonster(String name) {
	      super(name);
	   }
	   // Subclass provides actual implementation
	   @Override public String attack() {
	      return name+" Attack with fire!"; 
	   }
	}
