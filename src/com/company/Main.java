package com.company;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        File f = new File("textik.txt");
        try {
            if (f.createNewFile()) {
                System.out.println("Soubor se uspesne vytvoril");
            } else {
                System.out.println("Soubor se nevytvoril");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
