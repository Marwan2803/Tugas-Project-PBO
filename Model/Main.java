package sesi_2.Mahasiswa; // package ini untuk menentukan folder apa yang dipaakai

class Mahasiswa { // pembuatan class dengan nama class Mahasiswa
    String nama; // deklarasi variabel nama tanpa dinisialisasi

    Mahasiswa(String nama) { // constructor dengan parameter nama bertipe data string
        this.nama = nama; // pengisialisasian objek nama dengan parameter nama
    }

    void perkenalkanDiri() { // deklarasi method dengan nama method perkenalkanDiri
        System.out.println("Halo, nama saya " + this.nama); // menampilkan "Halo, nama saya 'nama yang dimasukkan'"
    }
}

public class Main { // deklarasi main class yang harus ada
    public static void main(String[] args) { // ini juga sama deklarasi fungsi yang harus ada
        Mahasiswa mhs = new Mahasiswa("Budi"); // proses pembuatan objek mhs dari class Mahasiswa
        mhs.perkenalkanDiri(); // pemanggilan method perkenalkanDiri yang akan menampilkan "Halo, nama saya
                               // Budi"
    }
}

// Tujuan dari program ini adalah pembuatan class atau cetak biru mahasiswa agar
// kita tidak perlu menulis ulang kode yang sama
// Lalu kalau di program ini itu hanya untuk menjalankan method yang ada pada
// class Mahasiswa saja, yaitu method perkenalkanDiri
