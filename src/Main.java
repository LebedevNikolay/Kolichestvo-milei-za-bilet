public class Main {
    public static void main(String[] args) {
        int ticketPrice = 11404; //стоимость билета
        int bonus = 20; //сумма одной бонусной мили

        int miles;  //Переменная мили.
        if (ticketPrice < 0) {
            System.out.printf("Стоимость билета не может быть отрицательной"); //проверка отрицательной стоимости билета
        } else if (ticketPrice > 0) {
            miles = ticketPrice / bonus;//расчет количества миль, за покупку билета.
            System.out.printf("Кол-во миль за покупку билета: " + miles);// Вывод результата.

    }
    }
}
