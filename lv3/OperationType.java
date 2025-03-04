package lv3;

import java.util.Arrays;

@FunctionalInterface
interface Operation {
    double apply(double first, double second);
}
//연산자 형태
public enum OperationType {
    ADD((first, second) -> first + second),
    MINUS((first, second) -> first - second),
    MULTIPLY((first, second) -> first * second),
    DIVIDE((first, second) -> {
        if (second == 0) throw new ArithmeticException("0으로 나눌 수 없습니다.");
        //0일시 예외처리
        return first / second;
    });
    //종료

    private final Operation operation;

    OperationType(Operation operation) {
        this.operation = operation;
    }


    public double apply(double first, double second) {
        return operation.apply(first, second);
    }

    public static double calculate(String operation, double first, double second) {
        return Arrays.stream(OperationType.values())
                //연산자 가져오기
                .filter(op -> op.name().equalsIgnoreCase(operation))
                //연산자반환 오류발생시 4번쨰줄연계
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("잘못된 연산자: " + operation))
                //혹시 잘못될수있는 오류 
                .apply(first, second);
                //작동
    }
}
