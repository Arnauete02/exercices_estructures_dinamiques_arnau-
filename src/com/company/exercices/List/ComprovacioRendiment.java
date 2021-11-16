package com.company.exercices.List;

import java.util.*;

public class ComprovacioRendiment {

    int[] coordenadesTemp = null;
    List<Waypoint_Dades> llistaArrayList;
    List<Waypoint_Dades> llistaLinkedList;

    Waypoint_Dades waypointDades;
    public Deque<Waypoint_Dades> waypointDadesDeque;

    ComprovacioRendiment(){
        this.coordenadesTemp = new int[] {0,0,0};
        llistaArrayList = new ArrayList<>();
        llistaLinkedList = new LinkedList<>();
        this.waypointDades = null;
        this.waypointDadesDeque = new ArrayDeque<Waypoint_Dades>();
    }
}
