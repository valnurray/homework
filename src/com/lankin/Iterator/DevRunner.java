package com.lankin.Iterator;

public class DevRunner {
    public static void main(String[] args) {
        String[] skills = {"Java", "SQL", "Maven", "Spring", "Hibernate"};

        Dev dev = new Dev("Nikita", skills);

        Iterator<E> iterator = dev.getIterator();

        System.out.println("Developer - " + dev.getName());
        System.out.println("Skills: " );

        while (iterator.hasNext()){
            System.out.print(iterator.next().toString() + " ");
        }
    }
}
