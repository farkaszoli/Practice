package egypercesek.random;


public class Random {
    int tomb[] = new int[20];
    int nemOszthatoTizzel[];

    public void feltolt() {
        for (int i = 0; i <= 19; i++) {
            tomb[i] = (int) (Math.random() * (100 - -100)) + -100;
        }
    }

    /**Hányszor ad két egymás melletti szám összege nullát?
    Válogasd ki egy másik tömbbe a 10-zel nem osztható számokat.
    Melyik a legnagyobb negatív szám a tömbben?
    Hányadik a legnagyobb páratlan szám a tömbben?
    Írd ki a legkisebb elem szomszédait.
     */
    public void szamokEgymasMellettNulla()
    {
        int db = 0;
        for (int i = 0; i < 20; i++)
        {
            if(tomb[i] + tomb[i+10] == 0)
            {
                db++;
            }

            if(tomb[i] % 10 != 0)
            {
                nemOszthatoTizzel[0] = tomb[i];
            }
        }

    }

}
