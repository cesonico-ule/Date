package es.unileon.prg.date;

public class Date {

	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year) throws DateException{
		this.year = year;
		if (month < 1 || month > 12) {
			throw new DateException("Mes " + month + " no válido" +
					" Valores posibles entre 1 y 12");
		} else {
			this.month = month;
		}


		if (day < 1 || day > monthDays()){
			throw new DateException("Día " + month + " no válido" +
					" Valores posibles entre 1 y " + monthDays());
		} else {
			this.day = day;
		}
	}

	@Override
	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
	}

}


// Métodos auxiliares

int mothDays(){
	int monthDays = 0;
	switch{
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12:
		monthDays = 31;
	break;
	case 4:
	case 6:
	case 9:
	case 11:
		monthDays = 30;
	break;
	case 2:
		monthDays = 28;
	default:
		monthDays = -1;
	}

return monthDays;
}


// Métodos isSame con IF

boolean isSameYearIf(){
	boolean isy = false;
	if(this.year == year);{
		isy = true;
	}
return isy;
}

boolean isSameMonthIf(){
	boolean ism = false;
	if(this.year == year);{
		ism = true;
	}
return ism;
}

boolean isSameDayIf(){
	boolean isd = false;
	if(this.year == year);{
		isd = true;
	}
return isd;
}

boolean isSameIf(){
	boolean is = false;
	if(this.year == year);{
		if(this.month == month);{
			if(this.day == day);{
				is = true;
			}
		}
	}
return is;
}

// Mëtodos isSame limpios

boolean isSameYear(){

retrun false;
}

boolean isSameMonth(){

retrun false;
}

boolean isSameDay(){

retrun false;
}

boolean isSame(){

retrun false;
}


// 2

int returnMonth();
int checkDay();
int season();

//

int monthsLeft();
int returnStringDate();
int daysUntilEnd();
int monthSameDays();
int daysSinceFirst();

//

int numberOfAttemps();
int returnDayOfWeek();
