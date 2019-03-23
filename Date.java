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

// Métodos auxiliares

int monthDays(){
	int monthDays = 0;
	switch(this.month){
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


//	EJERCICIOS:



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

// Métodos isSame limpios (por hacer)

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


// Método que devuelve el nombre del mes

String returnMonth(){
		String name;
		switch(this.month){
		case 1:
			name = "Enero";
		break;
		case 2:
			name = "Febrero";
		break;
		case 3:
			name = "Marzo";
		break;
		case 4:
			name = "Abril";
		break;
		case 5:
			name = "Mayo";
		break;
		case 6:
		name = "Junio";
		break;
		case 7:
			name = "Julio";
		break;
		case 8:
			name = "Agosto";
			break;
		case 9:
			name = "Septiembre";
		break;
		case 10:
			name = "Octubre";
		break;
		case 11:
			name = "Noviembre";
		break;
			case 12:
			name = "Diciembre";
		break;
		default:
			name = "-1";
		}
	return name;
	}
	
// Método que comprueba si el día del mes está bien (???)
	
	boolean checkDay(){
		boolean checkDay;
	
	return false;
	}

// Método que devuelve la estación

	String season(){
		String season;
		switch(this.month){
		case 3:
		case 4:
		case 5:
			name = "Primavera";
		break;
		case 6:
		case 7:
		case 8:
			name = "Verano";
		break;
		case 9:
		case 10:
		case 11:
			name = "Otoño";
		break;
		case 12:
		case 1:
		case 2:
			name = "Invierno";
		break;
		default:
			name = "-1";
		}
		
	return season;
	}

// Método que para una fecha devuelve los meses restantes para que acabe el año (por hacer)

	int monthsLeft(){
		int months;
	
	return months;
	}

// Método que devuelve la version String de la fecha 
	
	String returnStringDate(){
		String date = this.day + " - " + returnMonth() + " - " + this.year;
	return date;
	}

// Método que devuelve las fechas que quedan hasta que acabe el año (???)

	String daysUntilEnd(){
	
	return "0";
	}

// Método que, para una fecha, devuelve los meses con el mismo número de días

	String monthSameDays(){
		String monthSameDays;
		switch (monthDays()){
		case 31:
			monthSameDays = "Enero, Marzo, Mayo, Julio, Agosto, Octubre, Diciembre";
		break;
		case 30:
			monthSameDays = "Abril, Junio, Septiembre, Noviembre";
		break;
		case 28:
			monthSameDays = "Febrero";
		break;
	
		default:
			monthSameDays = "-1";
		}
	
	return monthSameDays;
	}

// Método que devuelve los días que van de año (por hacer)

	int daysSinceFirst(){
		int days;
	
	return days;
	}

// Random Attempts con while (por hacer)

	int numberOfAttemps(){
		int i;
	return i;
	}

// Random Attempts con do while (por hacer)

	int numberOfAttemps(){
		int i;
	return i;
	}
	
// Cálculo del día de la semana (por hacer)
	
	String returnDayOfWeek(){
		String dayOfWeek;
	
	return dayOfWeek;
	}

}
