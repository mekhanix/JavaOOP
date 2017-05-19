
public class BangunDatar {
//	PRIVATE VARIABLE
	private String nama;
	private int s1;
	private int s2;

	
//	CONSTRUCTOR
	public BangunDatar(String nama,int s1,int s2){
		System.out.println("objek baru telah dibuat!");
		this.nama = nama;
		this.s1 = s1;
		this.s2 = s2;
	}
	
//	SETTER
	public void setnama(String nama){
		this.nama = nama;
	}
	public void sets1(int s1){
		this.s1 = s1;
	}
	public void sets2(int s2){
		this.s2 = s2;
	}
//	GETTER
	public String getnama(){
		return nama;
	}
	public int gets1(){
		return s1;
	}
	public int gets2(){
		return s2;
	}
	
	
	
//	FINAL METHOD CAN'T BE OVERIDDEN
	protected void cetak(){
		System.out.println("Nama Bangun : " + nama);
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);

	}
}
