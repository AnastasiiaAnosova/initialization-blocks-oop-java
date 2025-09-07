public class StaticDemoChild extends StaticDemo {
    private static int a;
    static {
        System.out.println("3. Start of child's static initialization block 1\n and actually starting static constructor of child");

        /* If you try to reference the not-yet-declared variable 'b',
       the compiler will detect this as an error*/
        System.out.println("    Value of static variable 'a' before setting: a = " + a  );
        // +" b=" + b
        a = 1;
        /* However, assigning to variable 'b' here will not cause an error,
       even though it is declared below */
        b = 2;
        System.out.println("    After setting: a = " + a);
        // + " b=" + b
        System.out.println("4. End of child's static initialization block 1");
    }
    private static int b;
    static {
        System.out.println("5. Start of child's static initialization block 2 ");
        System.out.println("   Value of static variables before setting: a = " + a + " b = " + b);
        b = 3;
        System.out.println("   Value of static variables after setting: a = " + a + " b =" + b);
        System.out.println("6. End of child's static initialization block 2");
        System.out.println("   this effectively ends the child's static constructor.");
    }
    private String name;
    {
        System.out.println("3. Start of child's instance initialization block");
        name = "aaa";
        System.out.println("   name = " + name);
        System.out.println("4. End of child's instance initialization block");
    }

    /**
     * The child constructor is executed last.
     * First, the ancestor's instance initialization blocks are executed in order,
     * followed by the ancestor's constructors. Then all the child's instance initialization blocks
     * are executed, and finally the child constructor runs.
     *
     * Although the constructor calls start from the child and go up to the ancestors,
     * the actual execution occurs in the opposite order. This happens because each constructor
     * explicitly calls its ancestor's constructor at the beginning.
     *
     * Each call to an ancestor constructor stores the return address on the stack. When the
     * ancestor constructor finishes, control returns to the next statements of the child constructor
     * according to the stack. This process repeats recursively, depending on the depth of the inheritance tree.
     * @param name
     */
    public StaticDemoChild(String name) {
        System.out.println("5. Child instance constructor");
        this.name = name;
    }

    {
        System.out.println("Start of child's second instance initialization block");
        System.out.println("a = " + a + ", b = " + b + "\nEnd of child's second instance initialization block");
    }

    void display() {
        System.out.println("Descendant method " + name);
    }
}