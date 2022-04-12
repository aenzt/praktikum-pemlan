package BCC;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class BCC3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahInput = input.nextInt();
        String[] arrayString = new String[jumlahInput];
        for (int i = 0; i < jumlahInput; i++) {
            String stringInput = input.next();
            arrayString[i] = stringInput;
        }
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

        for (int i = 0; i < arrayString.length; i++) {
            if (hashMap.containsKey(arrayString[i])) {
                hashMap.put(arrayString[i], hashMap.get(arrayString[i]) + 1);
            } else {
                hashMap.put(arrayString[i], 1);
            }
        }

        Set<Map.Entry<String, Integer> > set = hashMap.entrySet();
        String mostWord = "";
        int value = 0;

        for (Map.Entry<String, Integer> me : set) {
            if (me.getValue() > value) {
                value = me.getValue();
                mostWord = me.getKey();
            }
        }
        System.out.println(mostWord);
    }
}
