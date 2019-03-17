package com.softbd.coupling_cohesion;

class Test_Tightly_couple {
    public String name;

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

public class Tightlycoupling {

    public static void main(String... args) {
        Test_Tightly_couple obj = new Test_Tightly_couple();
        obj.name = null;
        System.out.println("Name is " + obj.name);
    }


}
