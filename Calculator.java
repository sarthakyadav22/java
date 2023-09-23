class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public int add(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void main(String args[]) {
        Calculator calculator = new Calculator();

        int sum1 = calculator.add(3, 4);
        System.out.println("the sum of two integers is:" + sum1);
        double sum2 = calculator.add(5, 6);
        System.out.println("the sum of the two double value is:" + sum2);
        int sum3 = calculator.add(7, 4);
        System.out.println("the sum of the three integer value is :" + sum3);

    }
}