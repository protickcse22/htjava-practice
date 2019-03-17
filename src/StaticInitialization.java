class B_block {
    static {
        System.out.println("B is callrd");
    }
}

public class StaticInitialization extends B_block {
    static {
        System.out.println("A is callrd");
    }
    public static void main(String... args) {

    }
}


