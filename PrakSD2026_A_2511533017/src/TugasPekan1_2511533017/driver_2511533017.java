package TugasPekan1_2511533017;

public class driver_2511533017 {
    public static void main(String[] args) {
        // Membuat objek mobil
        adt_mobil_2511533017 mobil1 = new adt_mobil_2511533017();

        // Tambah data mobil
        mobil1.tambahMobil("Avanza", 2020, 1300, 150000000, "Toyota");

        // Tampilkan data
        System.out.println("Data Mobil:");
        mobil1.tampilData();

        System.out.println();

        // Contoh mutator
        mobil1.setNama("Xenia");
        mobil1.setTahun(2021);
        mobil1.setCc(1500);
        mobil1.setHarga(170000000);
        mobil1.setMerk("Daihatsu");

        System.out.println("Data Mobil Setelah Diubah:");
        mobil1.tampilData();

        System.out.println();

        // Contoh selektor
        System.out.println("Selektor:");
        System.out.println("Nama mobil  : " + mobil1.getNama());
        System.out.println("Tahun mobil : " + mobil1.getTahun());
        System.out.println("CC mobil    : " + mobil1.getCc());
        System.out.println("Harga mobil : " + mobil1.getHarga());
        System.out.println("Merk mobil  : " + mobil1.getMerk());

        System.out.println();

        // Hapus data mobil
        mobil1.hapusMobil();

        System.out.println("Data Mobil Setelah Dihapus:");
        mobil1.tampilData();
    }
}