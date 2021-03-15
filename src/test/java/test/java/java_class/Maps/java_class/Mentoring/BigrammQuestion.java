package test.java.java_class.Mentoring;
import java.util.Map;
import java.util.LinkedHashMap;
public class BigrammQuestion {
    public static void main(String[] args) {
        String str= "I like coding a lot" +
                " and like studying a lot".toLowerCase();
        Map<String, Integer> getBigrammSen= new LinkedHashMap();
        String [] arrStr = str.split("");
        for (int i = 0; i < arrStr.length-1; i++) {
            if(getBigrammSen.containsKey(arrStr[i]+" "+arrStr[i+1])){
                int num =getBigrammSen.get(arrStr[i]+" "+arrStr[i+1]);
                getBigrammSen.put(arrStr[i].toLowerCase()+" "+arrStr[i+1], ++num);
            }else
                getBigrammSen.put(arrStr[i].toLowerCase()+" "+arrStr[i+1],1);
        }
        System.out.println(getBigrammSen);
    }
}
