package com.example.emmar_assignment.ui.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Sunita on 22/08/23.
 */
public class Utils {
    public static String getDate(String _date) {
        SimpleDateFormat inputFormat = new SimpleDateFormat("E MMM dd HH:mm:ss 'GMT'Z yyyy", Locale.getDefault());
        SimpleDateFormat outputFormat1 = new SimpleDateFormat("MMM dd, yyyy hh:mm a", Locale.getDefault());
        SimpleDateFormat outputFormat2 = new SimpleDateFormat("MMM dd, yyyy", Locale.getDefault());

        try {
            Date date = inputFormat.parse(_date);
            String todayTime;
            if (date != null) {
                todayTime = outputFormat1.format(date);
                String yesterdayTime = outputFormat1.format(new Date(date.getTime() - 2 * 24 * 60 * 60 * 1000));
                String twoDaysAgo = "2 days ago";
                String monthDateYear = outputFormat2.format(date);
                System.out.println("Today, time(hour:minute): " + todayTime);
                System.out.println("Yesterday, hour:minute: " + yesterdayTime);
                System.out.println("2 days ago: " + twoDaysAgo);
                System.out.println("Month date, year: " + monthDateYear);
                return monthDateYear;
            }
            return "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
