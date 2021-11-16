package com.company.exercices.List;

public class MenuConstructorPantalla {
    public static StringBuilder constructorPantalla (StringBuilder menu){
        int longMaxLineMenu = 0;
        int posTrobada = 0;
        int posBuscada = 0;
        while (posTrobada > -1){
            posTrobada = menu.indexOf("\n", posBuscada);
            if (posTrobada > -1){
                if ((posTrobada - posBuscada) > longMaxLineMenu){
                    longMaxLineMenu = posTrobada - posBuscada;
                }
                menu.insert(posBuscada, "|  ");
                posBuscada = posTrobada + 4;
            }
        }
        longMaxLineMenu = longMaxLineMenu + 6;

        int longLineMenu = 0;
        String s = "";
        int dif = 0;
        int posTrobada1 = menu.indexOf("\n", 0);
        int posTrobada2 = menu.indexOf("\n", (posTrobada1 + 1));
        if (posTrobada2 > -1){
            longLineMenu = menu.substring((posTrobada1 + 1), posTrobada2).length();
            dif = longMaxLineMenu - longLineMenu;
            if ((dif % 2) == 0){
                menu.insert((posTrobada1 + 2), s, 0, ((dif / 2) - 2));
                menu.insert((posTrobada1 + longLineMenu + (dif / 2) - 2), s, 0, ((dif / 2) - 1));
            } else {
                menu.insert((posTrobada1 + 2), s, 0, ((dif / 2) - 1));
                menu.insert((posTrobada1 + longLineMenu + (dif / 2) - 0), s, 0, ((dif / 2) - 1));
            }
        }

        posTrobada = 0;
        posBuscada = 0;
        longLineMenu = 0;
        dif = 0;
        int tmp = 0;
        while (posTrobada > -1){
            posTrobada = menu.indexOf("\n", posBuscada);
            if (posTrobada > -1){
                menu.insert(posTrobada, "|  ");
                tmp = posTrobada + 3;
                longLineMenu = menu.substring(posBuscada, tmp).length();
                dif = longMaxLineMenu - longLineMenu;
                if (dif > 0){
                    menu.insert(posTrobada, s, 0, dif);
                }
                posBuscada = posBuscada + longMaxLineMenu + 1;
            }
        }

        int longMaxLineMenuTmp = longMaxLineMenu;
        StringBuilder horitzontalLine = new StringBuilder("");
        while (longMaxLineMenuTmp > 0){
            horitzontalLine.append("=");
            longMaxLineMenuTmp--;
        }
        horitzontalLine.append(System.getProperty("line.separator"));

        menu.insert(0, horitzontalLine);
        menu.replace(((longMaxLineMenu / 2) - 5), ((longMaxLineMenu / 2) + 6), "Orbita 10 ");

        int newPosition = longMaxLineMenu * 4 + 4;
        menu.insert(newPosition, horitzontalLine);

        menu.append(horitzontalLine);
        menu.append(System.getProperty("line.separator"));
        menu.append(System.getProperty("line.separator"));
        menu.append("Opció? ");

        return menu;
    }
}
