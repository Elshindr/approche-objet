package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDates {
    public static void main(String[] args) {
       // Calendar cal = Calendar.getInstance();
        Date date = new Date();
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
        String strFormatDate = formatDate.format(date);
        System.out.println(strFormatDate);

        Date d = new Date(116, 5, 19, 23, 59, 30);
        SimpleDateFormat formatD = new SimpleDateFormat("dd/MMMM/yyyy HH:mm:ss");
        String strFormatD = formatD.format(d);
        System.out.println(strFormatD);

    }
}
