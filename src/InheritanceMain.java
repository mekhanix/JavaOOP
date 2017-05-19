
public class InheritanceMain{

	public static void main(String[] args) {
//		instansiasi objek baru BangunDatar
		BangunDatar newobj = new BangunDatar("Bangun Datar", 5, 5);
//		newobj.setnama("Bangun Datar Baru");
		newobj.cetak();
		
		System.out.println("\n####################################################\n");
//		instansiasi objek baru Segiempat
		Segiempat newsegi = new Segiempat("Segi Empat", 3, 2);
//		newsegi.setnama("Segi Empat Baru");
//		newsegi.sets1(6);
//		newsegi.sets2(7);
		newsegi.cetak();
		System.out.println("Luas : "+newsegi.hitungluas());
		System.out.println("Keliling : "+newsegi.hitungkeliling());
		
		System.out.println("\n####################################################\n");
		
		Segitiga segiti = new Segitiga("Segitiga", 2,3,4);
		segiti.cetak();
		System.out.println("Luas : "+segiti.hitungluas());
		System.out.println("Luas : "+segiti.hitungkeliling());
		
		
	}

}
