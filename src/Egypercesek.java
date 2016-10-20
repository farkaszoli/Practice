import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Egypercesek {
    /**
     * Alakíts át egy mondatot úgy, hogy minden szó kezdőbetűjét alakítsd nagybetűssé.
     * <p/>
     * String s = "ez egy mondat lenne, melynek minden szavat nagy "
     * "kezdobetusse kellene alakitani.";
     */

    public void firstCharIsCapital() {
        String text = "ez egy mondat lenne, melynek minden szavat nagy kezdobetusse kellene alakitani.";
        String[] parts = text.split(" ");
        String newString;

        for (String word : parts) {
            newString = Character.toUpperCase(word.charAt(0)) + word.substring(1);
            System.out.print(newString + " ");
        }
    }
}