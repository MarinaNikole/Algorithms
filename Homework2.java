public class Homework2 {
    public static void main(String[] args) {

        System.out.println(Hanoi(4, "A", "C", "B"));
    }

    public static String Hanoi(int n, String A, String C, String B) {
        if (n == 1) return A + C + " ";
        return Hanoi(n - 1, A, B, C) + A + C + " " + Hanoi(n - 1, B, C, A);

    }
}
