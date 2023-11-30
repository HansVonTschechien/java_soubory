package com.company;

import java.io.*;

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

        try (FileWriter writer = new FileWriter("textik.txt")) {
            writer.write("ahoj");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader reader = new FileReader("textik.txt")) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
