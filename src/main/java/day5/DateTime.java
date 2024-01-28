package day5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

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

    public void compare() throws ParseException {
        String pattern = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Scanner scan = new Scanner(System.in);
        System.out.println("Input date 1:");
        String dateStr1 = scan.nextLine();
        System.out.println("Input date 2:");
        String dateStr2 = scan.nextLine();
        Date date1 = simpleDateFormat.parse(dateStr1);
        Date date2 = simpleDateFormat.parse(dateStr2);
        boolean bool1 = date1.after(date2);
        boolean bool2 = date1.before(date2);
        boolean bool3 = date1.equals(date2);
        if(bool1){
            System.out.println(dateStr1+" is after "+dateStr2);
        }else if(bool2){
            System.out.println(dateStr1+" is before "+dateStr2);
        }else if(bool3){
            System.out.println(dateStr1+" is equal to "+dateStr2);
        }

    }

    public void formatDateTime(){
        LocalDate localDate = LocalDate.now();
        LocalDateTime ldt = LocalDateTime.now();

        DateTimeFormatter f0 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter f3 = DateTimeFormatter.ofPattern("HH:mm.ss.SSS");
        DateTimeFormatter f4 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        DateTimeFormatter f5 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS Z");

        // System.out.println(localDate);
        System.out.println(f0.format(ldt));
        System.out.println(f1.format(ldt));
        System.out.println(f2.format(ldt));
        System.out.println(f3.format(ldt));
        System.out.println(f4.format(ldt));
        System.out.println(ZonedDateTime.now().format(f5));
    }
}


