package day5;

import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class DateTime {
    public void random() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input: ");
        String name = scan.nextLine();
        Random random = new Random();
        int max = 7000;
        int int_random = random.nextInt(max);
        System.out.println(name+ "_" + int_random);
    }

    public void calendar() {
        Calendar cal = Calendar.getInstance();
        System.out.println("Day : " + cal.get(Calendar.DATE));
        System.out.println("Month : " + cal.get(Calendar.MONTH));
        System.out.println("Year : " + cal.get(Calendar.YEAR));
        System.out.println("Hour : " + cal.get(Calendar.HOUR));
        System.out.println("Minute : " + cal.get(Calendar.MINUTE));
    }
}


