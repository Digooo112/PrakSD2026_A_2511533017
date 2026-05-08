package Pekan5_2511533017;

import java.util.Scanner;

public class RumahSakit_2511533017 {
    
    // Counter global untuk nomor antrian auto-increment
    static int counterAntrian_3017 = 0;

    // Insert at Tail: menambahkan node pasien baru di akhir linked list dengan prinsip FIFO
    public static Pasien_2511533017 insertAtTail_3017(Pasien_2511533017 head_3017, String nama_3017, String penyakit_3017) {
        counterAntrian_3017++;
        Pasien_2511533017 newNode_3017 = new Pasien_2511533017(nama_3017, penyakit_3017, counterAntrian_3017);
        
        if (head_3017 == null) {
            return newNode_3017;
        }
        
        Pasien_2511533017 last_3017 = head_3017;
        while (last_3017.getNext() != null) {
            last_3017 = last_3017.getNext();
        }
        
        last_3017.setNext_3017(newNode_3017);
        return head_3017;
    }

    // Delete Head: menghapus dan menampilkan data pasien terdepan lalu menggeser head ke node berikutnya
    public static Pasien_2511533017 deleteHead_3017(Pasien_2511533017 head_3017) {
        if (head_3017 == null) {
            System.out.println("Antrian kosong! Tidak ada pasien untuk dipanggil");
            return null;
        }
        
        Pasien_2511533017 pasienDipanggil_3017 = head_3017;
        System.out.println("\n=== Pasien Dipanggil ===");
        System.out.println("Nama        : " + pasienDipanggil_3017.getNama_3017());
        System.out.println("Penyakit    : " + pasienDipanggil_3017.getPenyakit_3017());
        System.out.println("Nomor Antrian: " + pasienDipanggil_3017.getNomor_3017());
        
        return head_3017.getNext();
    }

    // Display List: menelusuri linked list dari head hingga null dan menampilkan semua data pasien
    public static void printList_3017(Pasien_2511533017 head_3017) {
        if (head_3017 == null) {
            System.out.println("Antrian kosong. Belum ada pasien terdaftar");
            return;
        }
        
        System.out.println("\n=== Daftar Antrian ===");
        Pasien_2511533017 curr_3017 = head_3017;
        
        while (curr_3017.getNext() != null) {
            System.out.println("[" + curr_3017.getNomor_3017() + "] " +
                                curr_3017.getNama_3017() + " - " +
                                curr_3017.getPenyakit_3017() + " -->");
            curr_3017 = curr_3017.getNext();
        }

        if (curr_3017 != null) {
            System.out.println("[" + curr_3017.getNomor_3017() + "] " +
                                curr_3017.getNama_3017() + " - " +
                                curr_3017.getPenyakit_3017());
        }
    }

    // Search Case-Insensitive: mencari pasien berdasarkan nama tanpa membedakan huruf besar atau kecil
    public static void searchPatient_3017(Pasien_2511533017 head_3017, String namaCari_3017) {
        if (head_3017 == null) {
            System.out.println("Antrian kosong");
            return;
        }
        
        Pasien_2511533017 curr_3017 = head_3017;
        boolean ditemukan_3017 = false;
        
        while (curr_3017 != null) {
            if (curr_3017.getNama_3017().equalsIgnoreCase(namaCari_3017)) {
                System.out.println("\n=== Pasien Ditemukan ===");
                System.out.println("Nama        : " + curr_3017.getNama_3017());
                System.out.println("Penyakit    : " + curr_3017.getPenyakit_3017());
                System.out.println("Nomor Antrian: " + curr_3017.getNomor_3017());
                ditemukan_3017 = true;
                break;
            }
            curr_3017 = curr_3017.getNext();
        }
        
        if (!ditemukan_3017) {
            System.out.println("Pasien dengan nama '" + namaCari_3017 + "' tidak ditemukan");
        }
    }

    // Cek Status Antrian: menghitung total pasien dan menampilkan informasi pasien terdepan
    public static void checkStatus_3017(Pasien_2511533017 head_3017) {
        if (head_3017 == null) {
            System.out.println("Status Antrian: KOSONG. Tidak ada pasien");
            return;
        }
        
        int total_3017 = 0;
        Pasien_2511533017 curr_3017 = head_3017;

        while (curr_3017 != null) {
            total_3017++;
            curr_3017 = curr_3017.getNext();
        }
        
        System.out.println("\n=== Status Antrian ===");
        System.out.println("Total Pasien    : " + total_3017);
        System.out.println("Pasien Terdepan : " + head_3017.getNama_3017() +
                            " (No. " + head_3017.getNomor_3017() + ")");
    }

    // Menu utama: menangani input pengguna dan memanggil method operasi linked list yang sesuai
    public static void main(String[] args) {
        Scanner input_3017 = new Scanner(System.in);
        Pasien_2511533017 head_3017 = null;
        int pilihan_3017 = 0;

        do {
            System.out.println("\n=== Antrian Rumah Sakit NIM: 2511533017 ===");
            System.out.println("1. Daftarkan Pasien (Insert at Tail)");
            System.out.println("2. Panggil Pasien (Delete Head)");
            System.out.println("3. Tampilkan Antrian (Display)");
            System.out.println("4. Cari Pasien (Search)");
            System.out.println("5. Cek Status Antrian");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");

            if (input_3017.hasNextInt()) {
                pilihan_3017 = input_3017.nextInt();
                input_3017.nextLine();
            } else {
                System.out.println("Input tidak valid. Silakan masukkan angka 1-6");
                input_3017.nextLine();
                continue;
            }

            switch (pilihan_3017) {
                case 1:
                    System.out.print("Masukkan Nama Pasien: ");
                    String nama_3017 = input_3017.nextLine();

                    System.out.print("Masukkan Penyakit   : ");
                    String penyakit_3017 = input_3017.nextLine();

                    head_3017 = insertAtTail_3017(head_3017, nama_3017, penyakit_3017);
                    System.out.println("Pasien berhasil didaftarkan! Nomor Antrian: " + counterAntrian_3017);
                    break;

                case 2:
                    head_3017 = deleteHead_3017(head_3017);
                    break;

                case 3:
                    printList_3017(head_3017);
                    break;

                case 4:
                    System.out.print("Masukkan Nama Pasien yang dicari: ");
                    String cari_3017 = input_3017.nextLine();
                    searchPatient_3017(head_3017, cari_3017);
                    break;

                case 5:
                    checkStatus_3017(head_3017);
                    break;

                case 6:
                    System.out.println("Program selesai. Terima kasih");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1-6");
            }

        } while (pilihan_3017 != 6);

        input_3017.close();
    }
}
