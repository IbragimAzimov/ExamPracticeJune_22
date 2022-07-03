package practice_3;

import java.util.ArrayList;

public class Main3 {

    public static void main(String[] args) {

        Backpack backpack1 = new Backpack(1, "a book", "20 apples", "Coca Cola");
        Backpack backpack2 = new Backpack(2, "a folder", "50 tennis balls", "a bottle with water");
        Backpack backpack3 = new Backpack(3, "a folder", "10 apples and 3 tennis balls", "Coca Cola");

        ArrayList<Backpack> backpacks = new ArrayList<Backpack>();
        backpacks.add(backpack1);
        backpacks.add(backpack2);
        backpacks.add(backpack3);

        System.out.println(backpack1.toString());
        System.out.println(backpack2.toString());
        System.out.println(backpack3.toString());

    }
}
