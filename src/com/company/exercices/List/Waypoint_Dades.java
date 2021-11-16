package com.company.exercices.List;

import java.text.Collator;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Locale;

public class Waypoint_Dades implements Comparable {

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
        this.dataAnulacio = dataAnulacio;
        this.dataModificacio = dataModificacio;
    }

    @Override
    public String toString() {
        String str;
        int distancia = 0;
        distancia = (int)Math.pow(this.getCoordenades()[0], 2) + (int)Math.pow(this.getCoordenades()[1], 2) + (int)Math.pow(this.getCoordenades()[2], 2);

        str = "WAYPOINT "+ id +":"+
                "\n     nom = "+ nom +
                "\n     coordenades(x, y, z) = ("+ coordenades[0] + ", " + coordenades[1] + "," + coordenades[2] + ") (distancia = "+ distancia +")" +
                "\n     actiu = "+ actiu;

        if (dataCreacio == null){
            str = str + "\n     dataCreacio = NULL";
        } else {
            str = str + "\n     dataCreacio = "+ dataCreacio.format(IKSRotarranConstants.dateTimeFormatter);
        }
        if (dataModificacio == null){
            str = str + "\n     dataModificacio = NULL";
        } else {
            str = str + "\n     dataModificacio = "+ dataModificacio.format(IKSRotarranConstants.dateTimeFormatter);
        }

        return  str;

        /*return "Waypoint_Dades[id="+ this.id +
                ", nom="+ this.nom +
                ", coordenades="+ this.coordenades +
                ", actiu="+ this.actiu +
                ", dataCreacio="+ this.dataCreacio +
                ", dataAnulacio="+ this.dataAnulacio +
                ", dataModificacio="+ this.dataModificacio + "]";*/
    }

    @Override
    public int compareTo(Waypoint_Dades w){
        int result = 0;
        int distanciaM1 = 0;
        int distanciaM2 = 0;
        if (Arrays.equals(this.getCoordenades(), w.getCoordenades())){
            Collator collator = Collator.getInstance(new Locale("es"));
            collator.setStrength(Collator.TERTIARY);
            result = collator.compare(this.getNom(), w.getNom());
        } else {
            distanciaM1 = (int)Math.pow(this.getCoordenades()[0], 2) + (int)Math.pow(this.getCoordenades()[1], 2) + (int)Math.pow(this.getCoordenades()[2], 2);
            distanciaM2 = (int)Math.pow(w.getCoordenades()[0], 2) + (int)Math.pow(w.getCoordenades()[1], 2) + (int)Math.pow(w.getCoordenades()[2], 2);
            if (distanciaM1 < distanciaM2) result = -1;
            else {
                if (distanciaM1 > distanciaM2) result = 1;
                else result = 0;
            }
        }
        return result;
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

    public void setCoordenades(int[] coordenades) {
        this.coordenades = coordenades;
    }

    public int[] getCoordenades() {
        return coordenades;
    }

}
