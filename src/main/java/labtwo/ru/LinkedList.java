package labtwo.ru;

import java.util.*;

public class LinkedList {

    public static void main(String[] args) {

        List<String> keyboardMusicalInstrument = new ArrayList<>(10);
        keyboardMusicalInstrument(keyboardMusicalInstrument);

        System.out.println("Коллекция. Класс LinkedList");
        System.out.println("1. Создание двусвязанного списка объектов ссылочного типа String:");
        List<String> stringedMusicalInstruments = new java.util.LinkedList<>();
        System.out.println("\t двусвязанный список stringedMusicalInstruments создан");

        System.out.println("2. Добавление в двусвязанный список несколько символьных строк:");
        stringedMusicalInstruments.add("Скрипка");
        stringedMusicalInstruments.add("Виолончель");
        stringedMusicalInstruments.add("Гиджак");
        stringedMusicalInstruments.add("Кеманча");
        stringedMusicalInstruments.add("Арфа");
        stringedMusicalInstruments.add("Гусли");
        stringedMusicalInstruments.add("Гитара");
        stringedMusicalInstruments.add("Балалайка");
        stringedMusicalInstruments.add("Укулеле");
        System.out.println("\t в двусвязанный список stringedMusicalInstruments добавлено 10 объектов");

        System.out.println("3. Выполнение прямого перебора коллекции используя iterator: ");
        Iterator<String> iterator = stringedMusicalInstruments.iterator();
        while (iterator.hasNext()) {
            System.out.println("\t Музыкальный инструмент: " + iterator.next());
        }

        System.out.println("4. Выполнение обратного перебора коллекции используя ListIterator: ");
        ListIterator<String> listIterator = (ListIterator<String>)iterator;
        listIterator.add("Цимбалы");
        while (listIterator.hasPrevious()) {
            System.out.println("\t Музыкальный инструмент: "+ listIterator.previous());
        }

        System.out.println("5. Добавление всех элементов коллекции keyboardMusicalInstruments " +
                "(списочный массив ArrayList) в коллекцию stringedMusicalInstruments (двусвязанный список LinkedList):");

        stringedMusicalInstruments.addAll(keyboardMusicalInstrument);
        for (String stringedInstrument : stringedMusicalInstruments) {
            System.out.println("\t" + stringedInstrument);
        }

        System.out.println("6. Удаление всех элементов коллекци stringedMusicalInstruments");
        stringedMusicalInstruments.clear();

        System.out.println("7. Определение, является ли коллекция stringedMusicalInstruments пустой: ");
        System.out.println("Коллекция stringedMusicalInstruments является пустой: " + stringedMusicalInstruments.isEmpty());
    }

    static void keyboardMusicalInstrument(List<String> keyboardMusicalInstrument) {
        keyboardMusicalInstrument.add("Клавир");
        keyboardMusicalInstrument.add("Рояль");
        keyboardMusicalInstrument.add("Клавесин");
        keyboardMusicalInstrument.add("Клавикорд");
        keyboardMusicalInstrument.add("Верджинел");
        keyboardMusicalInstrument.add("Орган");
        keyboardMusicalInstrument.add("Спинет");
        keyboardMusicalInstrument.add("Фортепиано");
        keyboardMusicalInstrument.add("Аккордион");
        keyboardMusicalInstrument.add("Пианино");
    }
}
