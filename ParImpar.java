import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;

public class ParImpar {
    

    public static void main(String[] args) {
       
        int num;
        Scanner leer = new Scanner(System.in);
        
        System.out.println ("Escribe un numero");
        num=leer.nextInt();

        if (num%2==0){
            System.out.println("Es par");

        } else{
            System.out.println("Es impar");
        }
        
    }
    
}
