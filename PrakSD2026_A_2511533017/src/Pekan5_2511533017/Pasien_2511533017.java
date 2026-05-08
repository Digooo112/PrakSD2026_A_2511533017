package Pekan5_2511533017; // Deklarasi package untuk mengorganisir kelas

public class Pasien_2511533017 { // Kelas ADT yang merepresentasikan node dalam Single Linked List
    // Deklarasi atribut data pasien dan pointer next dengan suffix NIM
    String nama_3017;
    String penyakit_3017;
    int no_3017;
    Pasien_2511533017 next_3017;
    
    // Constructor untuk menginisialisasi atribut saat objek node dibuat
    public Pasien_2511533017 (String nama_3017, String penyakit_3017, int no_3017) {
        this.nama_3017 = nama_3017;
        this.penyakit_3017 = penyakit_3017;
        this.no_3017 = no_3017;
        this.next_3017 = null;
    }
    
    // Method getter untuk mengakses nilai atribut privat
    public String getNama_3017() {return nama_3017;}
    public String getPenyakit_3017() {return penyakit_3017;}
    public int getNomor_3017() { return no_3017;}
    public Pasien_2511533017 getNext() {return next_3017;}
    
    // Method setter untuk mengubah nilai atribut dan menghubungkan pointer next
    public void setNama_3017 (String nama_3017) {this.nama_3017 = nama_3017;}
    public void setPenyakit_3017 (String penyakit_3017) {this.penyakit_3017 = penyakit_3017;}
    public void setNomor_3017 (int no_3017) {this.no_3017 = no_3017;}
    public void setNext_3017 (Pasien_2511533017 next_3017) {this.next_3017 = next_3017;}
}
