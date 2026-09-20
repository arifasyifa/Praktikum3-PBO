# Laporan Praktikum Modul 3: Exception Handling & Manipulasi Teks

Repositori ini berisi penyelesaian tugas praktikum Pemrograman Berorientasi Objek (PBO) Modul 3 dengan fokus implementasi **Custom Exception**, blok kontrol **Try-Catch-Finally**, serta manipulasi data teks menggunakan **StringBuilder**.

---

## 🎯 Capaian Praktikum
Berdasarkan modul praktikum, implementasi ini memenuhi capaian pembelajaran:
1. Mengimplementasikan mekanisme penanganan galat runtime menggunakan blok `try-catch-finally`.
2. Membuat dan menerapkan **Custom Exception** (`SaldoTidakMencukupiException`) dengan pemanfaatan kata kunci `throw` dan `throws`.
3. Menerapkan manipulasi teks efisien dan aman memori menggunakan class mutable `StringBuilder` untuk masking nomor rekening nasabah.

---

## 📂 Struktur Berkas Program

```text
.
├── SaldoTidakMencukupiException.java  # Subclass Exception untuk validasi saldo
├── Rekening.java                      # Model entitas rekening, transaksi, & masking teks
├── MainBank.java                      # Program pengujian blok try-catch-finally
└── README.md                          # Dokumentasi repositori
