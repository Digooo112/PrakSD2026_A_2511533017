package TugasPekan1_2511533017;

public class adt_mobil_2511533017 {
    private String nama;
    private int tahun;
    private int cc;
    private long harga;
    private String merk;

    // Constructor default
    public adt_mobil_2511533017() {
        this.nama = "";
        this.tahun = 0;
        this.cc = 0;
        this.harga = 0;
        this.merk = "";
    }

    // Constructor dengan parameter
    public adt_mobil_2511533017(String nama, int tahun, int cc, long harga, String merk) {
        this.nama = nama;
        this.tahun = tahun;
        this.cc = cc;
        this.harga = harga;
        this.merk = merk;
    }

    // Method tambah mobil
    public void tambahMobil(String nama, int tahun, int cc, long harga, String merk) {
        this.nama = nama;
        this.tahun = tahun;
        this.cc = cc;
        this.harga = harga;
        this.merk = merk;
        System.out.println("Data mobil berhasil ditambahkan.");
    }

    // Method hapus mobil
    public void hapusMobil() {
        this.nama = "";
        this.tahun = 0;
        this.cc = 0;
        this.harga = 0;
        this.merk = "";
        System.out.println("Data mobil berhasil dihapus.");
    }

    // Getter / Selektor
    public String getNama() {
        return nama;
    }

    public int getTahun() {
        return tahun;
    }

    public int getCc() {
        return cc;
    }

    public long getHarga() {
        return harga;
    }

    public String getMerk() {
        return merk;
    }

    // Setter / Mutator
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public void setHarga(long harga) {
        this.harga = harga;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    // Method tampil data
    public void tampilData() {
        System.out.println("Nama  : " + nama);
        System.out.println("Tahun : " + tahun);
        System.out.println("CC    : " + cc);
        System.out.println("Harga : " + harga);
        System.out.println("Merk  : " + merk);
    }
}