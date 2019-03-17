
class Vegetable {
    public void message() {
        System.out.println("Eat vegetables");
    }

    public int sum(int a, int b) {
        return a + b;
    }
}

class Tomato extends Vegetable {
    public void message() {
        System.out.println("Eat Tomatoes");
    }

    public float sum(float a, float b) {
        return a + b;
    }
}

class Polymorphism {
    public static void main(String... ar) {
        Vegetable ob1 = new Tomato();
//        float ans = ((Tomato) ob1).sum(12.3,11.4);
//        System.out.println(ans);
    }
}