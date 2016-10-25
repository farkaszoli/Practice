package egypercesek.egyszerubbFeladatok;

import java.util.Scanner;

public class Nevek
{
    //  Kérd be a nevedet (csak egy keresztnévvel) és tárold el.
    public String inputName() {
        String inputName;

        Scanner inputReader = new Scanner(System.in);

        System.out.println("please write your name: " );

        inputName = inputReader.nextLine();

        System.out.println("Your name:" + inputName);

        return inputName;
    }

    // Írd ki csupa nagybetűvel!
    public void upperCaseName(String name) {
        System.out.println("nagybetuvel a nev: " + name.toUpperCase());
    }

    // Írd ki betűnként egymás alá!
    public void egymasAlatt(String name)
    {
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
    }

    // Írd ki, található-e benne ’a’ betű!
    public void containsA(String name)
    {
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'a') {
                System.out.println("tartalmaz 'a' betut a nev");
                break;
            }

        }
    }

    //    Írd ki csak a vezetékneved!
    public void vezeteknev(String inputName)
    {
        String[] name = inputName.split(" ");
        System.out.println("vezeteknev: " + name[0]);
    }

    //    Írd ki csak a keresztneved!
    public void keresztnev(String inputName)
    {
        String[] name = inputName.split(" ");
        System.out.println("keresztnev: " + name[1]);
    }

    // Írd ki a képernyőre úgy, hogy a vezeték és keresztneved külön sorban legyen!
    public void kulonsorban(String inputName)
    {
        String[] name = inputName.split(" ");
        System.out.println(name[0]);
        System.out.println(name[1]);
    }

    //    Írd ki, hány karakterből áll a vezetékneved!
    //    Írd ki, hány karakterből áll a keresztneved!
    public void nevhossza(String inputName)
    {
        String[] name = inputName.split(" ");
        System.out.println("vezeteknev hossza: " + name[0].length());
        System.out.println("keresztnev hossza: " + name[1].length());
    }
}


