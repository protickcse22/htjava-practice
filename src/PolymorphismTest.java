class A1 {
    public void message(A1 obj) {
        System.out.println("A");
    }
}

class B1 extends A1 {
    public void message(B1 obj) {
        System.out.println("B");
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public float sum(float a, float b) {  // Not possible
        return a + b;
    }
}

public class PolymorphismTest {
    public static void main(String... args) {
        A1 obj = new B1(); //ob1 is declared of type A but it is pointing to object of its subclass, B
        obj.message(obj);  // Best on the type of reference variable passed to overloaded method (Print A)

        B1 obj1 = new B1(); //ob1 is declared of type B
        obj1.message(obj1);  // Best on the type of reference variable passed to overloaded method (Print A)

        B1 pars = new B1();
//        System.out.println("Int"+ ((B1) pars).sum(10.5,12.5));

    }
}
