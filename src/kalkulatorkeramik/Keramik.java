// @author PHILIP
package kalkulatorkeramik;

// Membuat class Keramik
public class Keramik {
    // Deklarasi atribut keramik
    float panjang;
    float lebar;
    float luas;
    int harga;
    int isi;
    float luasKeramikTotal;
    
    // Class Constructor
    public Keramik(float panjang,float lebar,int harga,int isi) {
        // Mengatur atribut objek sesuai constructor
        this.panjang = panjang;
        this.lebar = lebar;
        this.harga = harga;
        this.isi = isi;
        
        // Atribut luas per keramik dihitung dengan mengalikan atribut panjang dan lebar
        this.luas = this.panjang * this.lebar;
        // Atribut luas keramik per dus dihitung dengan mengkalikan atribut luas per keramik dengan jumlah keramik
        this.luasKeramikTotal = this.luas * this.isi;
    }
    
    // Method info() untuk print semua atribut objek
    public void info(){
        System.out.println("Panjang : " + this.panjang + " m");
        System.out.println("Lebar : " + this.lebar + " m");
        System.out.println("Isi per dus : " + this.isi + " pcs");
        System.out.println("Harga per dus : Rp." + this.harga);
        System.out.println("Luas per keramik : " + this.luas + " m^2");
        System.out.println("Luas total keramik satu dus : " + luasKeramikTotal + " m^2");
        System.out.println("");
    }
    
    // Kalkulasi kebutuhan keramik
    public void kalkulasi(){
        // Membuat objek / instance tanah dari kelas Tanah dengan luas 100 m^2
        Tanah tanah = new Tanah(100);
        
        // Perhitungan jumlah dan harga keramik yang dibutuhkan
        float kebutuhanDus = tanah.luas / luasKeramikTotal;
        float hargaTotal = kebutuhanDus * this.harga;
        
        // Print hasil kalkulasi
        System.out.println("Jumlah dus yang dibutuhkan : " + kebutuhanDus + " dus");
        System.out.println("Harga total : Rp." + hargaTotal);
        System.out.println("");
    }
}