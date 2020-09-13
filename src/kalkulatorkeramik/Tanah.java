// @author PHILIP
package kalkulatorkeramik;

// Membuat class Tanah
public class Tanah {
    // Deklarasi atribut luas
    int luas;
    
    // Constructor
    public Tanah(int luas){
        this.luas = luas;
    }
    
    // Method info untuk print atribut luas
    public void info(){
        System.out.println("Luas tanah : " + this.luas + " m^2");
        System.out.println("");
    }
}
