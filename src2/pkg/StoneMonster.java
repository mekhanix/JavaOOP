package pkg;

public class StoneMonster extends Monster {
	   // Constructor
	   public StoneMonster(String name) {
	      super(name);
	   }
	   // Subclass provides actual implementation
	   @Override
	   public String attack() {
	      return name+" Attack with stones!";
	   }
	}
