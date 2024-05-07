public class tes {

    public static void main(String[] args) {
        cRekening rek = new cRekening();
        cRekening rek2 = new cRekening();
        rek.setNoRek(123);
        rek.setPemilik("Budi");
        rek.setor(100000);
        rek.tarik(50000);
        rek.info();

        rek2.setNoRek(456);
        rek2.setPemilik("Andi");
        rek2.setor(200000);
        rek2.tarik(100000);
        rek2.info();
    }
}