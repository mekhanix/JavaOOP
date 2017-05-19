public class Segiempat extends BangunDatar {
//	constructor tidak diwariskan,kita harus membuat constr. baru yang identik
	public Segiempat(String nama, int s1, int s2) {
		super(nama, s1, s2);
	}


	public double hitungluas(){
		return gets1()*gets2(); 
	}
	public int hitungkeliling(){
		return 2*gets1() + 2*gets2();
	}

}
