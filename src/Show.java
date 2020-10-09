public class Show {
    public static void main(String[] args) {
        Math math = new Math();

        System.out.println("Czy liczba jest parzysta: " + math.isEven(7));
        System.out.println("Czy liczba jest nieparzysta: " + math.isOdd(7));
        System.out.println("Pole koła o podanym promietu to: " + math.circleField(5.2) + " jednostek kwadratowych");
        System.out.println("Kwadrat podanej liczby to: " + math.power(7));
    }
}
