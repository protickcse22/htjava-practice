class VaraggTest {
    public void meth(int... a) {
//        System.out.println("Methd id called");
        if (a.length == 0) {
            System.out.println("number of parameters passed : " + a.length);
        }
        if (a.length > 0) {
            System.out.println("number of parameters passed : " + a.length);
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);
            }
        }
    }
}

public class VararguPractice {
    public static void main(String... args) {

        VaraggTest obj = new VaraggTest();
        obj.meth(); // call method with zero argument
        obj.meth(1);  // call method with one argument
        obj.meth(1, 2, 3);  //call method with multiple argument
        obj.meth(1, 2, 3, 4,7);  //call method with multiple argument
        System.out.println(args[0]);
//        obj.meth(2);
//        obj.meth(3);
//        obj.meth(5);

    }
}
