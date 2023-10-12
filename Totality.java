public class Totality {
    public int sum(int[] a, String stype) {
        int sum = 0;
        if (stype.equals("odd")) {
            for (int i = 1; i < a.length; i += 2) {
                sum += a[i];
            }
        }
        if (stype.equals("even")) {
            for (int i = 0; i < a.length; i += 2) {
                sum += a[i];
            }
        }
        if (stype.equals("all")) {
            for (int i = 0; i < a.length; i += 1) {
                sum += a[i];
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        
    }
}