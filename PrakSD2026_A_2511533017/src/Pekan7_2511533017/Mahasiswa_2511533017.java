package Pekan7_2511533017;

public class Mahasiswa_2511533017 {
    private String nama_3017;
    private String nim_3017;
    private String prodi_3017;
    
    public Mahasiswa_2511533017(String nama, String nim, String prodi) {
        this.nama_3017 = nama;
        this.nim_3017 = nim;
        this.prodi_3017 = prodi;
    }
    
    public String getNama_3017() {
        return nama_3017;
    }
    
    public String getNim_3017() {
        return nim_3017;
    }
    
    public String getProdi_3017() {
        return prodi_3017;
    }
    
    @Override
    public String toString() {
        return "Nama: " + nama_3017 + ", NIM: " + nim_3017 + ", Prodi: " + prodi_3017;
    }
}
