package com.company.exercices.List;

import java.util.Deque;
import java.util.Scanner;

public class Krona {
    public static void menu(){
        String option;
        Scanner sc = new Scanner(System.in);
        StringBuilder menu = new StringBuilder("");

        ComprovacioRendiment comprovacioRendimentTmp = null;
        Deque<Waypoint_Dades> waypointDadesDeque = null;

        do {
            menu.delete(0, menu.length());

            menu.append(System.getProperty("line.separator"));
            menu.append("RV-18A Krona ");
            menu.append(System.getProperty("line.separator"));
            menu.append(System.getProperty("line.separator"));

            menu.append("1. Inicialitzar el procés de comprovació d'un ArrayList i un LinkedList de waypoints");
            menu.append(System.getProperty("line.separator"));
            menu.append("2. Comprovar rendiment d'inicialització d'un ArrayList i un LinkedList de waypoints");
            menu.append(System.getProperty("line.separator"));
            menu.append("3. Comprovar rendiment d'inserció en un ArrayList i en un LinkedList de waypoints");
            menu.append(System.getProperty("line.separator"));
            menu.append("4. Modificació dels waypoints de l'ArrayList i del LinkedList ");
            menu.append(System.getProperty("line.separator"));
            menu.append("5. Esborrar waypoints de l'ArrayList i del LinkedList.");
            menu.append(System.getProperty("line.separator"));
            menu.append(System.getProperty("line.separator"));

            menu.append("6. Modificar coordenades i nom dels waypoints de l'ArrayList amb ID parell.");
            menu.append(System.getProperty("line.separator"));
            menu.append("7. Visualitzar els waypoints de l'ArrayList ordenats.");
            menu.append(System.getProperty("line.separator"));
            menu.append("8. LListar els waypoints de l'ArrayList que es trobin a certa distància de la Terra.");
            menu.append(System.getProperty("line.separator"));
            menu.append(System.getProperty("line.separator"));

            menu.append("10. Inicialitzar una ruta");
            menu.append(System.getProperty("line.separator"));
            menu.append("11. Visualitzar una ruta");
            menu.append(System.getProperty("line.separator"));
            menu.append("12. Invertir una ruta");
            menu.append(System.getProperty("line.separator"));
            menu.append("13. Existeix el waypoint 'Òrbita de Júpiter REPETIDA' en la ruta?");
            menu.append(System.getProperty("line.separator"));
            menu.append(System.getProperty("line.separator"));

            menu.append("20. Fer una copia de seguretat de la BD");
            menu.append(System.getProperty("line.separator"));
            menu.append("21. Esborrar tota la BD");
            menu.append(System.getProperty("line.separator"));
            menu.append(System.getProperty("line.separator"));

            menu.append("50. Tornar al menú pare (PNS-24 Puma)");
            menu.append(System.getProperty("line.separator"));

            System.out.println(MenuConstructorPantalla.constructorPantalla(menu));

            option = sc.next();
            switch (option){
                case "1":
                    comprovacioRendimentTmp = Waypoint.inicialitzarComprovacioRendiment();
                    bloqueigPantalla();
                    break;
                case "2":
                    comprovacioRendimentTmp = Waypoint.comprovarRendimentInicialitzacio(10, comprovacioRendimentTmp);
                    bloqueigPantalla();
                    break;
                case "3":
                    comprovacioRendimentTmp = Waypoint.modificarWaypoints(comprovacioRendimentTmp);
                    bloqueigPantalla();
                    break;
                case "4":
                    comprovacioRendimentTmp = Waypoint.modificarWaypoints(comprovacioRendimentTmp);
                    bloqueigPantalla();
                    break;
                case "5":
                    comprovacioRendimentTmp = Waypoint.esborrarWaypoints(comprovacioRendimentTmp);
                    bloqueigPantalla();
                    break;
                case "6":
                    comprovacioRendimentTmp = Waypoint.modificarCoordenadesINomDeWaypoints(comprovacioRendimentTmp);
                    bloqueigPantalla();
                    break;
                case "7":
                    Waypoint.visualitzarWaypointsOrdenats(comprovacioRendimentTmp);
                    bloqueigPantalla();
                    break;
                case "8":
                    Waypoint.waypointsACertaDistanciaMaxDeLaTerra(comprovacioRendimentTmp);
                    bloqueigPantalla();
                    break;
                case "10":
                    comprovacioRendimentTmp = Ruta.inicialitzarRuta(comprovacioRendimentTmp);
                    bloqueigPantalla();
                    break;
                case "11":
                    Ruta.visualitzarRuta(comprovacioRendimentTmp);
                    bloqueigPantalla();
                    break;
                case "12":
                    Ruta.invertirRuta(comprovacioRendimentTmp);
                    bloqueigPantalla();
                    break;
                case "13":
                    Ruta.existeixWaypointEnRuta(comprovacioRendimentTmp);
                    bloqueigPantalla();
                    break;
                case "50":
                    bloqueigPantalla();
                    break;
                default:
                    System.out.println("COMANDA NO RECONEGUDA");
            }
        } while (!option.equals("50"));
    }

    public static void bloqueigPantalla(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nToca 'C' per continuar");
        while (sc.hasNext()){
            if ("C".equalsIgnoreCase(sc.next())) break;
        }
    }
}
