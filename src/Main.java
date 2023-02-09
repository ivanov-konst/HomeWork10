import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

// Задание 1
        ArrayList<String> cats = new ArrayList<>();
        cats.add("Cat1");
        cats.add("Cat2");
        cats.add("Cat3");
        for (String str : cats) {
            System.out.println(str);
        }
// Поиск элемента
        System.out.println(cats.get(0));
// Удаление элемента
        cats.remove("Cat1");
        for (String str : cats) {
            System.out.println(str);
        }

        LinkedList<String> dogs = new LinkedList<>();
        dogs.add("Dog1");
        dogs.add("Dog2");
        dogs.add("Dog3");
        for (String str : dogs) {
            System.out.println(str);
        }
// Поиск элемента
        System.out.println(dogs.get(2));
// Удаление элемента
        dogs.remove("Dog2");
        for (String str : dogs) {
            System.out.println(str);
        }


// Задание 2
        CatsLinkedList<String> linkedCats = new CatsLinkedList<>();
//Добавление элекмента
        linkedCats.add("CAT111");
        linkedCats.add("CAT222");
        linkedCats.add("CAT333");
//Добавление элемента в начало списка
        linkedCats.addFirst("CAT000");
//Добавление элемента в начало списка
        linkedCats.addLast("CAT444");
//Поиск элемента по индексу
        System.out.println(linkedCats.get(1));
//Удаление элемента
        linkedCats.remove(1);
        System.out.println(linkedCats.get(1));


// Задание 3
        CatsArrayList<String> arrayCats = new CatsArrayList<>();
//добавление элекмента
        arrayCats.add("CAT1");
        arrayCats.add("CAT2");
        arrayCats.add("CAT3");
//Поиск элемента по индексу
        System.out.println(arrayCats.get(1));
// Удаление элемента
       arrayCats.remove("CAT2");
        // arrayCats.remove(1);
        System.out.println(arrayCats.get(1));

    }
}