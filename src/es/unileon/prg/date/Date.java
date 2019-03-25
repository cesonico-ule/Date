package es.unileon.prg.date;


public class Date {

	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year) throws DateException{
		this.year = year;
		if (month < 1 || month > 12) {
			throw new DateException("Mes " + month + " no válido." +
					" Valores posibles entre 1 y 12");
		} else {
			this.month = month;
		}


		if (day < 1 || day > daysOfMonth()){
			throw new DateException("Día " + day + " no válido." +
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

	public int daysOfMonth(){
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
		break;
		default:
			daysOfMonth = -1;
		}
									
	return daysOfMonth;
	}

//	EJERCICIOS:



// Métodos isSame con IF

	public boolean isSameYearIf(){
		boolean isy = false;
		if(this.year == year);{
			isy = true;
		}
	return isy;
	}

	public boolean isSameMonthIf(){
		boolean ism = false;
		if(this.year == year);{
			ism = true;
		}
	return ism;
	}

	public boolean isSameDayIf(){
		boolean isd = false;
		if(this.year == year);{
			isd = true;
		}
	return isd;
	}
	
	public boolean isSameIf(){
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
	
// Métodos isSame limpios
	
	public boolean isSameYear(){
		boolean isy = false;
		while (this.year == year) {
			isy = true;
		break;
		}
	return isy;
	}
	
	public boolean isSameMonth(){
		boolean ism = false;
		while (this.month == month) {
			ism = true;
		break;
		}
	return ism;
	}
	
	public boolean isSameDay(){
		boolean isd = false;
		while (this.day == day) {
			isd = true;
		break;
		}
	return isd;
	}
	
	public boolean isSame(){
		boolean is = false;
		while (this.year == year) {
			while (this.month == month) {
				while (this.day == day) {
					is = true;
				break;
				}
			break;
			}
		break;
		}
		
	return is;
	}


// Método que devuelve el nombre del mes

	public String returnMonth(){
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
	
// Método que comprueba si el día del mes está bien
	
	public boolean checkDay() throws DateException{
		boolean checkDay = false;
		if (day < 1 || day > daysOfMonth()){
			throw new DateException("Día " + day + " no válido" +
					" Valores posibles entre 1 y " + daysOfMonth());
		} else {
			checkDay = true;
		}
	return checkDay;
	}

// Método que devuelve la estación del año

	public String season(){
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

	public String monthsLeft(){
		String monthsLeft =returnMonth();
		int i = this.month+1;
		for(i=this.month+1;i<13;i++){
			this.month = i;
			monthsLeft = monthsLeft + ", " + returnMonth();
		}
	return monthsLeft;
	}

// Método que devuelve la version String de la fecha
	
	public String returnDate(){
		String fecha = this.day + " de " + returnMonth() + " de " + this.year;
	return fecha;
	}

// Método que devuelve las fechas que quedan hasta que acabe el mes

	public String datesUntilEnd(){
		String datesUntilEnd = toString();
		int i = this.day+1;
			for(i=this.day+1;i<daysOfMonth()+1;i++){
				datesUntilEnd = datesUntilEnd + ", " + i + "/" + this.month + "/" + 
										this.year;
			}	
	return datesUntilEnd;
	}

// Método que, para una fecha, devuelve los meses con el mismo número de días

	public String monthSameDays(){
		String monthSameDays;
		switch (daysOfMonth()){
		case 31:
			monthSameDays = "Enero, Marzo, Mayo, Julio, Agosto, Octubre y Diciembre";
		break;
		case 30:
			monthSameDays = "Abril, Junio, Septiembre y Noviembre";
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

	public int daysSinceFirst(){
		int daysOfYear = this.day;
		int i = this.month-1;
		for(i=this.month-1;i>0;i--){
			this.month=i;
			daysOfYear = daysOfYear + daysOfMonth();
		}
	return daysOfYear;
	}

// Random Attempts con while

	public int numberOfAttemptsW(){
		int randomDay = 0, randomMonth = 0, i = 0;
		while(randomDay != this.day) {
			while(randomMonth != this.month){
				randomMonth = (int)(Math.random() * 11 + 1);
				i++;
			}
			randomDay = (int)(Math.random() * daysOfMonth() + 1);
		}
		System.out.println("Fin");
		System.out.println(randomDay);
		System.out.println(randomMonth + "\n");
	return i;
	}

// Random Attempts con do while

	public int numberOfAttemptsDw(){
		int randomDay = 0, randomMonth = 0, i = 0;
		do {
			do {
				randomMonth = (int)(Math.random() * 12 + 1);
				i++;
			}
			while (this.month != randomMonth);
			randomDay = (int)(Math.random() * daysOfMonth() + 1);
		}
		while (this.day != randomDay);
		System.out.println("Fin");
		System.out.println(randomDay);
		System.out.println(randomMonth + "\n");
	return i;
	}
// Cálculo del día de la semana
	
	public String returnDayOfWeek(){
		String dayOfWeek = "0";
		int firstDay = 0;
		switch((daysSinceFirst()+firstDay)%7){
		case 0:
			dayOfWeek = "Lunes";
		break;
		case 1:
			dayOfWeek = "Martes";
		break;
		case 2:
			dayOfWeek = "Miércoles";
		break;
		case 3:
			dayOfWeek = "Jueves";
		break;
		case 4:
			dayOfWeek = "Viernes";
		break;
		case 5:
			dayOfWeek = "Sábado";
		break;
		case 6:
			dayOfWeek = "Domingo";
		break;
		default:
			dayOfWeek = "-1";
		}
	return dayOfWeek;
	}

}
