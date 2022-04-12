package BCC;

import java.util.*;

public class BCC4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        HashMap<Character, Integer> letterMap = new HashMap<>();
        HashMap<Integer, Integer> numberMap = new HashMap<>();

        for(int i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            if(Character.isLetter(c)) {
                c = Character.toUpperCase(c);
                if(letterMap.containsKey(c)) {
                    letterMap.put(c, letterMap.get(c)+1);
                } else {
                    letterMap.put(c, 1);
                }
            } else if(Character.isDigit(c)){
                int number = (int) c - 48;
                if(numberMap.containsKey(number)) {
                    numberMap.put(number, numberMap.get(number)+1);
                } else {
                    numberMap.put(number, 1);
                }
            }
        }

        char charMax = 0;
        int max = 0;
        for(Map.Entry<Character, Integer> letter : letterMap.entrySet()){
            if(letter.getValue() > max){
                charMax = letter.getKey();
                max = letter.getValue();
            } else if(letter.getValue() == max){
                if(letter.getKey().compareTo(charMax) < 0){
                    charMax = letter.getKey();
                }
            }
        }
        System.out.printf("Huruf terbanyak : %s%n", charMax);

        if(numberMap.isEmpty()){
            System.out.println("Tidak ada angka");
        } else {
            int numMax = 0;
            int valMax = 0;
            for(Map.Entry<Integer, Integer> number : numberMap.entrySet()){
                if(number.getValue() > valMax){
                    numMax = number.getKey();
                    valMax = number.getValue();
                } else if(number.getValue() == valMax){
                    if(number.getKey().compareTo(numMax) < 0){
                        valMax = number.getKey();
                    }
                }
            }
            System.out.printf("Angka terbanyak : %d%n", numMax);
        }
    }
}