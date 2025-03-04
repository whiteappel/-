package lv3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cal<Double> cal = new Cal<>();//제너릭클래스 작성하기

        while (true) {
            System.out.println("첫번째 숫자를 입력하시오: ");
            double first = sc.nextDouble();
            System.out.println("두번째 숫자를 입력하시오: ");
            double second = sc.nextDouble();
            //아래에서 double을 사용하게 위해 여기서도 double로 통일해주기
            System.out.println("사칙연산 입력 (ADD, MINUS, MULTIPLY, DIVIDE 대문자여야함): ");
            String operator = sc.next();

            Double sum = cal.calculate(first, second, operator);

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

    }

    /* enum만 사용한 코드
    public enum Enum {
            Add {
                @Override
                public double apply(double first, double second) {
                    return first + second;
                }
            },

            MINUS {
                @Override
                public double apply(double first, double second) {
                    return first - second;
                }
            },
            multiply {
                @Override
                public double apply(double first, double second) {
                    return first * second;
                }
            },

            DIVIDE {
                @Override
                public double apply(double first, double second) {
                    return first / second;
                }
            };
    }
    */
//람다와 enum을 합친코드 나누기 2

