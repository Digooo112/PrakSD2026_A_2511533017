package pekan3_2511533017;
import java.util.ArrayList;
class Siswa_3017 {
	String nama_3017;
	int nim_3017;
	
	public Siswa_3017(String nama, int nim) {
		this.nama_3017 = nama;
		this.nim_3017 = nim;
	}
	
	@Override 
	public String toString() {
		return "Nim: " + nim_3017 + ", Nama: " + nama_3017;
	}
}

public class SiswaStack_2511533017 {
	private ArrayList<Siswa_3017> stack;
	
	public SiswaStack_2511533017() {
		stack = new ArrayList<>();
	}
	
	public void push(Siswa_3017 mhs_3017) {
		stack.add(mhs_3017);
	}
	
	public Siswa_3017 pop_3017() {
		if (!isEmpty()) {
			return stack.remove(stack.size() - 1);
		}
		return null;
	}
	
	public 	Siswa_3017 peek_3017() {
		if (!isEmpty()) {
			return stack.get(stack.size() - 1);
	}
	return null;
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public void tampilkanSiswa_3017() {
		for (int i = stack.size() - 1; i >= 0; i--) {
			System.out.println(stack.get(i));
			
		}
	}
	public static void main (String [] args) {
		SiswaStack_2511533017 studentStack = new SiswaStack_2511533017();
		
		Siswa_3017 mhs1_3017 = new Siswa_3017("Ali", 1);
		Siswa_3017 mhs2_3017 = new Siswa_3017("Boby", 2);
		Siswa_3017 mhs3_3017 = new Siswa_3017("Charles", 3);
		
		studentStack.push(mhs1_3017);
		studentStack.push(mhs2_3017);
		studentStack.push(mhs3_3017);
		
		System.out.println("siswa di dalam stack:");
		studentStack.tampilkanSiswa_3017();
		
		System.out.println("siswa teratas " + studentStack.peek_3017());
		System.out.println("mengeluarkan siswa teratas dari stack: " + studentStack.pop_3017());
		System.out.println("daftar siswa setelah di pop :");
		studentStack.tampilkanSiswa_3017();
		
		
		
		
		}
	

}
