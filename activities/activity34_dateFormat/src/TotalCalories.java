//*********************************************************
//         Activity 34: Date Format
//          Submission: 4/18/2023
//******************************************************
//Description:
//This program calculates the amount of calories you
//would have eaten between two dates of your choosing
//********************************************************

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TotalCalories {
    private DateFormat date_formatter = new SimpleDateFormat("MM/dd/yyyy");


    //This function calculates the amount of calories you would consume between a start date and end date
    //The parameters take the calories per day that you would be eating, and the start and end date of when you plan on
    //eating your calories.
    public double calculateCalories(int calroies_pd, String start_date, String end_date){
        int days = 0;
        try {
            //Format date to mm/dd/yyyy
            Date date1 = date_formatter.parse(start_date);
            Date date2 = date_formatter.parse(end_date);

            //takes the longer version of numbers in order to be more percise and turns the difference
            //of days to milliseconds, then milliseconds to days.
            long difference = date2.getTime() - date1.getTime();
            days = (int) TimeUnit.DAYS.convert(difference,TimeUnit.MILLISECONDS);
        }
        catch (ParseException e){
            e.printStackTrace();
        }
        //returns a double of the calories per day to the days
        return calroies_pd * days;
    }
}
