import java.util.ArrayList;

public class Question6 {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60};
        int k = 3;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = k; i < arr.length; i++) {
            list.add(arr[i]);
        }
        for (int i = 0; i < k; i++) {
            list.add(arr[i]);
        }
        System.out.println(list);
    }
}