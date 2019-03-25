package es.unileon.prg.date;

public class MainDate {

	public static void main(String[] args) {

		Date today;
		
// Muestra la fecha de hoy
		try {
			today = new Date(10, 5, 2017);
			System.out.println(today.toString());
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}
		
// Método auxiliar

		try {
			today = new Date(10, 2, 2017);
			System.out.println(today.daysOfMonth());
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}

// Métodos <<isSame>>

		System.out.println("Métodos <<isSame>>");
		try {
			today = new Date(10, 5, 2017);
			System.out.println(today.isSameYearIf());
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}

		try {
			today = new Date(10, 5, 2017);
			System.out.println(today.isSameMonthIf());
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}

		try {
			today = new Date(10, 5, 2017);
			System.out.println(today.isSameDayIf());
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}

		try {
			today = new Date(10, 5, 2017);
			System.out.println(today.isSameIf());
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}

// Métodos <<isSame>> sin utilizar if

		System.out.println("Métodos <<isSame>> sin utilizar if");

		try {
			today = new Date(10, 5, 2017);
			System.out.println(today.isSameYear());
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}

		try {
			today = new Date(10, 5, 2017);
			System.out.println(today.isSameMonth());
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}

		try {
			today = new Date(10, 5, 2017);
			System.out.println(today.isSameDay());
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}

		try {
			today = new Date(10, 5, 2017);
			System.out.println(today.isSame());
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}

// Metodo que devuelve el nombre del mes

		System.out.println("Metodo que devuelve el nombre del mes");

		try {
			today = new Date(10, 5, 2017);
			System.out.println(today.returnMonth());
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}


// Comprueba si el día del mes está bien

		System.out.println("Comprueba si el día del mes está bien");

		try {
			today = new Date(10, 5, 2017);
			System.out.println(today.checkDay());
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}


// La estación del año

		System.out.println("La estación del año");

		try {
			today = new Date(10, 5, 2017);
			System.out.println(today.season());
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}


// Meses restantes para que acabe el año

		System.out.println("Meses restantes para que acabe el año");

		try {
			today = new Date(10, 5, 2017);
			System.out.println(today.monthsLeft());
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}


// String de la fecha

		System.out.println("String de la fecha");

		try {
			today = new Date(10, 5, 2017);
			System.out.println(today.returnDate());
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}

// Método que devuelve las fechas que quedan hasta que acabe el mes

		System.out.println("Fechas que quedan hasta que acabe el mes");

		try {
			today = new Date(10, 5, 2017);
			System.out.println(today.datesUntilEnd());
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}

// Meses con el mismo número de días

		System.out.println("Meses con el mismo número de días");

		try {
			today = new Date(10, 5, 2017);
			System.out.println(today.monthSameDays());
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}

// Días que van de año

		System.out.println("Días que van de año");

		try {
			today = new Date(10, 5, 2017);
			System.out.println(today.daysSinceFirst());
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}


// Número de intentos de adivinar la fecha

		System.out.println("Número de intentos de adivinar la fecha");

		try {
			today = new Date(10, 5, 2017);
			System.out.println(today.numberOfAttemptsW());
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}

		try {
			today = new Date(10, 5, 2017);
			System.out.println(today.numberOfAttemptsDw());
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}


// Calcular el día de la semana

		System.out.println("Calcular el día de la semana");

		try {
			today = new Date(10, 5, 2017);
			System.out.println(today.returnDayOfWeek());
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}



	}

}

