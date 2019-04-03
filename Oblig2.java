import java.util.*;
import java.io.*;

class Oblig2 {
  public static void main(String[] args) {
    ArrayList<Bil> biler = new ArrayList<Bil>();
    String filen = args[0];
    String type = "Alle";

    if (args.length == 2) {
      type = args[1];
    }

    /*
    Leser filen og deler opp linjene inn i forskjellige ord.
    Oppretter objekter av riktig type og legger objektet inn i ArrayList.
    */

    try {
      Scanner fil = new Scanner(new File(filen));
      String linje;

      while (fil.hasNextLine()) {
        linje = fil.nextLine();
        String[] ordene = linje.split(" ");

        for (int i = 0; i < ordene.length; i++) {
          if (ordene[i].equals("EL")) {
            String regnr = ordene[i + 1];
            double kapasitet = Double.parseDouble(ordene[i + 2]);

            Elbil elbil = new Elbil(regnr, kapasitet);
            biler.add(elbil);
          }

          if (ordene[i].equals("LASTEBIL")) {
            String regnr = ordene[i + 1];
            double utslipp = Double.parseDouble(ordene[i + 2]);
            double nyttevekt = Double.parseDouble(ordene[i + 3]);

            Lastebil lastebil = new Lastebil(regnr, utslipp, nyttevekt);
            biler.add(lastebil);
          }

          if (ordene[i].equals("PERSONBIL")) {
            String regnr = ordene[i + 1];
            double utslipp = Double.parseDouble(ordene[i + 2]);
            int antallSeter = Integer.parseInt(ordene[i + 3]);

            Personbil personbil = new Personbil(regnr, utslipp, antallSeter);
            biler.add(personbil);
          }
        }
      }
    }

    catch(FileNotFoundException ex) {
      System.out.println("Finner ikke filen '" + filen + "'.");
    }

    catch(IOException ex) {
      System.out.println("Error. Klarte ikke lese filen '" + filen + "'.");
    }

    if (type.equals("Alle")) {
      for (Bil b : biler) {
        b.printInfo();
        System.out.println();
      }
    }

    if (type.equals("EL")) {
      for (Bil b : biler) {
        if (b instanceof Elbil) {
          b.printInfo();
          System.out.println();
        }
      }
    }

    if (type.equals("FOSSIL")) {
      for (Bil b : biler) {
        if (b instanceof Fossilbil) {
          b.printInfo();
          System.out.println();
        }
      }
    }
  }
}
