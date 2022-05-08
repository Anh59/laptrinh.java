import java.util.Scanner;

public class Student{
	private int masv;
	private String ten;
	private int so_mon_hoc_da_hoc;
	private Subject[] mon_hoc;

	public Student(){
		
	}

	public Student(int masv , String name , int so_mon_hoc_da_hoc){
		this.masv = masv;
		this.ten = ten;
		this.so_mon_hoc_da_hoc = so_mon_hoc_da_hoc;
	}

	public void set_student(){
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap ma sinh vien :");
		masv = Integer.parseInt(sc.nextLine());

		System.out.println("Nhap ten sinh vien :");
		ten = sc.nextLine();

		System.out.println("Nhap so mon hoc da hoc :");
		so_mon_hoc_da_hoc = Integer.parseInt(sc.nextLine());

		set_mon_hoc();
	}

	public void set_masv(int masv){
		this.masv = masv;
	}

	public int get_masv(){
		return masv;
	}

	public void set_ten(String ten){
		this.ten = ten;
	}

	public String get_ten(){
		return ten;
	}

	public void set_so_mon_hoc_da_hoc(int so_mon_hoc_da_hoc){
		this.so_mon_hoc_da_hoc = so_mon_hoc_da_hoc;
	}

	public int get_so_mon_hoc_da_hoc(){
		return so_mon_hoc_da_hoc;
	}

	public void set_mon_hoc(){
		int size = get_so_mon_hoc_da_hoc();
		mon_hoc = new Subject[size];
		for(int i = 0;i < get_so_mon_hoc_da_hoc();i++){
			mon_hoc[i] = new Subject();
		}
	}

	public Subject[] get_mon_hoc(){
		return mon_hoc;
	}

	public void display_sinh_vien(){
		System.out.println(masv + " " + ten + " " + so_mon_hoc_da_hoc);
		for(int i = 0;i < so_mon_hoc_da_hoc;i++){
			mon_hoc[i].display_mon_hoc();
		}
	}

	public double diem_trung_binh(){
		double tong = 0;
		for(int i = 0;i < so_mon_hoc_da_hoc;i++){
			tong = tong + mon_hoc[i].diem_mon_hoc();
		}
		return (tong / so_mon_hoc_da_hoc);
	}
