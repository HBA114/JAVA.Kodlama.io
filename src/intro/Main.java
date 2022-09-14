// package name
package intro;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
	// main function where application starts running (to create write psvm and tab (in vscode and intellij))
	public static void main(String[] args) {

		// Print "Hello World!" to console
		System.out.println("Hello World!");

		// Declaring integer variable (datatype int is known as integer) and
		int year = 2022;

		// Print declared variable and a text to console with combining
		System.out.println("Kodlama.io Java " + year);

		// Date time formatter for formating date and time for more readable data
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH.mm : dd/MM/yyyy");

		// Gets current date and time
		var date = LocalDateTime.now();

		// Declaring a string variable and assign the date and time project created
		String firstDateString = "2022-09-14T23:05:37.158975800";
		// Declaring a date time variable and assign th formatted date time
		LocalDateTime firstDate = LocalDateTime.parse(firstDateString);

		// Print formatted date time to console
		System.out.println("Created By HBA114 at " + dtf.format(firstDate));

		// Print current date when program is runned.
		System.out.println("Date " + dtf.format(date));

		// ₺ / $ exchance yesterday
		double dolarYesterday = 18.14;
		// ₺ / $ exchance today
		double dolarToday = 18.10;

		// enum is a variable type that can have values that declared in brackets
		enum dolarEnum {
			DECREASED, // dolar state if dolar exchance decreased
			INCREASED, // dolar state if dolar exchance increased
			SAME // dolar state if dolar exchance not changed
		}

		// Declaring a dolarEnum type enum variable and assign SAME as default.
		dolarEnum dolarState = dolarEnum.SAME;

		// Declaring a string value and assign empty string.
		String arrowDirection = "";

		// If dolarToday is smaller than dolarYesterday do
		if (dolarToday < dolarYesterday) {
			// set dolarState to DECREASED from dolarEnum
			dolarState = dolarEnum.DECREASED;
			// set arrowDirection as down.svg (down arrow image)
			arrowDirection = "down.svg";
		} else if (dolarToday == dolarYesterday) { // Else If dolarToday is equals to dolarYesterday do
			// set dolarState to SAME from dolarEnum
			dolarState = dolarEnum.SAME;
			// set arrowDirection as equal.svg (equal image)
			arrowDirection = "equal.svg";
		} else { // Else do
			// set dolarState to INCREASED from dolarEnum
			dolarState = dolarEnum.INCREASED;
			// set arrowDirection as up.svg (up arrow image)
			arrowDirection = "up.svg";
		}

		// Print arrowDirection to console
		System.out.println(arrowDirection);
		// Print dolarState to console
		System.out.println("Dolar : " + dolarState);

		// Declaring String variable array
		String[] credits = {
				"Fast Credit",
				"Get Wage From HalkBank",
				"Get Retirement Wage From HalkBank"
		};

		// Manual array writing
		System.out.println(); // creates blank line in console
		// Write first element of credits array to console
		System.out.println(credits[0]);
		// Write second element of credits array to console
		System.out.println(credits[1]);
		// Write third element of credits array to console
		System.out.println(credits[2]);
		System.out.println(); // creates blank line in console

		// Dynamic writing
		for (String credit : credits) { // get each element from credits array to credit variable and do
			// write credit element
			System.out.println("Credit : " + credit);
		}

		// With dynamic writing we dont need to write a line for each all array members.
		System.out.println(); // creates blank line in console

		// Create a variable named i and assing 0 as default value. until i is smaller
		// than credits array length increase i by 1
		for (int i = 0; i < credits.length; i++) {
			// Print credit array element with indexing
			// indexing is (index + 1)
			System.out.println(i + 1 + ". Credit is : " + credits[i]);
		}
	}
}
