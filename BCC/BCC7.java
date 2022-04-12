package BCC;

import java.util.*;

public class BCC7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahInput = input.nextInt();
        String[] winnerList = new String[jumlahInput];
        for (int i = 0; i < jumlahInput; i++) {
            String stringInput = input.next();
            winnerList[i] = stringInput;
        }
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < jumlahInput; i++) {
            if(map.containsKey(winnerList[i])){
                map.put(winnerList[i], map.get(winnerList[i] + 1));
            }
            else{
                map.put(winnerList[i], 1);
            }
        }
        Set<Map.Entry<String, Integer> > set = map.entrySet();
        String key = "";
        int value = 0;

        for (Map.Entry<String, Integer> me : set) {
            // Check for word having highest frequency
            if (me.getValue() > value) {
                value = me.getValue();
                key = me.getKey();
            }
        }
        System.out.println(key);
    }
}
