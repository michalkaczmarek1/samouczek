package pl.samouczekprogramisty.kursjava;

public class Main {

    public static void main(String[] args) {
//
//        String messageMorning = "Rano było chłodno";
//        String messageAfternoon = "Teraz jest gorąco";
//        String messageEvening = "Wieczorem bedzie troche chłodniej";
//
//        int sumChar = messageMorning.length() + messageAfternoon.length() + messageEvening.length();
//
//        System.out.println(messageMorning);
//        System.out.println(messageAfternoon);
//        System.out.println(messageEvening);
//        System.out.println("Ilosc znaków " + sumChar);

        int[] numbers = new int[4];
        numbers[0] =45;
        numbers[1] = 42;
        numbers[2] = 93;

//        System.out.println(sumArray(numbers));
        System.out.println(maxNumberArrayWithoutIf(numbers));
    }

    private static int sumArray(int[] numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return sum;
    }

    private static int maxNumberArray(int[] numbers){
        int biggest = numbers[0];

        if(biggest > numbers[1] && biggest > numbers[2]){
            return biggest;
        } else if (numbers[1] > numbers[2] && numbers[1] > biggest){
            biggest = numbers[1];
        } else if (numbers[2] > numbers[1] && numbers[2] > biggest){
            biggest = numbers[2];
        }

        return biggest;

    }

    private static int maxNumberArrayWithoutIf(int[] numbers){
        return Math.max(numbers[0], Math.max(numbers[1], numbers[2]));
    }
}
