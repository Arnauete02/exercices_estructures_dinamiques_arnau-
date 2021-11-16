package com.company.exercices.List;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Waypoint {

    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

    public static ComprovacioRendiment inicialitzarComprovacioRendiment(){
        ComprovacioRendiment comprovacioRendimentTmp = new ComprovacioRendiment();
        return comprovacioRendimentTmp;
    }

    public static ComprovacioRendiment comprovarRendimentInicialitzacio(int numObjACrear, ComprovacioRendiment comprovacioRendimentTmp){
        long inicialTime;
        long finalTime;
        long nanosecondsTime;
        long milisecondsTime;

        int[] tmpCoordenades = new int[] {0,0,0};

        inicialTime = System.nanoTime();
        for (int i = 0; i < numObjACrear; i++) { comprovacioRendimentTmp.llistaArrayList.add(new Waypoint_Dades(0,"Òrbita de la Terra", new int[] {0,0,0}, true, LocalDateTime.parse("15-08-1954 00:01", IKSRotarranConstants.dateTimeFormatter), null, null)); }

        finalTime = System.nanoTime();
        nanosecondsTime = finalTime - inicialTime;
        milisecondsTime = TimeUnit.MILLISECONDS.convert(nanosecondsTime, TimeUnit.NANOSECONDS);

        System.out.println("Time to insert "+ numObjACrear +" waypoints to ArrayList: "+ milisecondsTime);

        inicialTime = System.nanoTime();
        for (int i = 0; i < numObjACrear; i++) { comprovacioRendimentTmp.llistaLinkedList.add(new Waypoint_Dades(0, "Òrbita de la Terra", tmpCoordenades, true, LocalDateTime.parse("15-08-1954 00:01", IKSRotarranConstants.dateTimeFormatter), null, null)); }
        finalTime = System.nanoTime();
        nanosecondsTime = TimeUnit.MILLISECONDS.convert(nanosecondsTime, TimeUnit.NANOSECONDS);
        System.out.println("Time to insert "+ numObjACrear +" waypoints to LinkedList: "+ milisecondsTime);

        return comprovacioRendimentTmp;
    }

    public static ComprovacioRendiment comprovacioRendimentInsercio(ComprovacioRendiment comprovacioRendimentTmp) {
        long inicialTime;
        long finalTime;
        int halfList;

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        int[] tmpCoordenades = new int[] {0,0,0};

        halfList = comprovacioRendimentTmp.llistaArrayList.size()/2;
        System.out.println("llistaArrayList.size(): "+ comprovacioRendimentTmp.llistaArrayList.size() +", halfList: "+ halfList +"\n");

        /*
         * First waypoint at first position of lists
         * - ArrayList
         */
        inicialTime = System.nanoTime();
        comprovacioRendimentTmp.llistaArrayList.add(0, new Waypoint_Dades(0,"Òrbita de la Terra", tmpCoordenades, true, LocalDateTime.parse("15-08-1954 00:01", dateTimeFormatter), null, null));
        finalTime = System.nanoTime();
        System.out.println("Time to insert 1 waypoint to first position of ArrayList: ");
        System.out.println(finalTime - inicialTime);

        /*
         * First waypoint at first position of lists
         * - LinkedList
         */
        inicialTime = System.nanoTime();
        comprovacioRendimentTmp.llistaLinkedList.add(0, new Waypoint_Dades(0,"Òrbita de la Terra", tmpCoordenades, true, LocalDateTime.parse("15-08-1954 00:01", dateTimeFormatter), null, null));
        finalTime = System.nanoTime();
        System.out.println("Time to insert 1 waypoint to first position of ArrayList: ");
        System.out.println(finalTime - inicialTime);

        /*
         * Insert waypoint at middle of lists
         * - ArrayList
         */
        inicialTime = System.nanoTime();
        comprovacioRendimentTmp.llistaArrayList.add(halfList, new Waypoint_Dades(0,"Òrbita de la Terra", tmpCoordenades, true, LocalDateTime.parse("15-08-1954 00:01", dateTimeFormatter), null, null));
        finalTime = System.nanoTime();
        System.out.println("Time to insert 1 waypoint at middle '"+ halfList +"' of ArrayList: ");
        System.out.println(finalTime - inicialTime);

        /*
         * Insert waypoint at middle of lists
         * - LinkedList
         */
        inicialTime = System.nanoTime();
        comprovacioRendimentTmp.llistaLinkedList.add(halfList, new Waypoint_Dades(0,"Òrbita de la Terra", tmpCoordenades, true, LocalDateTime.parse("15-08-1954 00:01", dateTimeFormatter), null, null));
        finalTime = System.nanoTime();
        System.out.println("Time to insert 1 waypoint at middle '"+ halfList +"' of LinkedList: ");
        System.out.println(finalTime - inicialTime);

        /*
         * Insert waypoint at final of lists
         * - ArrayList
         */
        inicialTime = System.nanoTime();
        comprovacioRendimentTmp.llistaArrayList.add(comprovacioRendimentTmp.llistaArrayList.size(), new Waypoint_Dades(0,"Òrbita de la Terra", tmpCoordenades, true, LocalDateTime.parse("15-08-1954 00:01", dateTimeFormatter), null, null));
        finalTime = System.nanoTime();
        System.out.println("Time to insert 1 waypoint at final of ArrayList: ");
        System.out.println(finalTime - inicialTime);

        /*
         * Insert waypoint at final of lists
         * - LinkedList
         */
        inicialTime = System.nanoTime();
        comprovacioRendimentTmp.llistaArrayList.add(comprovacioRendimentTmp.llistaLinkedList.size(), new Waypoint_Dades(0,"Òrbita de la Terra", tmpCoordenades, true, LocalDateTime.parse("15-08-1954 00:01", dateTimeFormatter), null, null));
        finalTime = System.nanoTime();
        System.out.println("Time to insert 1 waypoint at final of LinkedList: ");
        System.out.println(finalTime - inicialTime);

        return comprovacioRendimentTmp;
    }

    public static ComprovacioRendiment modificarWaypoints(ComprovacioRendiment comprovacioRendimentTmp){
        int finalPosition;
        Waypoint_Dades tmpWaypoint;
        List<Integer> idXArrayList = new ArrayList<Integer>();

        //1
        for (int i = 0; i < comprovacioRendimentTmp.llistaArrayList.size(); i++) idXArrayList.add(i);
        finalPosition = idXArrayList.size() - 1;

        System.out.println("List idXArrayList is inicialitzed with "+ idXArrayList.size() +" elements." +
                "\nFirst elements have the next valor: "+ idXArrayList.get(0) +
                ".\nFinal element have the next valor: "+ idXArrayList.get(finalPosition));

        //2
        for (int i : idXArrayList){
            System.out.println("BEFORE CHANGE: comprovacioRendimentTmp.llistaArrayList.get("+ i +").getId(): "+ comprovacioRendimentTmp.llistaArrayList.get(i).getId());
            comprovacioRendimentTmp.llistaArrayList.get(i).setId(i);
            System.out.println("AFTER CHANGE: comprovacioRendimentTmp.llistaArrayList.get("+ i +").getId(): "+ comprovacioRendimentTmp.llistaArrayList.get(i).getId());
        }

        //3.1
        for (Waypoint_Dades tmpWaypoint2 : comprovacioRendimentTmp.llistaArrayList){
            System.out.println("ID="+ tmpWaypoint2.getId() +", nom="+ tmpWaypoint2.getNom());
        }

        //3.2
        Iterator<Waypoint_Dades> waypointDadesIterator = comprovacioRendimentTmp.llistaArrayList.iterator();
        while (waypointDadesIterator.hasNext()){
            tmpWaypoint = waypointDadesIterator.next();
            System.out.println("ID="+ tmpWaypoint.getId() +", nom="+ tmpWaypoint.getNom());
        }

        //4
        System.out.println("Prepare to delete contain of llistaLinkedList that have "+ comprovacioRendimentTmp.llistaLinkedList.size() +" elements.");
        comprovacioRendimentTmp.llistaLinkedList.clear();
        System.out.println("DELETED! Now llistaLinkedList have "+ comprovacioRendimentTmp.llistaLinkedList.size() +" elements.");
        comprovacioRendimentTmp.llistaLinkedList.addAll(comprovacioRendimentTmp.llistaArrayList);
        System.out.println("Now elements os llistaArrayList are copied into llistaLinkedList, that now this have "+ comprovacioRendimentTmp.llistaLinkedList.size() + " elements.");

        //5.1
        for (int i = 0; i < comprovacioRendimentTmp.llistaArrayList.size(); i++){
            System.out.println("Waypoint with id="+ comprovacioRendimentTmp.llistaArrayList.get(i).getId() +" have the name="+ comprovacioRendimentTmp.llistaArrayList.get(i).getNom());
        }

        //5.2
        waypointDadesIterator = comprovacioRendimentTmp.llistaLinkedList.iterator();
        while (waypointDadesIterator.hasNext()){
            tmpWaypoint = waypointDadesIterator.next();
            if (tmpWaypoint.getId() < 5){
                tmpWaypoint.setNom("Punt Lagrange entre la Terra i la Lluna");
                System.out.println("Modified waypoint with id="+ tmpWaypoint.getId());
            }
        }

        waypointDadesIterator = comprovacioRendimentTmp.llistaLinkedList.iterator();
        while (waypointDadesIterator.hasNext()){
            tmpWaypoint = waypointDadesIterator.next();
            System.out.println("Waypoint with id="+ tmpWaypoint.getId() +" have the name="+ tmpWaypoint.getNom());
        }

        return comprovacioRendimentTmp;
    }

    public static ComprovacioRendiment esborrarWaypoints(ComprovacioRendiment comprovacioRendimentTmp){
        Waypoint_Dades tmpWaypoint;

        //1
        /* int idTmp;
         * for (Waypoint_Dades tmpWaypoint2 : comprovacioRendimentTmp.llistaArrayList){
         *    idTmp = tmpWaypoint2.getId();
         *    if (tmpWaypoint2.getId() < 6){
         *        comprovacioRendimentTmp.llistaArrayList.remove(idTmp);
         *        System.out.println("Deleted waypoint with id="+ tmpWaypoint2.getId());
         *    }
         * }
         * Si intentem esborrar el waypoint no es pot perquè el for no es dona compte de que hi ha
         * 1 element menys i peta.
         */

        //2
        Iterator<Waypoint_Dades> waypointDadesIterator = comprovacioRendimentTmp.llistaLinkedList.iterator();
        while (waypointDadesIterator.hasNext()){
            tmpWaypoint = waypointDadesIterator.next();
            if (tmpWaypoint.getId() > 4){
                System.out.println("Deleted waypoint with id="+ tmpWaypoint.getId());
                waypointDadesIterator.remove();
            }
        }

        waypointDadesIterator = comprovacioRendimentTmp.llistaLinkedList.iterator();
        while (waypointDadesIterator.hasNext()){
            tmpWaypoint = waypointDadesIterator.next();
            System.out.println("Waypoint with id="+ comprovacioRendimentTmp.llistaArrayList.get(tmpWaypoint.getId()).getId() +" have the name "+ comprovacioRendimentTmp.llistaArrayList.get(tmpWaypoint.getId()).getId());
        }

        //3
        ListIterator<Waypoint_Dades> waypointDadesListIterator = comprovacioRendimentTmp.llistaLinkedList.listIterator();
        while (waypointDadesListIterator.hasNext()){
            tmpWaypoint = waypointDadesListIterator.next();
            if (tmpWaypoint.getId() == 2){
                System.out.println("Deleted waypoint with id="+ tmpWaypoint.getId());
                waypointDadesListIterator.remove();
            }
        }

        waypointDadesListIterator = comprovacioRendimentTmp.llistaLinkedList.listIterator(comprovacioRendimentTmp.llistaLinkedList.size() - 1);
        while (waypointDadesListIterator.hasPrevious()){
            tmpWaypoint = waypointDadesListIterator.previous();
            System.out.println("Waypoint with id="+ tmpWaypoint.getId() +" have the name="+ tmpWaypoint.getNom());
        }

        return comprovacioRendimentTmp;
    }

    public static ComprovacioRendiment modificarCoordenadesINomDeWaypoints(ComprovacioRendiment comprovacioRendimentTmp){
        Waypoint_Dades waypointTmp;
        Scanner sc = new Scanner(System.in);
        String newName;
        String newCoordenades = null;
        int position;
        int numReadParam;
        int[] coordenadesTmp;
        boolean coordenadesCorrectes;

        Iterator<Waypoint_Dades> waypointDadesIterator = comprovacioRendimentTmp.llistaArrayList.iterator();

        while (waypointDadesIterator.hasNext()){
            waypointTmp = waypointDadesIterator.next();
            if (waypointTmp.getId() % 2 == 0){
                System.out.println("------ Modificar el waypoint amb id = " + waypointTmp.getId() + " ------");
                System.out.println("Nom actual: "+ waypointTmp.getNom());
                System.out.println("Nom nou: ");
                newName = sc.nextLine();
                waypointTmp.setNom(newName);

                coordenadesCorrectes = false;
                while (coordenadesCorrectes == false){
                    numReadParam = 0;
                    while (numReadParam != 3){
                        System.out.println("Coordenades actuals: " + waypointTmp.getCoordenades()[0] + " " +  waypointTmp.getCoordenades()[1] + " " + waypointTmp.getCoordenades()[2]);
                        System.out.println("Coordenades noves (format: 1 13 7): ");
                        newCoordenades = sc.nextLine();

                        numReadParam = newCoordenades.split(" ").length;
                        if (numReadParam != 3) {
                            System.out.println("ERROR: introduir 3 paràmentres separats per 1 espai en blanc. Has introduit " + numReadParam + " paràmetres.");
                        }
                    }
                }

                position = 0;
                coordenadesTmp = new int[] {0,0,0};

                for (String coordenada : newCoordenades.split(" ")){
                    if (Cadena.stringIsInt(coordenada)){
                        coordenadesTmp[position] = Integer.parseInt(coordenada);
                        position++;
                    } else {
                        System.out.println("ERROR: coordenada "+ coordenada +" no vàlida.");
                    }
                }

                if (position == 3){
                    waypointTmp.setCoordenades(coordenadesTmp);
                    coordenadesCorrectes = true;
                }
            }
            System.out.println();
        }
        return comprovacioRendimentTmp;
    }

    //REVISAR
    public static void visualitzarWaypointsOrdenats(ComprovacioRendiment comprovacioRendimentTmp){
        /*ArrayList<Waypoint_Dades> waypointDadesArrayList = new ArrayList<Waypoint_Dades>();

        waypointDadesArrayList.addAll(comprovacioRendimentTmp.llistaArrayList);
        Collections.sort(waypointDadesArrayList);

        for (Waypoint_Dades waypointTmp : waypointDadesArrayList){
            System.out.println(waypointTmp);
        }*/
    }

    //REVISAR
    public static void waypointsACertaDistanciaMaxDeLaTerra(ComprovacioRendiment comprovacioRendimentTmp){
        Scanner sc = new Scanner(System.in);
        String stringDistanciaALaTerra;
        int intDistanciaALaTerra;
        ArrayList<Waypoint_Dades> waypointDadesArrayList = new ArrayList<>();
        int distancia = 0;

        System.out.println("Distancia maxima de la Terra: ");
        stringDistanciaALaTerra = sc.nextLine();
        while (Cadena.stringIsInt(stringDistanciaALaTerra) == false){
            System.out.println("ERROR: la distància màxima de la Terra " + stringDistanciaALaTerra + " no és correcta.");
            System.out.println("Distancia maxima de la Terra: ");
            stringDistanciaALaTerra = sc.nextLine();
        }

        intDistanciaALaTerra = Integer.parseInt(stringDistanciaALaTerra);
        waypointDadesArrayList.addAll(comprovacioRendimentTmp.llistaArrayList);
        //Collections.sort(waypointDadesArrayList);

        for (Waypoint_Dades waypointTmp : waypointDadesArrayList){
            distancia = (int)Math.pow(waypointTmp.getCoordenades()[0], 2) + (int)Math.pow(waypointTmp.getCoordenades()[1], 2) + (int)Math.pow(waypointTmp.getCoordenades()[2], 2);
            if (distancia <= intDistanciaALaTerra) System.out.println(waypointTmp);
            else break;
        }
    }
}
