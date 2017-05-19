
public class Segitiga extends Segiempat {
	public int s3;
	public Segitiga(String nama, int s1, int s2, int s3) {
		super(nama, s1, s2);
		this.s3 = s3;
	}
//	overide hitungluas()
	@Override
	public double hitungluas(){
		return 0.5*gets1()*gets2();
	}
//	overide hitungkeliling()
	@Override
	public int hitungkeliling(){
		return gets1()+gets2()+s3;
	}
	
	@Override
	protected void cetak(){
		System.out.println("Nama Bangun : " + getnama());
		System.out.println("s1 : " + gets1());
		System.out.println("s2 : " + gets2());
		System.out.println("s3 : "+s3);

	}
}
