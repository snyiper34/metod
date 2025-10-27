import java.time.LocalDate;

import static java.time.LocalDate.now;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");

        checkYears(2021);

        System.out.println("Задание 2");

        recommendAppVersion(0, 2020);
        recommendAppVersion(0, 2014);
        recommendAppVersion(1, 2021);
        recommendAppVersion(1, 2010);

        System.out.println("Задание 3");

        deleveryTime(95);
    }
    public static void checkYears(int year) {
        if(isYear(year)){
            System.out.println(year + " високосный год");
        }
        else {
            System.out.println(year + " невисокосный год");
        }
    }
    public static boolean isYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static String getOSName(int osType){
        if (osType == 0) {
            return "IOS";
        }
        else {
            return "Android";
        }
    }
    private static String getVersionType(int manufactureYear, int currentYear) {
        if (manufactureYear < currentYear) {
            return "облегченную";
        }
        else {
            return "обычную";
        }
    }
    public static void recommendAppVersion(int osType, int manufactureYear) {
        int currentYear = LocalDate.now().getYear();

        String osName = getOSName(osType);
        String versionType = getVersionType(manufactureYear, currentYear);
        System.out.println("Установите " + versionType + " версию для " + osName);

    }

    public static void deleveryTime(int deliveryDistance){
        int deliveryDays;
        if (deliveryDistance <= 20) {
            deliveryDays = 1;
        } else if (deliveryDistance  <= 60) {
            deliveryDays = 2;
        } else if (deliveryDistance  <= 100) {
            deliveryDays = 3;
        }else {
            deliveryDays = -1;
        }
        if (deliveryDays == - 1){
            System.out.println("Доставка на расстояние " + deliveryDistance + " км невозможна");
        }else {
            System.out.println("Потребуеться дней: " + deliveryDays + " (растояние: " + deliveryDistance + " км)");
        }
    }
}