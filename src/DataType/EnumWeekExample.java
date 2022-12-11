package DataType;

import javax.jws.soap.SOAPBinding;
import java.util.Calendar;

public class EnumWeekExample {
    public static void main(String[] args){

        Week today = null;
        Calendar cal = Calendar.getInstance();
        int week = cal.get(Calendar.DAY_OF_WEEK); // sunday(1) ~ saturday(7)

        switch (week) {
            case 1:
                today = Week.SUNDAY;
                break;

            case 2:
                today = Week.MONDAY;
                break;
            case 3:
                today = Week.TUESDAY;
                break;
            case 4:
                today = Week.THURSDAY;
                break;
            case 5:
                today = Week.FRIDAY;
                break;

            case 6:
                today = Week.SATURDAY;
                break;

            case 7:
                today = Week.SUNDAY;
                break;
        }

        System.out.println(today);
        if(today == Week.SUNDAY){
            System.out.println("일요일 ");
        } else {
            System.out.println("일요일 x ");
        }

        Week[] days = Week.values();

        for(Week day : days) {
            System.out.println(day);
        }

    }
}
