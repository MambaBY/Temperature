import java.util.Scanner;

/*Задача 15. Интерфейсы. Конвертер температур
Напишите два класса, имплементирующие интерфейс Converter, для конвертации из градусов по Цельсию в Кельвины и Фаренгейты.
У классов должен быть (переопределенный) метод (интерфейса) convert, который и выполняет конвертацию:
Кельвины = Цельсий + 273.15
Фаренгейты = Цельсий х 1.8 + 32
Создайте класс Conversion, в котором запросите у пользователя температуру и выведите в консоль ее значение по Кельвину и Фаренгейту.*/
public class Conversion {
    public static void main(String[] args) {
        System.out.print("Enter the temperature in degrees Celsius: ");
        Scanner sc = new Scanner(System.in);
        double temperatureCelsius = sc.nextDouble();

        System.out.println("Temperatere F is equal: " + new CelsiusToFahrenheit().converter(temperatureCelsius));
        System.out.println("Temperatere K is equal: " + new CelsiusToKelvin().converter(temperatureCelsius));

    }
}