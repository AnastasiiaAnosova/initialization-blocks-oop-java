public class Main {
    public static void main(String[] args) {
        System.out.println("Main method started");
        System.out.println("====================");
        System.out.println("First object created: obj1");
        StaticDemoChild obj1 = new StaticDemoChild("Object 1");
        obj1.display();
        System.out.println("\nSecond object created: obj2");
        StaticDemoChild obj2 = new StaticDemoChild("Object 2");
        obj2.display();
        System.out.println("End of main method");
        System.out.println("====================");
    }
}
