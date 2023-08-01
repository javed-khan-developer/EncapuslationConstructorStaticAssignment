public class InstanceCounter {
    /*
     * 1.Create a class that keeps track of the number of instances created.
     * Implement a static variable and method to accomplish this.
     */
    private static int noOfInstance;

    public InstanceCounter() {
        noOfInstance++;
    }

    public int getNoOfInstance() {
        return noOfInstance;
    }

    public static void main(String[] args) throws Exception {
        InstanceCounter iCounter = new InstanceCounter();
        InstanceCounter iCounter2 = new InstanceCounter();
        System.out.println("No of instance created : " + InstanceCounter.noOfInstance);
    }
}
