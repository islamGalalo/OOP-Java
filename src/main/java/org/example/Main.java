package org.example;

import Encapsulation.Encaps;

public class Main {
    public static void main(String[] args) {
        Cars c1 = new Cars("Ford", 1999, "Red");
//      c1.color = "blue" ;
        System.out.println(c1.color);
        Trucks c2 = new Trucks();
        c2.year = 2005;
        System.out.println(c2.year);
        c2.color = "Blue";
        System.out.println(c2.color);
        c2.model="MG";
        System.out.println(c2.model);
        c2.TurnOn();
        c2.TurnOff();
        Cars c3 = new Cars("fiat", 2024, "Red");
        System.out.println(c3.color);
        System.out.println(c3.year);
        System.out.println(c3.model);
        Cars c6 = new Cars();
        c6.year = 2006;

        System.out.println(c6.year);
        Encaps caps = new Encaps();
        System.out.println(caps.addProduction);



        SetGet sg = new SetGet();
        System.out.println( sg.getPlayer());

    }
}