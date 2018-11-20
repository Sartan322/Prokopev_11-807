import java.util.ArrayList;
import java.util.Collections;

public class JacardTextAnalayzer {
    public double jacard(String t1, String t2) {
        Operations tta = new Operations();
        ArrayList a1 = tta.toArray(t1);
        ArrayList a2 = tta.toArray(t2);
        ArrayList povt = tta.povtList(a1, a2);
        ArrayList unik = tta.unikList(a1, a2);
        double result = (double) povt.size() / (double) unik.size();
        return result;
    }
}
