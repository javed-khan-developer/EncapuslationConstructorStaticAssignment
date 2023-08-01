public class Encapsulation {
    /*
     * 3.Use a private keyword for a variable and use setter and getter methods to
     * initialise and print the values.
     */
    private int age;
    private String name;

    public Encapsulation(int id, String name) {
        this.age = id;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Encapsulation person = new Encapsulation(12, "javed");
        System.out.println(person.age);
        System.out.println(person.name);
    }
}
