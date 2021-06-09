public class Test {
    static int i;
    int j;

    /**
     * The code inside static block is executed only once
     * The first time the class is loaded into memory
     */
    static {
        i = 10;
        System.out.println("static block called");
    }
    Test() {
        System.out.println("Constructor called");
    }
}


