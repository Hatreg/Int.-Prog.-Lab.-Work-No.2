package labtwo.ru;

import java.util.*;

public class CollectionKeyboardMusicalInstrument {

    public static void main(String[] args) {
        int i = 0;

        System.out.println("Коллекция. Класс ArrayList");
        System.out.println("1. Создание списочного массива объектов ссылочного типа String: ");

        List<String> keyboardMusicalInstrument = new ArrayList<>(10);
        System.out.println("\t спиочный массив keyboardMusicalInstruments создан");

        System.out.println("2. Добавление в списочный массив нескольких символьных строк: ");
        LinkedList.keyboardMusicalInstrument(keyboardMusicalInstrument);
        System.out.println("\t в списочный массив keyboardMusicalInstrument добавлено 10 объектов");

        System.out.println("3. Вывод на экран элементов списочного массива используя цикл for: ");
        for(i = 0; i < keyboardMusicalInstrument.size(); i++) {
            System.out.println("\t Наименование клавишного музыкального инструмента №" + (i+1) + ": " + keyboardMusicalInstrument.get(i));
        }

        System.out.println("4. Добавление в списочный массив keyboardMusicalInstrument элемента на позицию по указанному индексу: ");
        keyboardMusicalInstrument.add(10, "Ксилофон");
        System.out.println("\t в списочный массив keyboardMusicalInstruments на позицию 11 добавлен объект 'Ксилофон'");

        System.out.println("5. Вывод на экран элементов списочного массива используя цикл for each: ");

        i = 0;
        for (String keyboardInstrument : keyboardMusicalInstrument) {
            i++;
            System.out.println("\t Название инструмента №" + (i) + ": " + keyboardInstrument);
        }

        System.out.println("6. Присваивание объекта элементу, который находится в списке на позиции по указанному индексу: ");
        keyboardMusicalInstrument.set(3, "Чембало");
        System.out.println("\t элементу, находящемуся в списке на позиции 4, присвоен объект 'Чембало'");

        System.out.println("7. Получение объекта, хранящегося в списочном массиве на позиции по указанному индексу: ");
        System.out.println("\t теперь по индексу 3:" + keyboardMusicalInstrument.get(3));

        System.out.println("8. Получение количества элементов, содержащихся в данный момент в коллекции keyboardMusicalInstrument: ");
        System.out.println("\t кол-во элементов: " + keyboardMusicalInstrument.size());

        System.out.println("9. Проверки, содержит ли коллекция объект Ксилофон: ");

        if (keyboardMusicalInstrument.contains("Ксилофон")) {
            System.out.println("\t коллекция содержит клавишный музыкальный инструмент 'Ксилофон'");
        }

        System.out.println("10. Получение подсписка из списочного массива keyboardMusicalInstrument:");
        List<String> subList = keyboardMusicalInstrument.subList(1,4);
        System.out.println("\t получен подсписок subList: ");

        i = 0;
        for (String keyboardInstrument : subList) {
            i++;
            System.out.println("\t\t музыкальный инструмент №" + i +": " + keyboardInstrument);
        }

        System.out.println("11. Удаление из подсписка объекта ");
        System.out.println("\t до удаления под номером 0: " + subList.get(0));
        subList.remove(0);
        System.out.println("\t после удаления под номером 0: " + subList.get(0));
    }
}
