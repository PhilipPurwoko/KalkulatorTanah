//@author Philip Purwoko
// Github Portfolio : https://github.com/PhilipPurwoko
// Medium Article : https://medium.com/@philippurwoko

package kalkulatorkeramik;

// Membuat class Keramik
public class Keramik {
    // Deklarasi atribut keramik
    float panjang,lebar,luas,luasKeramikTotal;
    int harga,isi;
    
    // Penerapan Object Constructor
    Keramik(float panjang,float lebar,int harga,int isi) {
        // Mengatur atribut objek sesuai dengan constructor
        this.panjang = panjang;
        this.lebar = lebar;
        this.harga = harga;
        this.isi = isi;
        
        // Atribut luas per keramik dihitung dengan mengalikan atribut panjang dan lebar
        this.luas = this.panjang * this.lebar;
        // Atribut luas keramik per dus dihitung dengan mengkalikan atribut luas per keramik dengan jumlah keramik
        this.luasKeramikTotal = this.luas * this.isi;
    }
    
    // Method untuk menampilkan semua informasi objek
    void info(){
        System.out.println("Panjang : " + this.panjang + " m");
        System.out.println("Lebar : " + this.lebar + " m");
        System.out.println("Isi per dus : " + this.isi + " pcs");
        System.out.println("Harga per dus : Rp." + this.harga);
        System.out.println("Luas per keramik : " + this.luas + " m^2");
        System.out.println("Luas total keramik satu dus : " + this.luasKeramikTotal + " m^2");
        System.out.println("");
    }
    
    // Menghitung kebutuhanDus
    float hitungDus(int luasTanah){
        float kebutuhanDus = luasTanah / this.luasKeramikTotal;
        return kebutuhanDus;
    }
    
    // Menghitung harga keramik total
    void hitungHarga(float kebutuhanDus){
        float hargaTotal = kebutuhanDus * this.harga;
        
        // Menampilkan hasil kalkulasi
        System.out.println("Jumlah dus yang dibutuhkan : " + kebutuhanDus + " dus");
        System.out.println("Harga total : Rp." + hargaTotal);
        System.out.println("");
    }
}