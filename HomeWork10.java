package Dz3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class HomeWork10 {
    public static void main(String[] args) {
        ArrayList<String> strings=new ArrayList<>();
        strings.add("Привет");
        strings.add("меня ");
        strings.add("зовут");
        strings.add("массив");

        strings.add(2,"не");


        for (String str:strings)
        {
            System.out.println(str);
        }


        LinkedList<String> linkedStrinds=new LinkedList<>();
        linkedStrinds.add("Привет");
        linkedStrinds.add("меня ");
        linkedStrinds.add("зовут");
        linkedStrinds.add("массив");

        linkedStrinds.add(2,"не");

        for (String str:linkedStrinds)
        {
            System.out.println(str);
        }

        Iterator<String> iterator = new Iterator<String>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public String next() {
                return null;
            }
        };
        ArrayList<DOG> dogs = new ArrayList<>();
        for (int i = 1; i <100; i++) {
            DOG dog=new DOG();
            dog.height=i;
            dogs.add(dog);
        }
        DogSC dogSC = new DogSC();
        dogSC.scanDogs(dogs);

    }
}



