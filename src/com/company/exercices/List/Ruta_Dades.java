package com.company.exercices.List;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Ruta_Dades {

    private int id;
    private String nom;
    private ArrayList<Integer> waypoints;
    private boolean actiu;
    private LocalDateTime dataCreacio;
    private LocalDateTime dataAnulacio;
    private LocalDateTime dataModificacio;

    Ruta_Dades(int id, String nom, ArrayList<Integer> waypoints, boolean actiu,
               LocalDateTime dataCreacio, LocalDateTime dataAnulacio, LocalDateTime dataModificacio){
        this.id = id;
        this.nom = nom;
        this.waypoints = waypoints;
        this.actiu = actiu;
        this.dataCreacio = dataCreacio;
        if(this.actiu == false){
            this.dataAnulacio = dataAnulacio;
        }
        this.dataModificacio = dataModificacio;
    }

    @Override
    public String toString() {
        return "Ruta_Dades[" +
                "id=" + id +
                ", nom=" + nom +
                ", waypoints=" + waypoints +
                ", actiu=" + actiu +
                ", dataCreacio=" + dataCreacio +
                ", dataAnulacio=" + dataAnulacio +
                ", dataModificacio=" + dataModificacio +']';
    }
}
