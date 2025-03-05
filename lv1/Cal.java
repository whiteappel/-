package lv1;

import java.util.Scanner;//scanner호출

public class Cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("첫번째 숫자를 입력하시오: ");
            int first = sc.nextInt();
            System.out.println("두번째 숫자를 입력하시오: ");
            int second = sc.nextInt();
            System.out.println("사칙연산 입력 (+, -, *, /): ");
            char operator = sc.next().charAt(0);
            int sum = 0;

            boolean valid = true;

            if (operator == '+') {
                sum = first + second;
            } else if (operator == '-') {
                sum = first - second;
            } else if (operator == '/') {
                if (second == 0) {
                    System.out.println("계산이 불가능합니다 다시 입력해주십시요.");
                    valid = false;
                } else {
                    sum = first / second;
                }
            } else if (operator == '*') {
                sum = first * second;
            }
            if(valid == true) {
                System.out.println("결과: " + sum);
            }
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료,exit외 값 입력시 반복)");
            String input = sc.next();
            if (input.equals("exit")) {
                System.out.println("계산기를 종료합니다.");
                break;
            }

        }
        //whlie끝남
        sc.close();
    }
}