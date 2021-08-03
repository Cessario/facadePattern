public class Pelayan {
    private MenuPricelist jeruk;
    private MenuPricelist teh;
    private MenuPricelist air;
    private MenuPricelist nasi;
    private MenuPricelist soto;
    private MenuPricelist kerupuk;

    public Pelayan(){
        jeruk = new Jeruk();
        teh = new TehBotol();
        air = new airMineral();
        nasi = new Nasi();
        soto = new Soto();
        kerupuk = new Kerupuk();
    }
    public void jerukHarga(){
        jeruk.jenisMenu();
        jeruk.harga();
    }
    public void tehHarga(){
        teh.jenisMenu();
        teh.harga();
    }
    public void airHarga(){
        air.jenisMenu();
        air.jenisMenu();
    }
    public void nasiHarga(){
        nasi.jenisMenu();
        nasi.harga();
    }
    public void sotoHarga(){
        soto.jenisMenu();
        soto.harga();
    }
    public void kerupukHarga(){
        kerupuk.jenisMenu();
        kerupuk.harga();
    }
}
