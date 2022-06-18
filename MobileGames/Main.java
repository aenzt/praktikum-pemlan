package MobileGames;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=".repeat(40));
        System.out.println("Selamat datang di game Defend FILKOM !");
        System.out.print("Silahkan masukkan nama player : ");
        String nama = input.nextLine();
        System.out.println("Silahkan pilih karakter yang anda inginkan : ");
        System.out.println("1. Magician\n2. Healer\n3. Warrior");
        System.out.print("Pilihan : ");
        int choice = 0;
        try {
            choice = input.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Tolong masukkan angka!");
            input.nextLine();
            choice = input.nextInt();
        }
        input.nextLine();

        if (choice != 1 && choice != 2 && choice != 3){
            System.out.println("Masukkan pilihan yang sesuai");
            try {
                choice = input.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Tolong masukkan angka!");
                input.nextLine();
                choice = input.nextInt();
            }
            input.nextLine();
        }

        ArrayList<Character> characters = new ArrayList<>();

        if (choice == 1) {
            characters.add(new Magician());
        } else if(choice == 2){
            characters.add(new Healer());
        } else if(choice == 3){
            characters.add(new Warrior());
        }

        characters.add(new Titan());

        System.out.println("Selamat datang, " + nama + " !");
        Class<? extends Character> role = characters.get(0).getClass();
        System.out.printf("%-30s: %s%n", "Role", role.getSimpleName());

        int n = 1;
        do {
            System.out.println("=============== TURN " + n + " ===============");
            if(characters.get(0).attack()) {
                characters.get(1).receiveDamage(characters.get(0).getAttack());
            }
            n++;
            System.out.printf("%-30s: %d%n", "Enemy's HP", characters.get(1).getHP());
            System.out.printf("%-30s: %d%n", nama + "'s HP", characters.get(0).getHP());
            if (characters.get(1).getHP() == 0)
                break;

            System.out.println("=============== TURN " + n + " ===============");
            if(characters.get(0) instanceof Healer) {
                System.out.println("Hero healed!");
                ((Healer) characters.get(0)).heal();
            }

            if(characters.get(1).attack()) {
                characters.get(0).receiveDamage(characters.get(1).getAttack());
            }
            System.out.printf("%-30s: %d%n", "Enemy's HP", characters.get(1).getHP());
            System.out.printf("%-30s: %d%n", nama + "'s HP", characters.get(0).getHP());
            n++;
        }
        while (characters.get(0).getHP() != 0 && characters.get(1).getHP() != 0);
        System.out.println("=".repeat(40));
        if (characters.get(0).getHP() == 0)
            System.out.println(nama + " Kalah");
        else
            System.out.println(nama + " Menang");

        System.out.println("================ PLAYER ================");
        info(characters.get(0));
        System.out.println("================ MUSUH ================");
        info(characters.get(1));
    }

    static void info(Character hero){
        Class<? extends Character> role = hero.getClass();
        System.out.printf("%-30s: %s%n", "Role", role.getSimpleName());
        hero.info();
    }
}
