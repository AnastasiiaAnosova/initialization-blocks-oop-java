public class StaticDemo {
    private static String n;

    static {
        System.out.println("1. Start of the ancestor's static initialization block\n and actually start of static constructor");
        System.out.println(" Static variable value before: " + n);
        n = "Hello";
        System.out.println(" and after definition: " + n);
        System.out.println("2. End of the ancestor's static initialization block\n "
                + " and actually end of static constructor.");
    }

    public StaticDemo() {
        System.out.println("2. Ancestor constructor");
    }

    {
        System.out.println("1. Ancestor instance initialization block");
    }

}
