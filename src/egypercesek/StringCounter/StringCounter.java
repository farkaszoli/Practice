package egypercesek.stringCounter;

public class StringCounter
{
    private static final String STRING = "KKNDDKDKKNKDEDNNENNNNNEKNEEEDKNK"+
            "EEEDKDDNDKDEKEDKNKKDEENKEKKDKEND"+
            "KNNDDDKNDNDDDNEKNEDENDEEDKDDDNDN"+
            "NEDEKNENNEEKDEKKDKKEEEDKDNNKKDNN"+
            "NEDEKKNEEENKKKDEKDKKKN";

    private static final String SEARCH_STRING = "KKN";
    private int result = 0;

    public void counter()
    {
        int searchStringLength = SEARCH_STRING.length();

        for(int i = 0; i <= STRING.length() - searchStringLength; i ++)
        {
            if(SEARCH_STRING.equals(STRING.substring(i, searchStringLength + i)) == true)
            {
                result++;
            }
        }

        System.out.println("result: " + result);
    }
}

