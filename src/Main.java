public class Main {
    public static void main(String[] args) {


        int ticketPrice = 128718; // Переменная стоимости билета

        int miles = Math.round(ticketPrice / 20); // Переменная бонусных миль

        System.out.println("Кол-во баллов за купленый билет:");
        System.out.println(miles);
    }

}