//@author Philip Purwoko
// Github Portfolio : https://github.com/PhilipPurwoko
// Medium Article : https://medium.com/@philippurwoko

package kalkulatorkeramik;

// KalkulatorKeramik sebagai Main class
public class KalkulatorKeramik {
    // Main method
    public static void main(String[] args) {
        // Membuat objek keramik untuk masing masing merek
        Keramik keramikA = new Keramik(0.3f,0.3f,54000,10);
        Keramik keramikB = new Keramik(0.4f,0.4f,65000,5);
        Keramik keramikC = new Keramik(0.3f,0.4f,60000,8);
        
        // Menampilkan informasi semua merek keramik
        System.out.println("Keramik A");
        keramikA.info();
        System.out.println("Keramik B");
        keramikB.info();
        System.out.println("Keramik C");
        keramikC.info();
        
        // Membuat objek tanah dengan luas 100m^2
        Tanah tanah = new Tanah(100);
        
        // Menampilkan Informasi Tanah
        System.out.println("Tanah");
        tanah.info();
        
        // Kalkulasi kebutuhan keramik untuk masing masing merek
        System.out.println("Keramik A");
        keramikA.hitungHarga(keramikA.hitungDus(tanah.luas));
        System.out.println("Keramik B");
        keramikB.hitungHarga(keramikB.hitungDus(tanah.luas));
        System.out.println("Keramik C");
        keramikC.hitungHarga(keramikC.hitungDus(tanah.luas));
    }
}
