public class Question2 {
    public static void main(String[] args) {
        int a=6;
        int b=28;
        int sumA=0;
        int sumB=0;
        for (int i=1;i<a;i++) {
            if (a%i==0) {
                sumA += i;}
        }
        for (int i = 1; i < b; i++) {
            if (b%i==0){
                sumB+=i;
            }
        }

        if (sumA == a) {
            System.out.println(a + " is a perfect number");
        }

        if (sumB == b) {
            System.out.println(b + " is a perfect number");
        }
    }
}
