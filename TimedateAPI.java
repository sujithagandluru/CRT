import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

class TimedateAPI {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        LocalTime time=LocalTime.now();
        LocalDateTime customDateTime=LocalDateTime.now();
        System.out.println(date);
        System.out.println(time);
        System.out.println(customDateTime);
    }


    
}
