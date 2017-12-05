import java.util.Scanner;

public class Menu {
    public static int menu() {

        //Creo l'Scanner per llegir l'opció introduida
        Scanner opcio = new Scanner(System.in);

        //Mostro el menú
        mostrarMenu();

        //Retorno la opció introduida
        return opcio.nextInt();
    }

    public static void mostrarMenu() {
        System.out.println("1. Cerca de Resultats\n" +
                "2. Desar Preferits\n" +
                "3. Millors Videos\n" +
                "4. Estadístiques\n" +
                "5. Llistes de Reproducció\n" +
                "6. El Mosaic\n" +
                "7. Sortir\n" +
                "\nSel·lecciona una opcio:");
    }
}
