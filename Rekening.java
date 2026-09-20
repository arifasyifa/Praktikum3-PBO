public class Rekening {

    // Atribut
    String nomorRekening;
    String namaNasabah;
    double saldo;

    // Constructor
    public Rekening(String nomorRekening, String namaNasabah, double saldo) {
        this.nomorRekening = nomorRekening;
        this.namaNasabah = namaNasabah;
        this.saldo = saldo;
    }

    // Method tarik tunai
    public void tarikTunai(double jumlah) throws SaldoTidakMencukupiException {

        if (jumlah > saldo) {
            throw new SaldoTidakMencukupiException(
                "Saldo tidak mencukupi. Saldo Anda: Rp" + saldo
            );
        }

        saldo -= jumlah;

        System.out.println("===== STRUK PENARIKAN =====");
        System.out.println("Nasabah        : " + namaNasabah);
        System.out.println("No. Rekening   : " + maskingNomorRekening());
        System.out.println("Jumlah Tarik   : Rp" + jumlah);
        System.out.println("Sisa Saldo     : Rp" + saldo);
        System.out.println("===========================");
    }

    // Method masking nomor rekening
    public String maskingNomorRekening() {

        if (nomorRekening.length() <= 5) {
            return nomorRekening;
        }

        StringBuilder hasil = new StringBuilder();

        // Menampilkan 5 digit pertama
        hasil.append(nomorRekening.substring(0, 5));

        // Mengganti sisanya dengan *
        for (int i = 5; i < nomorRekening.length(); i++) {
            hasil.append("*");
        }

        return hasil.toString();
    }
}