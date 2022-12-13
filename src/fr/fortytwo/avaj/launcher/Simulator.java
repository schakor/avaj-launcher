package fr.fortytwo.avaj.launcher;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Simulator {

    public static void main(String[] args) {

        long 
        if (args.length != 1) {
            System.out.println("Wrong number of argument");
            System.exit(0);
        }

        try {
            File file = new File(args[0]);
            Scanner sc = new Scanner(file);

            Long
            sc.nextline()
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
