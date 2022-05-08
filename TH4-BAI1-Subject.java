import java.util.Scanner;

public class Subject{
	private String ma_mon_hoc;
	private String ten_mon_hoc;
	private double diem_giua_ky;
	private double diem_cuoi_ky;

	public Subject(){
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap ma mon hoc :");
		ma_mon_hoc = sc.nextLine();

		System.out.println("Nhap ten mon hoc :");
		ten_mon_hoc = sc.nextLine();

		System.out.println("Nhap diem giua ky :");
		diem_giua_ky = sc.nextDouble();

		System.out.println("Nhap diem cuoi ky :");
		diem_cuoi_ky = sc.nextDouble();
	}

	public Subject(String ma_mon_hoc , String ten_mon_hoc , double diem_giua_ky , double diem_cuoi_ky){
		this.ma_mon_hoc = ma_mon_hoc;
		this.ten_mon_hoc = ten_mon_hoc;
		this.diem_giua_ky = diem_giua_ky;
		this.diem_cuoi_ky = diem_cuoi_ky;
	}

	public void set_ma_mon_hoc(String ma_mon_hoc){
		this.ma_mon_hoc = ma_mon_hoc;
	}

	public String get_ma_mon_hoc(){
		return ma_mon_hoc;
	}

	public void set_ten_mon_hoc(String ten_mon_hoc){
		this.ten_mon_hoc = ten_mon_hoc;
	}

	public String get_ten_mon_hoc(){
		return ten_mon_hoc;
	}

	public void set_diem_giua_ky(double diem_giua_ky){
		this.diem_giua_ky = diem_giua_ky;
	}

	public double get_diem_giua_ky(){
		return diem_giua_ky;
	}

	public void set_diem_cuoi_ky(double diem_cuoi_ky){
		this.diem_cuoi_ky = diem_cuoi_ky;
	}

	public double get_diem_cuoi_ky(){
		return diem_cuoi_ky;
	}

	public void display_mon_hoc(){
		System.out.println(ma_mon_hoc + " " + ten_mon_hoc + " " + diem_giua_ky + " " + diem_cuoi_ky);
	}

	public double diem_mon_hoc(){
		return (0.5 * diem_giua_ky + 0.5 * diem_cuoi_ky);
	}
}
