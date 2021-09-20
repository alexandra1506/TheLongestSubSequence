package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Cамая длинная последовательность

1. Создай список чисел.
2. Добавь в список 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.

Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
3

Искомое значение равно 3, т.к. самая длинная последовательность повторяющихся чисел состоит из трех четверок.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //заполняем лист
        for (int i = 0; i < 10; i++){
            int num = Integer.parseInt(reader.readLine());
            list.add(num);
        }
        int counter = 1;
        int counterMax = 1;
        //проходим по нему и проверяем кол-во одинаковых элементов подряд
        for(int i = 0 ; i < list.size() - 1; i++){
            if(list.get(i).equals(list.get(i+1))){
                counter++;
                if(counter > counterMax) counterMax = counter;
            }
            else{
                counter = 1;
            }
        }
        System.out.println(counterMax);

    }
}
