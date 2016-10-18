import java.util.Scanner;

public class Practice {

    public String inputName() {
        String input;
        Scanner inputReader = new Scanner(System.in);
        System.out.println("please write your name: " );
        input = inputReader.nextLine();
        System.out.println("Your name:" + input);
        return input;
    }
    /**
     * Kérd be a nevedet (csak egy keresztnévvel) és tárold el.
     Írd ki csupa nagybetűvel!
     Írd ki betűnként egymás alá!
     Írd ki, található-e benne ’a’ betű!
     Írd ki csak a vezetékneved!
     Írd ki csak a keresztneved!
     Írd ki a képernyőre úgy, hogy a vezeték és keresztneved külön sorban legyen!
     Írd ki, hány karakterből áll a vezetékneved!
     Írd ki, hány karakterből áll a keresztneved!
     */

    public void nameTask(String name)
    {
        System.out.println(name.toUpperCase());

        for(int i = 0; i< name.length(); i++) {
            System.out.println(name.charAt(i));

            if (name.charAt(i) == 'a') {
                System.out.print("contains");
            }
        }
        
        String[] lastName = name.split(" ");
        System.out.print(lastName[0]);
        System.out.print(lastName[1]);

        System.out.print(lastName[0] + "\n" + lastName[1]);
        
        System.out.println(lastName[0].length());
        
        System.out.println(lastName[1].length());
    }
    /**
     *  Adott a következő String: “Indul a gorog aludni”
        Írd ki fordítva!
        Írd ki szavanként külön sorba!
    */
    public void task()
    {
        String taskWord = "Indul a gorog aludni";

        for(int i = taskWord.length()-1; i >= 0; i--)
        {
            System.out.print(taskWord.charAt(i));
        }

        System.out.print("\n");

        String[] words = taskWord.split(" ");
        for (String word : words)
        {
            System.out.print(word + "\n");
        }

    }
}


