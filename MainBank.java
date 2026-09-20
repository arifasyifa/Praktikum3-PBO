public class MainBank {

    public static void main(String[] args) {

        // Membuat objek rekening
        Rekening rekening = new Rekening(
            "1807200426",
            "Arifa Syifaul Qulbi",
            1000000
        );

        try {

            System.out.println("=== TRANSAKSI BANK ===");

            // Penarikan pertama, saldo cukup
            System.out.println("\nPenarikan pertama:");
            rekening.tarikTunai(260000);

            // Penarikan kedua, melebihi sisa saldo
            System.out.println("\nPenarikan kedua:");
            rekening.tarikTunai(750000);

        } catch (SaldoTidakMencukupiException e) {

            System.out.println("\nERROR: " + e.getMessage());

        } finally {

            System.out.println("\n=== PENUTUP ===");
            System.out.println("Transaksi selesai diproses.");
            System.out.println(
                "Nomor Rekening: " + rekening.maskingNomorRekening()
            );
        }
    }
}