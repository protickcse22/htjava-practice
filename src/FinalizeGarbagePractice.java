public class FinalizeGarbagePractice {
    public void finalize() {
        System.out.println("Object is garbage collected");
    }

    public static void main(String... args) {

        Runtime run = Runtime.getRuntime();
        FinalizeGarbagePractice obj;
        for (int i = 0; i < 10; i++) {

            obj = new FinalizeGarbagePractice();
        }
        run.gc();  //Making a request to garbage collector to de-allocate unreferenced objects.
    }
}
