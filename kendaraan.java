class Kendaraan{
    int kecepatan;

    Kendaraan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    void maju(){
        System.out.println("Kendaraan bergerak maju dengan kecepatan " + kecepatan + " Km/Jam");
    }

    void klakson(){
        System.out.println("beep beep");
    }
}

class Mobil extends Kendaraan{
    String merk;
    public Mobil(int kecepatan, String merk) {
        super(kecepatan);
        this.merk = merk;
    }

    @Override
    void maju() {
        System.out.println("Mobil merk " + merk + " maju dengan kecepatan " + kecepatan + " Km/Jam");
    }

    @Override
    void klakson() {
        System.out.println("Honk Honk");
    }
}

class Motor extends Kendaraan{
    String jenis;
    public Motor(int kecepatan, String jenis) {
        super(kecepatan);
        this.jenis = jenis;
    }

    @Override
    void maju() {
        System.out.println("Motor jenis " + jenis + " maju dengan kecepatan " + kecepatan + " Km/Jam");
    }

    @Override
    void klakson() {
        System.out.println("Beep Beep");
    }
}

class KendaraanApps{
    public static void main(String[] args) {
        Kendaraan kar = new Mobil (330, "Koenisegg");
        Kendaraan tor = new Motor(40, "Matic");

        kar.klakson();
        kar.maju();

        tor.klakson();
        tor.maju();

        balap(new Mobil(410, "bugatti"));
    }

    static void balap(Kendaraan kendaraan){
        System.out.println("\n-Ini dynamic");
        System.out.println("Mobil balap " + ((Mobil) kendaraan).merk + " melaju pesat dengan kecepatan " + kendaraan.kecepatan + " Km/Jam");
    }
}
