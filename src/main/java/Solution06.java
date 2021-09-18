/*
 *  UCF COP3330 Fall 2021 Assignment 6 Solution
 *  Copyright 2021 Quinn Gilbert
 */
import java.util.*;

public class Solution06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your current age? ");
        int age = in.nextInt();
        System.out.print("What age do you want to retire? ");
        int retirement = in.nextInt();
        int current_year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println("You have "+(retirement-age)+" years left to retire");
        System.out.println("It's "+current_year+", so you can retire in "+(current_year+retirement-age));
    }
}
/*
prompt age
input age
prompt retirement age
input retirement age
get current year
print current_year+retirement_age-current_age
 */