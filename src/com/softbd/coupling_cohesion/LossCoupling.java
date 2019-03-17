package com.softbd.coupling_cohesion;

class Test_Loose_couple {
    private String name;

    public String getName() {
        if (name != null) {
            return name;
        } else
            return "not initiaized";

    }

    public void setName(String name) {
        if (name == null) {
            System.out.println("You can't initialize name to a null");
        } else
            this.name = name;
    }
}

public class LossCoupling {

    public static void main(String... args) {
        Test_Loose_couple obj = new Test_Loose_couple();
        obj.setName(null);
        System.out.println(obj.getName());

    }
}


