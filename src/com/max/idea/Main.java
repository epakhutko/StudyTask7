package com.max.idea;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in).useLocale(Locale.ENGLISH);;

        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int kind = inp.nextInt();

        switch (kind) {
            case 1: {
                System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - фунт");
                int type = inp.nextInt();
                System.out.println("Введите число");
                double x = inp.nextDouble();
                double m1, m2;
                switch (type) {
                    case 1: {
                        m1=x;
                        m2= 2.20462 * x;
                        break;
                    }

                    case 2: {
                        m1= 0.453592 * x;
                        m2= x;
                        break;
                    }
                    default : {
                        System.out.println("Некорректный ввод");
                        return;
                    }

                }
                System.out.printf("Килограммы: %f\n", m1);
                System.out.printf("Фунты: %f\n", m2);

                break;
            }
            case 2: {
                System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
                int type = inp.nextInt();
                System.out.println("Введите число");
                double x = inp.nextDouble();
                double l1, l2, l3, l4;
                switch (type) {
                    case 1: {
                        l1=x;
                        l2= 0.0006 * l1;
                        l3= 1.094 * l1;
                        l4= 3.281 * l1;
                        break;
                    }

                    case 2: {
                        l1 = 1609.34 * x;
                        l2 = x;
                        l3= 1.094 * l1;
                        l4= 3.281 * l1;
                        break;
                    }

                    case 3: {
                        l1= 0.9144 * x;
                        l2= 0.0006 * l1;
                        l3= x;
                        l4= 3.281 * l1;
                        break;
                    }

                    case 4: {
                        l1= 0.3048 * x;
                        l2= 0.0006 * l1;
                        l3= 1.094 * l1;
                        l4= x;
                        break;
                    }

                    default : {
                        System.out.println("Некорректный ввод");
                        return;
                    }
                }
                System.out.printf("Метры: %f\n", l1);
                System.out.printf("Мили: %f\n", l2);
                System.out.printf("Ярды: %f\n", l3);
                System.out.printf("Футы: %f\n", l4);

                break;
            }

            default : {
                System.out.println("Некорректный ввод");
                return;
            }
        }

        return;

    }
}