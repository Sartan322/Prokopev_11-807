import java.util.ArrayList;
import java.util.Collections;

public class CosAnalyzer {
    private double cos;
    public double cosAnalyzer(String t1, String t2) {
        Operations tta = new Operations();
        ArrayList a1 = tta.toArray(t1);
        ArrayList a2 = tta.toArray(t2);
        ArrayList unik = tta.unikList(a1, a2);
        int[] vector1 = tta.vector(a1, unik);
        int[] vector2 = tta.vector(a2, unik);
        double a = 0, b = 0, b1 = 0;
        for (int i = 0; i < unik.size(); i++) {
            int x1 = vector1[i];
            int x2 = vector2[i];
            a+=x1*x2;
            b+=x1*x1;
            b1+=x2*x2;
        }
        double result = (a/(Math.sqrt(b)*Math.sqrt(b1)));

        return result;
    }

}
