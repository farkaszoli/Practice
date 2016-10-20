public class Main {

    public static void main(String[] args)
    {
//        Egyszeru feladatok:
        Practice practice = new Practice();
        String name = practice.inputName();
        practice.nameTask(name);
        practice.task();

//        Egypercesek:
        Egypercesek egypercesek = new Egypercesek();
        egypercesek.firstCharIsCapital();

//        vizslák törlése

        KutyasFeladat kutyasFeladat = new KutyasFeladat();
        kutyasFeladat.test();

        // http://www.webotlet.hu/?p=1292
        StringCounter hanyszor = new StringCounter();
        hanyszor.counter();
    }
}
