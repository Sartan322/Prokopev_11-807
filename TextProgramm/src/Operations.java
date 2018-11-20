import java.util.ArrayList;
import java.util.Collections;

public class Operations {

    public ArrayList toArray(String t1) {
        ArrayList t1List = new ArrayList();
        char[] arrT1 = t1.toCharArray();
        String word = "";
        for (int i = 0; i < arrT1.length; i++) {
            if ((int) arrT1[i] >= 65 && (int) arrT1[i] <= 90) {
                arrT1[i] = (char) ((int) arrT1[i] + 32);
            } else if ((int) arrT1[i] >= 33 && (int) arrT1[i] <= 46) {
                arrT1[i] = ' ';
            }
        }
        int k = 0;
        for (int i = k; i < arrT1.length; i++) {
            for (int j = k; j < arrT1.length && arrT1[j] != ' '; j++) {
                word += arrT1[j];
                k++;
            }
            k++;
            i = k;
            t1List.add(word);
            word = "";
        }
        for (int i = 0; i < t1List.size(); i++) {
            t1List.remove("");
        }
        return t1List;
    }

    public ArrayList unikList(ArrayList a1, ArrayList a2) {
        ArrayList unik = new ArrayList();
        for (int i = 0; i < a1.size(); i++) {
            if (!unik.contains(a1.get(i))) {
                unik.add(a1.get(i));
            }
        }
        for (int i = 0; i < a2.size(); i++) {
            if (!unik.contains(a2.get(i))) {
                unik.add(a2.get(i));
            }
        }
        return unik;
    }

    public ArrayList povtList(ArrayList a1, ArrayList a2) {
        ArrayList povt = new ArrayList();
        for (int i = 0; i < a2.size(); i++) {
            if (a1.contains(a2.get(i))) {
                povt.add(a2.get(i));
            }
        }
        return povt;
    }
    public int[] vector(ArrayList a, ArrayList unik){
        int[] reVector = new int[unik.size()];
        for (int i = 0; i < unik.size() ; i++) {
            reVector[i] = Collections.frequency(a,unik.get(i));
        }
        return reVector;
    }
}
