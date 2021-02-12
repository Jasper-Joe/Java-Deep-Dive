public class Test {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
        B b = new B();
        C c = new C();
        D d = new D();

        System.out.println(a1.show(b)); // A and A
        System.out.println(a1.show(c)); // A and A
        System.out.println(a1.show(d)); // A and D

        /*
        a2.show(b) will not call B's show(B obj)
        because it's reference type is A,
        and in A's class, it does not contain show(B obj)
         */
        System.out.println(a2.show(b)); // B and A
        System.out.println(a2.show(c)); // B and A

        System.out.println(a2.show(d)); // A and D

        System.out.println(b.show(b)); // B and B
        System.out.println(b.show(c)); // B and B

        // 从reference的class往上找精准匹配， A has implementation of show(D obj)
        // 如果没有找到, 把input type 往上(parent) cast, 看是否能找到
        // 如果没有, compile error
        System.out.println(b.show(d)); // A and D

    }
}
