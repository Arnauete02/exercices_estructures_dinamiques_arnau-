package com.company.exercices.List;

import java.io.IOException;
import java.util.Scanner;

public class PNS24_Puma {
    public static void main(String[] args) {

    }

    public static void bloquejarPantalla(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nToca 'C' per continuar ");
        while (scanner.hasNext()){
            if ("C".equalsIgnoreCase(scanner.next())) break;
        }
    }

    static void menuPNS24Puma() throws IOException {
        String opcio;
        StringBuilder menu = new StringBuilder("");
        Scanner sc = new Scanner(System.in);

        do {
            menu.delete(0, menu.length());

            menu.append(System.getProperty("line.separator"));
            menu.append("PNS-24 Puma");
            menu.append(System.getProperty("line.separator"));
            menu.append(System.getProperty("line.separator"));
            menu.append("1. Sistema de navegació Krona");
            menu.append(System.getProperty("line.separator"));
            menu.append("2. Sistema d'atac Orion");
            menu.append(System.getProperty("line.separator"));
            menu.append("3. Sistema de defensa Sirena");
            menu.append(System.getProperty("line.separator"));
            menu.append("4. Sistema de comunicacions Evkalipt");
            menu.append(System.getProperty("line.separator"));
            menu.append("5. Sistema d'identificació Khom-Nikel");
            menu.append(System.getProperty("line.separator"));
            menu.append("6. Sistema de visualització PPV");
            menu.append(System.getProperty("line.separator"));
            menu.append("7. Sistema de grabació Kristall");
            menu.append(System.getProperty("line.separator"));
            menu.append(System.getProperty("line.separator"));
            menu.append("10. Control de sondes Delta");
            menu.append(System.getProperty("line.separator"));
            menu.append(System.getProperty("line.separator"));
            menu.append("50. Tancar el sistema");
            menu.append(System.getProperty("line.separator"));

            System.out.print(MenuConstructorPantalla.constructorPantalla(menu));

            opcio = sc.next();

            switch (opcio) {
                case "1":
                    Krona.menu();
                    bloquejarPantalla();
                    break;
                case "2":

                    bloquejarPantalla();
                    break;
                case "3":

                    bloquejarPantalla();
                    break;
                case "4":

                    bloquejarPantalla();
                    break;
                case "5":

                    bloquejarPantalla();
                    break;
                case "6":

                    bloquejarPantalla();
                    break;
                case "7":

                    bloquejarPantalla();
                    break;
                case "10":

                    bloquejarPantalla();
                    break;
                case "50":
                    break;
                default:
                    System.out.println("COMANDA NO RECONEGUDA");
            }
        } while (!opcio.equals("50"));
    }

}
