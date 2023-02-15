public class Tugas2_1 {
    public static void main(String[] args) {
        System.out.println("1. " + Perkalian.kali(1, 9));
        System.out.println("2. a(1) * b(9) = " + Perkalian.kali(1, 9));
        System.out.println("3. " + Perkalian.kali(3, 3, 2));
        System.out.println("4. " + Perkalian.kali(2.5, 7.0));
    }
}

class Perkalian {
    static int kali(int a, int b) {
        return a * b;
    }

    static double kali(double a, double b) {
        return a * b;
    }

    static int kali(int a, int b, int c) {
        return a * b * c;
    }
}
