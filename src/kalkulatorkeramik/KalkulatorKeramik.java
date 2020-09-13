//@author PHILIP
package kalkulatorkeramik;

// KalkulatorKeramik sebagai Main class
public class KalkulatorKeramik {
    
    // Main method
    public static void main(String[] args) {
        // Membuat banyak objek dari kelas yang sama
        Keramik keramikA = new Keramik(0.3f,0.3f,54000,10);
        Keramik keramikB = new Keramik(0.4f,0.4f,65000,5);
        Keramik keramikC = new Keramik(0.3f,0.4f,60000,8);
        
        // Membuat objek tanah
        Tanah tanah = new Tanah(100);
        
        // Informasi semua keramik
        System.out.println("Keramik A");
        keramikA.info();
        System.out.println("Keramik B");
        keramikB.info();
        System.out.println("Keramik C");
        keramikC.info();
        
        // Informasi Tanah
        System.out.println("Tanah");
        tanah.info();
        
        // Kalkulasi kebutuhan keramik
        System.out.println("Keramik A");
        keramikA.kalkulasi();
        System.out.println("Keramik B");
        keramikB.kalkulasi();
        System.out.println("Keramik C");
        keramikC.kalkulasi();
    }
}
