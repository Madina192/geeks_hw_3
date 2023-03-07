import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] numbers = {2.3, 6.7, -53.0, 0.37, 19.06, -8.9, 17.04, 30.46, 22.08, 14.45, -8.01, 23.01, 9.06, -15.71, 36.85};
        int index = 0;
        double number = 0.0;
        boolean isNegative = false;
        for (double eachNumber: numbers) {
            if (eachNumber < 0) {
                isNegative = true;
            } else if (eachNumber > 0 && isNegative){
                number += eachNumber;
                index++;
            }
        }
        System.out.println("Среднее арифметическое чисел: " + number/index);
        
        double box;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    box = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = box;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));

    }


}