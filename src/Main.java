import Array.Simple;
import Array.SimpleArray;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static <E> void main(String[] args) {

        {
            List<Cat> list = new ArrayList<>();
            Cat cat1 = new Cat("Барсик");
            Cat cat2 = new Cat("Пушок");

            list.add(cat1);
            list.add(cat2);

            Cat cat1FromCollection = list.get(0);
            Cat cat2FromCollection = list.get(1);

            System.out.println(cat1FromCollection);
            System.out.println(cat2FromCollection);

            boolean remove = list.remove(cat1);
            System.out.println(remove);
        }
        {
            LinkedList<Dog> list = new LinkedList<>();

            Dog dog1 = new Dog("Рэкс");
            Dog dog2 = new Dog("Мухтар");

            list.add(dog1);
            list.add(dog2);

            Dog cat1FromCollection = list.get(0);
            Dog cat2FromCollection = list.get(1);

            System.out.println(cat1FromCollection);
            System.out.println(cat2FromCollection);

            boolean remove = list.remove(dog2);
            System.out.println(remove);

        }
        {
            SimpleArray<String> strings = new SimpleArray<>();
            strings.add("first");
            strings.add("second");
            strings.add("third");
            strings.add("fourth");
            System.out.println(strings.get(0));
            System.out.println(strings.size());
            strings.update(1, "zero");
            System.out.println(strings.get(1));
            strings.delete(2);
            System.out.println(strings.get(2));
            strings.add("123");
            strings.add("456");
            strings.add("789");
        }

        {
            SimpleLinked<String> stringLinked = new SimpleLinked<>();
            stringLinked.addLast("blue");
            stringLinked.addLast("red");
            System.out.println(stringLinked.size());
            System.out.println(stringLinked.getElementByIndex(1));
            stringLinked.addFirst("white");
            System.out.println(stringLinked.getElementByIndex(0));
            stringLinked.addFirst("green");
            stringLinked.addLast("black");
            stringLinked.addLast("pink");
            for (String s : stringLinked) {
                System.out.println(s);
            }


        }
    }
}





