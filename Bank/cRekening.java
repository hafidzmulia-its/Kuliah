public class cRekening{
    private int noRek;
    private String Pemilik;
    private double saldo;

    public cRekening(){ // Constructor
        this.noRek = 0;
        this.Pemilik = "";
        this.saldo = 0.0;
    }

    public void setNoRek(int noRek){
        this.noRek = noRek;
    }
    public void setPemilik(String Pemilik){
        this.Pemilik = Pemilik;
    }
    public int getNoRek(){
        return this.noRek;
    }
    public String getPemilik(){
        return this.Pemilik;
    }
    public void setor(double jumlah){
        this.saldo += jumlah;
    }
    public void tarik(double jumlah){
        this.saldo -= jumlah;
    }
    public double getSaldo(){
        return saldo;
    }
    public void info(){
        System.out.println("No Rekening : "+getNoRek());
        System.out.println("Pemilik : "+getPemilik());
        System.out.println("Saldo : "+getSaldo());
    }

}