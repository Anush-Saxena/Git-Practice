public class Prob_1812 {
    public boolean squareIsWhite(String coordinates) {
        char c1 = coordinates.charAt(0);
        char c2 = coordinates.charAt(1);
        boolean bool =true;
        if ((c1+c2)%2==0)
            bool = false;
        return bool;
    }
}
