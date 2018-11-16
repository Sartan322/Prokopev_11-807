import java.util.ArrayList;
import java.util.Collections;

public class JacardTextAnalayzer {
    public double jacard(ArrayList a1, ArrayList a2) {
        ArrayList povt = new ArrayList();
        ArrayList unik = new ArrayList();
        for (int i = 0; i < a1.size() && i < a2.size(); i++) {
            if (Collections.frequency(a2, a1.get(i)) > 0 && Collections.frequency(povt, a1.get(i)) == 0) {
                povt.add(a1.get(i));
                unik.add(a1.get(i));
            }
        }
        for (int i = 0; i < a1.size(); i++) {
            if(Collections.frequency(unik,a1.get(i))==0){
                unik.add(a1.get(i));
            }
        }
        for (int i = 0; i < a2.size() ; i++) {
            if(Collections.frequency(unik,a2.get(i))==0){
                unik.add(a2.get(i));
            }
        }
        double result = (double)povt.size()/(double)unik.size();
        return result;
    }
}
