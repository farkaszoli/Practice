public class StringCounter
{
    private String fromString = "KKNDDKDKKNKDEDNNENNNNNEKNEEEDKNK"+
            "EEEDKDDNDKDEKEDKNKKDEENKEKKDKEND"+
            "KNNDDDKNDNDDDNEKNEDENDEEDKDDDNDN"+
            "NEDEKNENNEEKDEKKDKKEEEDKDNNKKDNN"+
            "NEDEKKNEEENKKKDEKDKKKN";

    private String searchString = "KKN";
    private int result = 0;

    public void counter()
    {
        int searchStringLength = searchString.length();
        int fromStringLength = fromString.length();

        for(int i = 0; i <= fromStringLength - searchStringLength; i ++)
        {
            if(searchString.equals(fromString.substring(i, searchStringLength + i)) == true)
            {
                result++;
            }
        }
        System.out.print("result: " + result);
    }
}

