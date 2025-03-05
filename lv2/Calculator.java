package lv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cal cal = new Cal();

        while (true) {
            System.out.println("첫번째 숫자를 입력하시오: ");
            int first = sc.nextInt();
            System.out.println("두번째 숫자를 입력하시오: ");
            int second = sc.nextInt();
            System.out.println("사칙연산 입력 (+, -, *, /): ");
            char operator = sc.next().charAt(0);

            int sum = cal.calculate(first, second, operator);// 추가된 코드 불러옴

            System.out.println("결과: " + sum);

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
public static class Cal {

    // 컬렉션 sums임 sum이랑 착각 ㄴㄴ
    private List<Integer> sums = new ArrayList<>();

    //첫번쨰숫자,두번째 숫자, operator는 연산자라는뜻
    public int calculate(int first, int second, char operator) {

        int sum;

        switch (operator) {
            case '+':
                sum = first + second;
                break;
            case '-':
                sum = first - second;
                break;
            case '*':
                sum = first * second;
                break;
            case '/':
                if (second == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    return 0;
                }
                sum = first / second;
                break;
            default:
                System.out.println("잘못된 연산자입니다.");
                return 0;
        }
        //스위치 끝남

        //  저장
        sums.add(sum);
        return sum;
    }

    // Getter
    public List<Integer> getSums() {
        return sums;
    }

    // 연산 결과를 삭제
    public void removeSum() {
        if (!sums.isEmpty()) {
            sums.remove(0);
        }
    }

    // Setter
    public void setSums(List<Integer> sums) {
        this.sums = sums;
    }
}


}
