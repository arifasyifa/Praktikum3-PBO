# Praktikum 3: Exception Handling & Manipulasi Teks

Repositori ini berisi penyelesaian tugas praktikum Pemrograman Berorientasi Objek (PBO) 3 dengan fokus implementasi Custom Exception, blok kontrol Try-Catch-Finally, serta manipulasi data teks menggunakan StringBuilder.

---

## Capaian Praktikum
Berdasarkan modul praktikum, implementasi ini memenuhi capaian pembelajaran:
1. Mengimplementasikan mekanisme penanganan galat runtime menggunakan blok try-catch-finally.
2. Membuat dan menerapkan Custom Exception (SaldoTidakMencukupiException) dengan pemanfaatan kata kunci throw dan throws.
3. Menerapkan manipulasi teks efisien dan aman memori menggunakan class mutable StringBuilder untuk masking nomor rekening nasabah.

---

## Struktur Berkas Program

- SaldoTidakMencukupiException.java : Subclass Exception untuk validasi saldo
- Rekening.java : Model entitas rekening, transaksi, dan masking teks
- MainBank.java : Program pengujian blok try-catch-finally
- README.md : Catatan penjelasan praktikum

---

## Pembahasan Logika Program

### 1. Custom Exception (SaldoTidakMencukupiException.java)
- Mewarisi (extends) class induk Exception.
- Menerima parameter pesan kegagalan (String pesan) yang diteruskan ke superclass menggunakan konstruktor super(pesan).

### 2. Class Model & Logika Bisnis (Rekening.java)
- Atribut: Menyimpan identitas nasabah (nomorRekening, namaNasabah) dan nominal tabungan (saldo).
- Method tarikTunai(double jumlah):
  - Menggunakan klausul throws SaldoTidakMencukupiException pada deklarasi fungsinya.
  - Memeriksa kondisi validasi if (jumlah > saldo). Jika nilai penarikan melampaui saldo, sistem secara manual melempar galat menggunakan throw new SaldoTidakMencukupiException(...).
  - Jika saldo mencukupi, saldo didebit dan struk penarikan dicetak ke layar konsol.
- Method maskingNomorRekening():
  - Memanfaatkan StringBuilder agar manipulasi teks efisien di memori.
  - Menjaga 5 digit pertama nomor rekening tetap tampak, dan mengiterasi digit sisanya menjadi karakter bintang * (1807200426 menjadi 18072*****).

### 3. Simulasi Eksekusi (MainBank.java)
- Menginstansiasi objek rekening atas nama Eldin dengan saldo awal Rp1.000.000.
- Blok try:
  1. Penarikan pertama: Rp260.000 (Berhasil, sisa saldo Rp740.000).
  2. Penarikan kedua: Rp750.000 (Gagal, karena nominal melebihi sisa saldo Rp740.000).
- Blok catch:
  - Menangkap objek SaldoTidakMencukupiException.
  - Menampilkan pesan kesalahan sehingga alur aplikasi tetap berjalan normal tanpa crash mendadak.
- Blok finally:
  - Selalu dieksekusi terlepas dari sukses atau terjadinya eksepsi pada transaksi.
  - Mencetak status akhir pemrosesan beserta hasil penyamaran nomor rekening.
