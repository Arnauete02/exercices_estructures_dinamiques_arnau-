package com.company.exercices.List;

import java.time.format.DateTimeFormatter;

public interface IKSRotarranConstants {
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH_mm");

    String[] LLOCS_DE_SERVEI = {"", "pont", "enginyeria", "cuina", "infermeria", "sala d'armes"};
    String[] DEPARTAMENTS = {"", "comandament", "armes", "timó i navegació", "enginyeria", "ciència"};
}
