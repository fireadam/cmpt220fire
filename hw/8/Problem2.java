import java.util.Scanner;
import java.util.ArrayList;

public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of objects: ");
        int numObjects = input.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter the weights of the objects: ");
        //make input array
        for (int i = 0; i < numObjects; i++) {
            list.add(input.nextInt());
        }
        int c = 1;
        while(!list.isEmpty()) {
            System.out.println("Container " + c + " contains objects with weight " + container(list, 10));
            c++;
        }
    }

    // You had to insert from largest to smallest
    static String container(ArrayList<Integer> arr, int m) {
        String end = "";
        int t;
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i) <= m) {
                t = arr.get(i);
                end = end + t + " ";
                arr.remove(i);
                return end + container(arr, m - t);
            }
        }
        return end;
    }

}