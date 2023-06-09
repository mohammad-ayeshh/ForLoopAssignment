import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        System.out.println("Sum of even numbers from 0 to 100 is: " + sumNumbers("even", 100));
        System.out.println("Sum of odd numbers from 0 to 100 is: " + sumNumbers("odd", 100));
        System.out.println("Sum of odd numbers from 0 to 100 is: " + sumNumbers("divisor", 100 ,7));


        sumOfEvenFor(0,100);
        sumOfEvenWhile(0,100);
        sumOfEvenDoWhile(0,100);
        sumOfOddFor(0,100);
        sumOfOddWhile(0,100);
        sumOfOddDoWhile(0,100);
        sumOfDivisibleFor(0,100,7);
        sumOfDivisibleWhile(0,100,7);
        sumOfDivisibleDoWhile(0,100,7);

    }


    public static int sumNumbers(String sumType, int end) {
        int sum = 0;
        int switchCase= 0;
        if (Objects.equals(sumType, "even")){
            switchCase=1;
        } else if (Objects.equals(sumType, "odd")) {
            switchCase=2;
        }

        switch (switchCase) {
            case 1 -> {
                for (int i = 0; i <= end; i += 2) {
                    sum += i;
                }
            }
            case 2 -> {
                for (int i = 1; i <= end; i += 2) {
                    sum += i;
                }
            }
            default -> System.out.println("invalid sumType please try (odd,even)");
        }
        return sum;
    }
    public static int sumNumbers(String sumType, int end ,int divisor) {
        int sum = 0;
        int switchCase= 0;
        if (Objects.equals(sumType, "even")){
            switchCase=1;
        } else if (Objects.equals(sumType, "odd")) {
            switchCase=2;
        } else if (Objects.equals(sumType, "divisor")) {
            switchCase=3;
        }
        switch (switchCase ) {
            case 1 -> {
                for (int i = 0; i <= end; i += 2) {
                    sum += i;
                }
            }
            case 2 -> {
                for (int i = 1; i <= end; i += 2) {
                    sum += i;
                }
            }
            case 3 -> {
                for (int i = 0; i <= end; i++) {
                    if (i % divisor == 0) {
                        sum += i;
                    }
                }
            }
            default -> System.out.println("invalid sumType please try (odd,even,divisor)");
        }
        return sum;
    }

    public static void sumOfEvenFor(int start, int end) {

        int sum = 0;
        for (int i = start; i <= end; i+=2) {
            sum += i;
        }

        System.out.println("Sum of even numbers from "+start+" to "+end+" is: "+ sum);

    }

    public static void sumOfEvenWhile (int start, int end) {

        int sum = 0;
        int i = start;
        while (i <= end) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("Sum of even numbers from "+start+" to "+end+" is: "+ sum);

    }

    public static void sumOfEvenDoWhile (int start, int end) {

        int sum = 0;
        int i = start;
        do {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        } while (i <= end);
        System.out.println("Sum of even numbers from "+start+" to "+end+" is: "+ sum);
    }

    public static void sumOfOddFor (int start, int end) {

        int sum = 0;
        for (int i = start; i <= end; i+=2) {
            sum += i;
        }
        System.out.println("Sum of even numbers from "+start+" to "+end+" is: " + sum);

    }

    public static void sumOfOddWhile (int start, int end) {

        int sum = 0;
        int i = start;
        while (i <= end) {
            if (i % 2 != 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("Sum of even numbers from "+start+" to "+end+" is: "+ sum);

    }

    public static void sumOfOddDoWhile (int start, int end) {

        int sum = 0;
        int i = start;
        do {
            if (i % 2 != 0) {
                sum += i;
            }
            i++;
        } while (i <= end);
        System.out.println("Sum of even numbers from "+start+" to "+end+" is: "+ sum);

    }

    public static void sumOfDivisibleFor(int start, int end,int divisble) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % divisble == 0) {
                sum += i;
            }
        }
        System.out.println("Sum of even numbers from "+start+" to "+end+" is: "+ sum);


    }

    public static void sumOfDivisibleWhile(int start, int end,int divisble) {
        int sum = 0;
        int i = start;
        while (i <= end) {
            if (i % divisble == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("Sum of even numbers from "+start+" to "+end+" is: "+ sum);


    }

    public static void sumOfDivisibleDoWhile(int start, int end,int divisble) {
        int sum = 0;
        int i = start;
        do {
            if (i % divisble == 0) {
                sum += i;
            }
            i++;
        } while (i <= end);
        System.out.println("Sum of even numbers from "+start+" to "+end+" is: "+ sum);


    }
}
