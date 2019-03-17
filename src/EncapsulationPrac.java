class Person {
    private int id;
    private int weight;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id < 1) {
            System.out.println("Please insert id greater than 0");
        } else {

            this.id = id;
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight < 0)
            System.out.println("Please insert proper weight");
        else
            this.weight = weight;
    }
}


public class EncapsulationPrac {

    public static void main(String... args) {
        Person man = new Person();
        man.setId(0);
        man.setWeight(10);
        if (man.getId() != 0)
            System.out.println("ID= " + man.getId());
        if (man.getWeight() != 0)
            System.out.println("Weight " + man.getWeight());
    }


}
