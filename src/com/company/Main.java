package com.company;

import javax.swing.*;
import java.io.*;
import java.util.Scanner;

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
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }

        JFileChooser chooser = new JFileChooser();
        int returnValue = chooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            System.out.println("Bylo vybrano: " + chooser.getSelectedFile().getName());
        } else {
            System.out.println("Nebyl vybran soubor");
        }
    }
}
