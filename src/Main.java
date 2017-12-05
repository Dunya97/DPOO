import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String args[])throws IOException{
        int opcio;
        do {
            //Inicialment mostrem el menú i llegeixim quina opció ha triat l'usuari
            opcio = Menu.menu();
            //Comprovem si aquesta és correcta i executem el codi adient
            if (opcio > 7 || opcio < 1) {
                System.out.println("\nOpció incorrecta!\n La opció ha d'estar entre el 1 o el 7, torna-la a introduir\n");
            } else {
                switch (opcio) {
                    case 1: // Cerca de Resultats
                        Opcions.cercaResultats();

                        /*try {

                        }
                        catch (IOException e) {
                            System.out.println("S'ha produit un error de connexió");
                        }*/
                    //}
                        break;
                    case 2: // Desar Preferits
                        break;
                    case 3: // Millors Videos
                        break;
                    case 4: // Estadístiques
                        break;
                    case 5: // Llistes de Reproducció
                        break;
                    case 6: // El Mosaic
                        break;
                }
            }
        } while (opcio != 7);
        System.out.println("\nAdeu!!\n");
    }
}

