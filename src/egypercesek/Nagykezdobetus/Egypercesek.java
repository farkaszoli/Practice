package egypercesek.nagykezdobetus;

public class Egypercesek
{
    /**
     * Alakíts át egy mondatot úgy, hogy minden szó kezdőbetűjét alakítsd nagybetűssé.
     */
    private static final String TEXT = "ez egy mondat lenne, melynek minden szavat nagy kezdobetusse kellene alakitani.";

    public void firstCharIsCapital()
    {
        String[] parts = TEXT.split(" ");
        String newString;

        for (String word : parts)
        {
            newString = Character.toUpperCase(word.charAt(0)) + word.substring(1);
            System.out.print(newString + " ");
        }
    }
}