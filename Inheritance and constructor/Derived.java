public class Derived extends Base{
    int y;
    Derived(int _x, int _y) {
        super(_x);
        y = _y;
    }

    void Display() {
        System.out.println("x = " + x + " y = " + y);
    }
}
