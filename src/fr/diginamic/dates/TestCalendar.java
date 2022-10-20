package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {
    public static void main(String[] args) {
        Date d = new Date(116, 5, 19, 23, 59, 30);
        SimpleDateFormat formatD = new SimpleDateFormat("dd/MMMM/yyyy");
        String strFormatD = formatD.format(d);
        System.out.println(strFormatD);

        Calendar cal = Calendar.getInstance();
        cal.set(2016, 4, 19, 23, 59, 30);
        Date date = cal.getTime();

        SimpleDateFormat format = new SimpleDateFormat("'Le' dd/MM/yyyy 'à' HH:mm:ss");
        String strFormat = format.format(date);
        System.out.println(strFormat);

        SimpleDateFormat formatChine = new SimpleDateFormat("EEEE dd/MMMM/yyyy HH:mm:ss", Locale.CHINA);
        String strFormatChine = formatChine.format(date);
        System.out.println("Chine:" + strFormatChine);

        SimpleDateFormat formatAll = new SimpleDateFormat("EEEE dd/MMMM/yyyy HH:mm:ss", Locale.GERMAN);
        String strFormatAll = formatAll.format(date);
        System.out.println("All:" + strFormatAll);

        SimpleDateFormat formatFr = new SimpleDateFormat("EEEE dd/MMMM/yyyy HH:mm:ss", Locale.FRENCH);
        String strFormatFr  = formatFr.format(date);
        System.out.println("Fr :" + strFormatFr );

        SimpleDateFormat formatRu  = new SimpleDateFormat("EEEE dd/MMMM/yyyy HH:mm:ss", new Locale("ru", "RU"));
        String strFormatRu   = formatRu .format(date);
        System.out.println("Ru :" + strFormatRu  );
    }
}
