//Test02_GetDayMonYear_Date.java

import java.time.LocalDate;

class Test02_GetDayMonYear_Date {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yyyy = date.getYear();
		System.out.println(dd+"-"+mm+"-"+yyyy);
		
	}

}
