package com.company.exercices.List;

import java.time.LocalDateTime;

public class Waypoint_Dades {

    private int id;
    private String nom;
    private int[] coordenades;
    private boolean actiu;
    private LocalDateTime dataCreacio;
    private LocalDateTime dataAnulacio;
    private LocalDateTime dataModificacio;

    Waypoint_Dades(int id, String nom, int[] coordenades, boolean actiu,
                   LocalDateTime dataCreacio, LocalDateTime dataAnulacio, LocalDateTime dataModificacio){
        this.id = id;
        this.nom = nom;
        this.coordenades = coordenades;
        this.actiu = actiu;
        this.dataCreacio = dataCreacio;
        if (this.actiu == false){
            this.dataAnulacio = dataAnulacio;
        }
        this.dataModificacio = dataModificacio;
    }

    @Override
    public String toString() {
        return "Waypoint_Dades[id="+ this.id +
                ", nom="+ this.nom +
                ", coordenades="+ this.coordenades +
                ", actiu="+ this.actiu +
                ", dataCreacio="+ this.dataCreacio +
                ", dataAnulacio="+ this.dataAnulacio +
                ", dataModificacio="+ this.dataModificacio + "]";
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
