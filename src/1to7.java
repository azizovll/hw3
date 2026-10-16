import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1
        // int i = 1;
        // do {
        // System.out.println(i);
        // i *= 10;
        // } while (i <= 1000);

        // 2.
        // for (int i = 1; i <= 1000; i *= 10) {
        // System.out.println(i);
        // }

        // 3.
        // System.out.println("Введите число");
        // int n = scanner.nextInt();
        // for (int i = 1; i <= n ; i++) {
        // System.out.println(i);
        // }

        // 4.
        // for (int i = 1; i >0; i++) {
        // System.out.println(i);
        // }

        // 5.
        // System.out.println("Введите число");
        // int n = scanner.nextInt();
        // int i = 1;

        // for (; i <= n; i++) {
        // if (i % 2 == 0) {
        // System.out.println(i);
        // }

        // do {
        //     if (i % 2 == 0) {
        //         System.out.println(i);
        //     } 
        //     i++;
        // } while (i <= n);


        // while (i <= n) {
            
        //      if (i % 2 == 0) {
        //         System.out.println(i);
        //     }
        //     i++;
        // }
        // }


// 6.
        // System.out.println("Введите число");
        // int n = scanner.nextInt();
        // int i = 1;

        // for (; i <= n; i++) {
        // if (i % 2 != 0) {
        // System.out.println(i);
        // }

        // do {
        //     if (i % 2 != 0) {
        //         System.out.println(i);
        //     } 
        //     i++;
        // } while (i <= n);


        // while (i <= n) {
            
        //      if (i % 2 != 0) {
        //         System.out.println(i);
        //     }
        //     i++;
        // }
        // }



        // 7.
        System.out.println("Введите число");
        int n = scanner.nextInt();
        int i = 1;

 
        for (; i <= n; i++) {
                if (i % 3 == 0 && i % 5 == 0 ) {
                        System.out.println(i + " = " + "FizzBuzz");
         }
                 else if(i % 5 == 0 && i % 3 != 0 ){
                        System.out.println(i + " = " + "Buzz");}

                else if(i % 5 != 0 && i % 3 == 0 ){
                        System.out.println(i + " = " + "Fizz");

         }
        }


}}
