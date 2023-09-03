package adivina_el_numero;
import java.util.Random;
import javax.swing.JOptionPane;

public class Adivina_el_numero {
    
    public static void main(String[] args) {
        int guess, intentos, Try;
        Random number = new Random();
        guess = number.nextInt(100)+1;
        intentos = 3;
        do{
            Try = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor para el número oculto.\nIntentos restantes: " + intentos));
            if (Try != guess && Try < guess){
                JOptionPane.showMessageDialog(null, """
                                                    Intento fallido.
                                                    El valor ingresado es menor que el número oculto.""");
                intentos--;
            } else if (Try != guess && Try > guess){
                JOptionPane.showMessageDialog(null, """
                                                    Intento fallido.
                                                    El valor ingresado es mayor que el número oculto""");
                intentos--;
            } else {
                JOptionPane.showMessageDialog(null, "Intento exitoso. Felicidades.");
                break;
            }
        } while (intentos > 0);
        if (Try != guess){
            JOptionPane.showMessageDialog(null, "El número oculto era: " + guess);
        }
    } 
}
