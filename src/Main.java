public class Main {
    public static void main(String[] args) {
        boolean boolean1 = !(!(!(false ^ false) || (true && true)));
        System.out.println(boolean1);

        int x = 3;
        int y = 2;
        boolean boolean2 = !((x * y) <= 6) && (x - y != 1);
        System.out.println(boolean2);
    }
}
/*[A]: !(!(!(false ^ false) || (true && true))) true
[B]: considering that x=3 and y=2: !((x * y) <= 6) && (x - y != 1)  false*/