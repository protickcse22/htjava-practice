
// Indirect access an instance variable from a static method,
// by passing instance variable as an argument to a static method

class A {
    int a = 10;

    public static void display(int x) {
        System.out.println(x);
    }

    public void display2() {
        display(a);
    }
}

class Test {
    public static int id = 20;
    public int roll;
    public static int x = 100;

    Test(int id, int roll) {
        this.id = id;
        this.roll = roll;
    }

   /* public static void displayStatic() {
        System.out.println(x);
    }*/

    public void displayStatic() {
        System.out.println(x);
    }

    public void displayAll() {
        System.out.println(this.id + " and " + this.roll);
    }

}

public class StaticPractice {

    static int a = 10;

    static void display() {
        System.out.println('A');
    }

    public static void main(String... args) {
        System.out.println(a);
        System.out.println(StaticPractice.a);
        display();
        StaticPractice.display();

        Test t = new Test(12, 22);
        System.out.println(Test.id);  // 12 not 20
//        System.out.println(t.id);
        t.displayAll();  // 12 and 22
        t.displayStatic();  // 100

        B obj1 = new B();
        B obj2 = new B();
        obj1.setValue(20);
        obj2.setValue(30);
        System.out.println(obj1.getValue());
        System.out.println(obj2.getValue());

        obj1.seti(20);
        obj2.seti(30);
        System.out.println(obj1.geti());
        System.out.println(obj2.geti());


    }

}

// Share same value of a static variable
class B {
    static int value = 10;
    public int i = 10;

    public void setValue(int v) {
        value = v;
    }

    public int getValue() {
        return value;
    }

    public void seti(int v) {
        this.i = v;
    }

    public int geti() {
        return this.i;
    }


}
