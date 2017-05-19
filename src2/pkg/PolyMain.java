package pkg;

public class PolyMain {

	public static void main(String[] args) {
		// Program at the "interface" defined in the superclass.
	      // Declare instances of the superclass, substituted by subclasses.
	      Monster m1 = new FireMonster("FireMon");   // upcast
	      Monster m2 = new WaterMonster("WaterMon");  // upcast
	      Monster m3 = new StoneMonster("StoneMon");  // upcast

	      // Invoke the actual implementation
	      System.out.println(m1.attack());  // Run FireMonster's attack()
	      System.out.println(m2.attack());  // Run WaterMonster's attack()
	      System.out.println(m3.attack());  // Run StoneMonster's attack()

	      System.out.println("\n__________ m1 dies :( ________");
	      System.out.println("__________ m1 now is a Stone Monster ________\n");
	      
	      // m1 dies, generate a new instance and re-assign to m1.
	      
//	      System.out.println(m1);
	      
	      m1 = new StoneMonster("Respawn StoneMon");  // upcast
	      System.out.println(m1.attack());  // Run StoneMonster's attack()
	      
//	      System.out.println(m1);
	      
	      
	      // We have a problem here!!!
//	      Monster m4 = new Monster("Common Monster");
//	      System.out.println(m4.attack());  // garbage!!!
		
		
	}

}
