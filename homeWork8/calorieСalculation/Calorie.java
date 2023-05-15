package homeWork8.calorieСalculation;

import java.util.Scanner;

public class Calorie {
    public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Подсчет калорий");
        double quantityCalStandart = Math.PI * 12 * 12 * 40;
        System.out.println("Pizza диаметр 24 см - " + Math.round(quantityCalStandart) + " калории " );
        System.out.println("Укажите диаметр пиццы для заказа");
        double diameter = scanner.nextInt();
        int squarePizza = (int) Math.round(Math.pow(diameter /2, 2) * Math.PI);
        if (diameter > 24) {
            System.out.println("Заказ вашей пиццы на " + (int) (diameter - 24) + " см больше чнм стандартная вы получите на " +
                    (int) (squarePizza * 40 - quantityCalStandart) + " калорий.T.е, всего - " + squarePizza * 40 + "калории");
        }
            else {
                System.out.println("Вы заказали пиццу диаметром на " + (int) (24 - diameter) + "см меньше, чем стандартная, Вы получите меньше на "
                        + (int) (quantityCalStandart - squarePizza * 40) + "калорий всего - " + squarePizza * 40 + "калории");
            }
            System.out.println("Конец работы программы");
            }
        }















