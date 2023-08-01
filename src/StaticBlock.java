public class StaticBlock {
    /*
     * 5.Write a program which has static block and constructor overloading,
     * initialise variables using constructors and print it.
     */
    public int id;
    public String name;

    StaticBlock() {
        System.out.println("no args constructor");

    }

    StaticBlock(int id) {
        System.out.println("paramaterized constructor with id");
        this.id = id;       
    }

    StaticBlock(String name) {
        System.out.println("paramaterized constructor with name");
        this.name = name;

    }

    StaticBlock(int id, String name) {
        System.out.println("paramaterized constructor with age and name");
        this.id = id;
        this.name = name;

    }

    static {
        System.out.println("static bloc ");
    }

    public static void main(String[] args) {
        StaticBlock sBlock = new StaticBlock();
        StaticBlock sBlock2 = new StaticBlock(23);
        System.out.println(sBlock2.id);
        StaticBlock sBlock3 = new StaticBlock("javed");
        System.out.println(sBlock3.name);
        StaticBlock sBlock4 = new StaticBlock(30, "rahul");
        System.out.println(sBlock4.id + " " + sBlock4.name);
    }
}
