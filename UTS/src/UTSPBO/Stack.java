package UTSPBO;

import java.util.Scanner;

public class Stack {
    public static void main(String[] args) {
        java.util.Stack<Character> leftChar =  new java.util.Stack<Character>();
        java.util.Stack<Character> rightChar =  new java.util.Stack<Character>();
        boolean isValid = true;
        boolean isInRight = false;
        boolean isFoundEqual = false;
        boolean isNotValidCharacter = false;
        boolean isNotValidEqual = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan persamaan = ");
        String equation = scanner.nextLine();
        char[] equationCharArray = equation.toCharArray();
        for (int i = 0; i < equationCharArray.length; i++) {
            char ch = equationCharArray[i];
            if(ch == ' '){
                continue;
            }
            if(ch != '1' && ch != '+' && ch != '=') {
                isNotValidCharacter = true;
                break;
            }
            if(ch == '=' ) {
                if(isFoundEqual) {
                    isNotValidEqual = true;
                    break;
                }
                isInRight = true;
                continue;
            }
            if(ch == '+') {
                continue;
            }
            if(!isInRight) {
                leftChar.add(ch);
            }
            if(isInRight) {
                rightChar.add(ch);
                if(leftChar.size() == 0) {
                    isValid = false;
                } else if(leftChar.size() > 1 && i == (equationCharArray.length - 1)) {
                    isValid = false;
                } else {
                    leftChar.pop();
                }
            }
        }
        if(isNotValidCharacter) {
            System.out.println("Tidak valid karena karakter yang dijinkan hanya 1, +, dan =");
        }
        else if (isNotValidEqual) {
            System.out.println("Tidak valid karena hanya satu tanda sama dengan yang diijinkan");
        }
        else if(isValid) {
            System.out.println("valid");
        } else {
            System.out.println("tidak valid");
        }
    }
}