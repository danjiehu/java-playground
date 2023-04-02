package localDate;

import java.time.LocalDate;

public class Tester {

    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDate birthdate = LocalDate.of(1995,4,20);
        System.out.println("Current Date: " + currentDate);
        System.out.println("birthdate: " + birthdate);
    }

}
