import java.util.ArrayList;
public class Prob_2413 {
    public int smallestEvenMultiple(int n) {
        ArrayList<Integer> numb1 = new ArrayList<>();
        ArrayList<Integer> numb2 = new ArrayList<>();
        System.out.println(numb1);
        return n%2==0 ? n : 2*n;
    }
}
