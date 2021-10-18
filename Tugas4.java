//Rici Rahman
public class Tugas4 {

    static int myMethod(int nilai) {
  
        if(nilai >=0 && nilai<= 25){
            System.out.println(" Nilai Anda: E");
        } else if ( nilai>= 26 && nilai <= 50){
            System.out.println("Nilai Anda: D");
        } else if ( nilai>= 51 && nilai <= 75){
            System.out.println("Nilai Anda: C");
        } else if ( nilai>= 76 && nilai <= 90){
            System.out.println("Nilai Anda: B");
        } else if (nilai>= 91 && nilai <=100){
            System.out.println("Nilai Anda: A");   
        } else if (nilai>=100) {
            System.out.println("Invalid Number");
        } 
        return nilai;  
    }   
  
    public static void main(String[] args) {
      myMethod(86);
    
     
    }
}