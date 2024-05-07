public class cLingkaran {
    // Atribut
    private double jariJari;

    // Method
    public void setJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getJariJari() {
        return jariJari;
    }

    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }

    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }
    public void info(){
        System.out.println("Jari-jari : " + getJariJari());
        System.out.println("Luas : " + hitungLuas());
        System.out.println("Keliling : " + hitungKeliling());
    }
}