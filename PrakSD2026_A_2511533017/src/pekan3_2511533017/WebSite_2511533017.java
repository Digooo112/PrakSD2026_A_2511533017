package pekan3_2511533017; // Mendeklarasikan paket tempat kelas ini disimpan untuk organisasi kode.

public class WebSite_2511533017 {
	// Deklarasi variabel instance dengan akses default untuk menyimpan judul website.
	String judulweb_3017;
	// Deklarasi variabel instance dengan akses default untuk menyimpan URL website.
	String urlweb_3017;
	
	// Constructor untuk menginisialisasi objek Website dengan nilai parameter yang diberikan.
	WebSite_2511533017 (String jw_3017, String urlw_3017){
		this.judulweb_3017= jw_3017; // Keyword 'this' merujuk pada variabel instance kelas saat ini.
		this.urlweb_3017 = urlw_3017;
	}
	
	// Getter method untuk mengakses nilai variabel judulweb_1001 dari luar kelas.
	public String getJudul () {return judulweb_3017;}
	// Getter method untuk mengakses nilai variabel urlweb_1001 dari luar kelas.
	public String getURL () {return urlweb_3017;}
	
	// Setter method untuk memperbarui nilai variabel judulweb_1001 setelah objek dibuat.
	public void setJudul (String jw_3017) {this.judulweb_3017= jw_3017;}
	// Setter method untuk memperbarui nilai variabel urlweb_1001 setelah objek dibuat.
	public void setURL (String urlw_3017) {this.urlweb_3017 = urlw_3017;}
}