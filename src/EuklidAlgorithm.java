public class EuklidAlgorithm {

    //recursive version of Euklid algorithm
    public int calculateGCD(int a, int b) {
        if(b == 0) return a;
        else return calculateGCD(b, a % b);
    }

    //non-recursive version of Euklid algorithm
    public int calculateGCD2(int a, int b) {
        while (a != b) {
            if(a > b) a -= b;
            if(b > a) b -= a;
        }
        return a;
    }
}
