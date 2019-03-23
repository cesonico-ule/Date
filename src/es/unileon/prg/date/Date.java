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


		if (day < 1 || day > daysOfMonth()){
			throw new DateException("Díals " + month + " no válido" +
					" Valores posibles entre 1 y " + daysOfMonth());
		} else {
			this.day = day;
		}
	}

	@Override
	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
	}

// Métodos auxiliares

	private int daysOfMonth(){
		int daysOfMonth = 0;
		switch(this.month){
			case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12	:
			daysOfMonth = 31;
		break;
		case 4:
		case 6:
		case 9:
		case 11:
			daysOfMonth = 30;
		break;	
		case 2:
			daysOfMonth = 28;
		default:
			daysOfMonth = -1;
		}
									
	return daysOfMonth;
	}


//	EJERCICIOS:



// Métodos isSame con IF

	private boolean isSameYearIf(){
		boolean isy = false;
		if(this.year == year);{
			isy = true;
		}
	return isy;
	}

	private boolean isSameMonthIf(){
		boolean ism = false;
		if(this.year == year);{
			ism = true;
		}
	return ism;
	}

	private boolean isSameDayIf(){
		boolean isd = false;
		if(this.year == year);{
			isd = true;
		}
	return isd;
	}
	
	private boolean isSameIf(){
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
	
	private boolean isSameYear(){
	
	return false;
	}
	
	private boolean isSameMonth(){
	
	return false;
	}
	
	private boolean isSameDay(){
	
	return false;
	}
	
	private boolean isSame(){
	
	return false;
	}


// Método que devuelve el nombre del mes

	private String returnMonth(){
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
	
	private boolean checkDay(){
		boolean checkDay = false;
	
	return checkDay;
	}

// Método que devuelve la estación

	private String season(){
		String season;
		switch(this.month){
		case 3:
		case 4:
		case 5:
			season = "Primavera";
		break;
		case 6:
		case 7:
		case 8:
			season = "Verano";
		break;
		case 9:
		case 10:
		case 11:
			season = "Otoño";
		break;
		case 12:
		case 1:
		case 2:
			season = "Invierno";
		break;
		default:
			season = "-1";
		}
		
	return season;
	}

// Método que para una fecha devuelve los meses restantes para que acabe el año

	private int monthsLeft(){
		int monthsLeft = 0;
		monthsLeft = 12 + 1 - month;
	return monthsLeft;
	}

// Método que devuelve la version String de la fecha 
	
	private String returnStringDate(){
		String date = this.day + " - " + returnMonth() + " - " + this.year;
	return date;
	}

// Método que devuelve las fechas que quedan hasta que acabe el mes

	private String daysUntilEnd(){
		String daysUntilEnd = toString();
		int i = this.month;
			for(i=this.month;i<daysOfMonth();i++){
				daysUntilEnd = daysUntilEnd + ", " + i + "/" + this.month + "/" + 
										this.year;
			}	
	return daysUntilEnd;
	}

// Método que, para una fecha, devuelve los meses con el mismo número de días

	private String monthSameDays(){
		String monthSameDays;
		switch (daysOfMonth()){
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

// Método que devuelve los días que van de año

	private int daysSinceFirst(){
		int daysOfYear = 0;
		int i = this.month;
		for(i=this.month;i>0;i--){
			daysOfYear = daysOfYear + daysOfMonth();
		}
	return daysOfYear;
	}

// Random Attempts con while (por hacer)

	private int numberOfAttempsw(){
		int i = 0;
	return i;
	}

// Random Attempts con do while (por hacer)

	private int numberOfAttempsdw(){
		int i = 0;
	return i;
	}
	
// Cálculo del día de la semana (por hacer)
	
	private String returnDayOfWeek(){
		String dayOfWeek = "0";
	
	return dayOfWeek;
	}

}
