package quests;

import java.util.Scanner;

public class Forslfs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = sc.nextInt();
        
        for(int i = 1 ; i <= result ; i++ ){
            System.out.printf("Math.pow(%d, %d) => %f\n" , 2, i, Math.pow(2, i));
                        
        }

    }
}