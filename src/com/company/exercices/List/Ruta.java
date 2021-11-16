package com.company.exercices.List;

import java.time.LocalDateTime;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Ruta {
    public static List<Waypoint_Dades> crearRutaInicial(){
        List<Waypoint_Dades> waypointDadesList = null;

        waypointDadesList = new LinkedList<Waypoint_Dades>();

        waypointDadesList.add(new Waypoint_Dades(0, "Òrbita de la Terra", new int[] {0,0,0}, true, LocalDateTime.parse("21-10-2020 01:10", Data.dateTimeFormatter), null, LocalDateTime.parse("22-10-2020 23:55", Data.dateTimeFormatter)));
        waypointDadesList.add(new Waypoint_Dades(1, "Punt Lagrange Terra-LLuna", new int[] {1,1,1}, true, LocalDateTime.parse("21-10-2020 01:00", Data.dateTimeFormatter), null, LocalDateTime.parse("22-10-2020 23:55", Data.dateTimeFormatter)));
        waypointDadesList.add(new Waypoint_Dades(2, "Òrbita de la LLuna", new int[] {2,2,2}, true, LocalDateTime.parse("21-10-2020 00:50", Data.dateTimeFormatter), null, LocalDateTime.parse("22-10-2020 23:55", Data.dateTimeFormatter)));
        waypointDadesList.add(new Waypoint_Dades(3, "Òrbita de Mart", new int[] {3,3,3}, true, LocalDateTime.parse("21-10-2020 00:40", Data.dateTimeFormatter), null, LocalDateTime.parse("22-10-2020 23:55", Data.dateTimeFormatter)));
        waypointDadesList.add(new Waypoint_Dades(4, "Òrbita de Júpiter", new int[] {4,4,4}, true, LocalDateTime.parse("21-10-2020 00:30", Data.dateTimeFormatter), null, LocalDateTime.parse("22-10-2020 23:55", Data.dateTimeFormatter)));
        waypointDadesList.add(new Waypoint_Dades(5, "Punt Lagrange Júpiter-Europa", new int[] {5,5,5}, true, LocalDateTime.parse("21-10-2020 00:20", Data.dateTimeFormatter), null, LocalDateTime.parse("22-10-2020 23:55", Data.dateTimeFormatter)));
        waypointDadesList.add(new Waypoint_Dades(6, "Òrbita de Europa", new int[] {6,6,6}, true, LocalDateTime.parse("21-10-2020 00:10", Data.dateTimeFormatter), null, LocalDateTime.parse("22-10-2020 23:55", Data.dateTimeFormatter)));
        waypointDadesList.add(new Waypoint_Dades(7, "Òrbita de Venus", new int[] {7,7,7}, true, LocalDateTime.parse("21-10-2020 00:01", Data.dateTimeFormatter), null, LocalDateTime.parse("22-10-2020 23:55", Data.dateTimeFormatter)));

        return waypointDadesList;
    }

    public static ComprovacioRendiment inicialitzarRuta(ComprovacioRendiment comprovacioRendimentTmp){
        List<Waypoint_Dades> waypointDadesListLinkedList;
        Waypoint_Dades waypointDadesTmp;
        waypointDadesListLinkedList = crearRutaInicial();

        for (Waypoint_Dades waypointTmp : waypointDadesListLinkedList){
            comprovacioRendimentTmp.waypointDadesDeque.push(waypointTmp);
        }

        waypointDadesTmp = new Waypoint_Dades(4, "Òrbita de Júpiter REPETIDA", new int[] {4,4,4}, true, LocalDateTime.parse("21-10-2020 00:30", Data.dateTimeFormatter), null, LocalDateTime.parse("22-10-2020 23:55", Data.dateTimeFormatter));
        comprovacioRendimentTmp.waypointDadesDeque.addFirst(waypointDadesTmp);
        comprovacioRendimentTmp.waypointDades = waypointDadesTmp;

        return  comprovacioRendimentTmp;
    }

    public static void visualitzarRuta(ComprovacioRendiment comprovacioRendimentTmp){
        System.out.println("La ruta esta formada pels waypoints: ");
        for (Waypoint_Dades waypointTmp : comprovacioRendimentTmp.waypointDadesDeque){
            System.out.println(waypointTmp.toString());
        }
    }

    public static void invertirRuta(ComprovacioRendiment comprovacioRendimentTmp){
        Deque<Waypoint_Dades> waypointDadesDequeInversa = new ArrayDeque<>();
        while (!comprovacioRendimentTmp.waypointDadesDeque.isEmpty()){
            waypointDadesDequeInversa.push(comprovacioRendimentTmp.waypointDadesDeque.pop());
        }

        while (!waypointDadesDequeInversa.isEmpty()){
            System.out.println(waypointDadesDequeInversa.pop());
        }
    }

    public static void existeixWaypointEnRuta(ComprovacioRendiment comprovacioRendimentTmp){
        Waypoint_Dades waypointDadesTmp;

        if (comprovacioRendimentTmp.waypointDadesDeque.size() == 0){
            System.out.println("La ruta està buida.");
        } else {
            if (comprovacioRendimentTmp.waypointDadesDeque.contains(comprovacioRendimentTmp.waypointDades)){
                System.out.println("SI hem trobat el waypoint " + comprovacioRendimentTmp.waypointDades.getNom() + " emmagatzemat en comprovacioRendimentTmp.wtmp, en la llista.");
            } else {
                System.out.println("NO hem trobat el waypoint " + comprovacioRendimentTmp.waypointDades.getNom() + " emmagatzemat en comprovacioRendimentTmp.wtmp, en la llista.");
            }
            waypointDadesTmp = new Waypoint_Dades(4, "Òrbita de Júpiter", new int[] {4,4,4}, true, LocalDateTime.parse("21-10-2020 00:30", Data.dateTimeFormatter), null, LocalDateTime.parse("22-10-2020 23:55", Data.dateTimeFormatter));
            if (comprovacioRendimentTmp.waypointDadesDeque.contains(waypointDadesTmp)){
                System.out.println("SI hem trobat el waypoint " + waypointDadesTmp.getNom() + " creat ara mateix, en la llista.");
            } else {
                System.out.println("NO hem trobat el waypoint " + waypointDadesTmp.getNom() + " creat ara mateix, en la llista.");
            }
        }
    }
}
