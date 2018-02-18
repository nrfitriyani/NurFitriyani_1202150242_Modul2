package nurfitriyani.example.com.nurfitriyani_1202150242_modul2;

/**
 * Created by ASUS on 2/18/2018.
 */

public class Menu {
    private String nama;
    private String harga;
    private int gambar;

    public Menu(String nama, String harga, int gambar) {
        this.nama = nama;
        this.harga = harga;
        this.gambar = gambar;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }
}
