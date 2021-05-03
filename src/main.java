

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.Arrays;

class Calc{
    public int CalcInt(int i) {
        Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
        boolean r = true;
        while (r) {
            System.out.println("Введите целое число от 1 до 100: ");
            if (sc.hasNextInt()) { // возвращает истину если с потока ввода можно считать целое число
                i = sc.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную
                //System.out.println("вы ввели число: " + i);
                if (i < 101 && i > 0){
                    r = false;
                    System.out.println("Вы ввели правильное число. ");}
                    else
                        System.out.print("вы ввели не правильное число ");

                }
             else {
                sc.next();
                System.out.print("Вы ввели не число. ");

            }
        }
        return i;

    }}


class MyArrayNew {
    public static void main(String[] args) throws IOException {
        Calc i= new Calc();
        int x=i.CalcInt(0);

//Объявляем массив целых числе где нечетные индексы воодит пользователь, а нечетные формируются рандомно
        System.out.println("Давайте создадим массив с такой длинной и введем нечетные индексы");
        int[] array=new int[x];
        for(int z=0;z<x;z++){
            if(z%2!=0){
            int power= i.CalcInt(0);
                array[z]=power;}
            else{
                int random= (int) (Math.random()*z*10);
                array[z]=random;
            }
           }
        for (int t = 0; t < x; t++) {
            System.out.print(array[t] +"-" );
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
//записываем полученный массив в файл
        PrintWriter writer = new PrintWriter("arrays.txt", StandardCharsets.UTF_16);
        writer.println(Arrays.toString(array));
        writer.close();

    }}
