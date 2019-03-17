// IS-A relation mainly a class extends another concrete class, abstract class and implement an interface

// When a class A has a reference to the object of another class B, class A is said to be in a
// HAS-A relationship with class B

class Math {
    public int doAdd(int a, int b) {
        return (a + b);
    }

    public int doSubtract(int a, int b) {
        return (a - b);
    }
}

public class IsHasRelationShip {
    Math obj = new Math();

    public static void main(String... args) {
        IsHasRelationShip total = new IsHasRelationShip();
        int sum = total.obj.doAdd(10, 20);
        System.out.println(sum);
    }
}
