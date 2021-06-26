
@ interface TestAnnotation {
    String Developer() default "Jasper";
    String Expirydate();
}

public class CustomAnnotations {
    @TestAnnotation(Developer = "James", Expirydate = "23-06-2021")
    void fun1() {
        System.out.println("method 1");
    }

    @TestAnnotation(Developer = "Lee", Expirydate = "24-06-2021")
    void fun2() {
        System.out.println("method 2");
    }

    public static void main(String[] args) {
        CustomAnnotations obj = new CustomAnnotations();
        obj.fun1();
    }
}
