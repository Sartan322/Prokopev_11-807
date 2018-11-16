import java.util.ArrayList;

public class TextToArray {

    public ArrayList toArray(String t1) {
        ArrayList t1List = new ArrayList();
        char[] arrT1 = t1.toCharArray();
        String word = "";
        for (int i = 0; i < arrT1.length; i++) {
            if ((int)arrT1[i]>=65 && (int)arrT1[i]<=90){
                arrT1[i]=(char)((int)arrT1[i]+32);
            }
            else if ((int)arrT1[i]>=33 && (int)arrT1[i]<=46){
                arrT1[i]=' ';
            }
        }
        int k = 0;
        for (int i = k; i < arrT1.length ; i++) {
            for (int j = k; j <arrT1.length && arrT1[j]!=' '; j++) {
                word+=arrT1[j];
                k++;
            }
            k++;
            i=k;
            t1List.add(word);
            word="";
        }
        for (int i = 0; i < t1List.size(); i++) {
            t1List.remove("");
        }
        return t1List;
    }
}
