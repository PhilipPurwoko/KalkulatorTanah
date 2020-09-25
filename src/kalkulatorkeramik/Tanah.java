//@author Philip Purwoko
// Github Portfolio : https://github.com/PhilipPurwoko
// Medium Article : https://medium.com/@philippurwoko

package kalkulatorkeramik;

// Membuat class Tanah
public class Tanah {
    // Deklarasi atribut luas
    int luas;
    
    // Object Constructor
    Tanah(int luas){
        this.luas = luas;
    }
    
    // Method untuk menampilkan informasi tanah
    void info(){
        System.out.println("Luas tanah : " + this.luas + " m^2");
        System.out.println("");
    }
}
