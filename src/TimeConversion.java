
/*
 Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.

Note: Midnight is 12:00:00AM  on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a -hour clock.

Input Format

A single string containing a time in -hour clock format (i.e.:HH:MM:SS.AM  orHH:MM:SSPM ), where 01<=H<=12 and 01<=MM<=59 and 01<=SS<==59 .

Output Format

Convert and print the given time in 24-hour format, where 00<=HH<=23 .

Sample Input

07:05:45PM
Sample Output

19:05:45
 */


import java.util.Scanner;
public class TimeConversion {

	static String timeConversion(String s) {
		String arr[] =s.split(":");
		String ss =arr[2].substring(0,arr[2].length()-2);
		String Meridian =arr[2].substring(arr.length-1,arr[2].length());
		int OutputHour = 0;
		int hour = Integer.parseInt(arr[0]);
		int min = Integer.parseInt(arr[1]);
		int sec =Integer.parseInt(ss);
		String time =null;
		if(hour<13&&hour>0) {
			if(min<59&&min>=0) {
				if(sec<59&&sec>=0) {
					if(Meridian.equalsIgnoreCase("AM")||Meridian.equalsIgnoreCase("PM")) {

						if(hour==12 && Meridian.contains("PM")) {
							OutputHour =hour;
							
						}else if(hour==12 && Meridian.contains("AM")) {
							OutputHour =hour -12;
							
						}else if(hour< 12 && Meridian.equalsIgnoreCase("PM")) {
							OutputHour=hour +12;
							
						}

						String timeinString = String.valueOf(OutputHour);
						
						if(timeinString.equals("0")) {
							timeinString=timeinString.concat("0");

						}
						if(ss.contentEquals("0")) {
							timeinString=timeinString.concat("0");
							ss=ss.concat("0");
						}
						time =timeinString.concat(":").concat(arr[1]).concat(":").concat(ss);
						
					} else {
						time = "Meridian is not proper";
					}

				}else {
					time ="Second is not proper";
				}
			}else {
				time ="Minute is not proper";
			}
		}else {
			time ="Hour is not proper";
		}

		return time;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String result = timeConversion(s);
		System.out.println(result);
		in.close();
	}

}
