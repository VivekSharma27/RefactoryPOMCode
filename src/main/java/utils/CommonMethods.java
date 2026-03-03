package utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class CommonMethods {
	
    private static final Random random = new Random();

    public static String randomString(int length) {
    	
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) sb.append(chars.charAt(random.nextInt(chars.length())));
        return sb.toString();
    }

    public static int getRandomInt(int max) {
        return random.nextInt(max);
    }

    public static long getRandomLong(long min, long max) {
        return min + (long) (random.nextDouble() * (max - min));
    }

    public static String getRandom8DigitString() {
        return String.valueOf(10000000 + random.nextInt(90000000));
    }
    
   

        public static String generateRandomIp() {
            return random.nextInt(256) + "." +
                   random.nextInt(256) + "." +
                   random.nextInt(256) + "." +
                   random.nextInt(256);
        }
        
        public static String getCurrentDate() {
            return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        }

        public static String getFutureDate(int daysToAdd) {
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.DAY_OF_MONTH, daysToAdd);
            return new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime());
        }
    
}
