public class Main {
    public static void main(String[] args) {
        Integer[] iarr = {1,2,3,4};
        Character[] carr = {'a','j','c','d'};
        print(iarr);
        System.out.println();
        print(carr);


    }

    public static <T> void print(T[] arr) {
        for(T ele : arr) {
            System.out.println(ele);
        }
    }
}
