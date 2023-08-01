public class ConstructorWithParam {
    /*
     * 2.Write a program and create a constructor with parameters and initialise the
     * variable using a constructor.
     */
    int a;

    ConstructorWithParam(int a) {
        this.a = a;
    }
    

    public static void main(String[] args) {
        ConstructorWithParam cpParam = new ConstructorWithParam(20);
        System.out.println(cpParam.a);
    }
}
