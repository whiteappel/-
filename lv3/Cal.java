package lv3;

import java.util.ArrayList;
import java.util.List;

public class Cal<T extends Number> {

    private List<Double> sums = new ArrayList<>();

    public double calculate(Number first, Number second, String operator) {
        try {
            double sum = OperationType.calculate(operator, first.doubleValue(), second.doubleValue());
            sums.add(sum);
            return sum;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return Double.NaN;
        }
    }

    public List<Double> getSums() {
        return sums;
    }

    public void removeSum() {
        if (!sums.isEmpty()) {
            sums.remove(0);
        }
    }

    public void setSums(List<Double> sums) {
        this.sums = sums;
    }
}
