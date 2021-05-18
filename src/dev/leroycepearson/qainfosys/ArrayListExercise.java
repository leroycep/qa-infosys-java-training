package dev.leroycepearson.qainfosys;

import java.util.ArrayList;

class ArrayListExercise {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList();

        al.add("Hello");
        al.add("Lovely");
        al.add("World");

        System.out.println(al);
        for (int i = 0; i < al.size(); i += 1) {
            String word = al.get(i);
            System.out.println(word);
        }

        System.out.println(al.get(2));
        System.out.println(al.get(1));
        System.out.println(al);

        al.set(0, "Greetings");
        al.set(1, "Beautiful");
        System.out.println(al);

        al.remove(1);
        System.out.println(al);
    }

}
