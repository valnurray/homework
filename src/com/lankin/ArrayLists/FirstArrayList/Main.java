package com.lankin.ArrayLists.FirstArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pets> list = new ArrayList<>();

       Cats cat = new Cats();
       Cats cat2 = new Cats();
       cat.setName("Vasya");
       cat2.setName("Vasilisa");

       Birds bird = new Birds();
       bird.setName("Kesha");

       Rats rat = new Rats();
       rat.setName("Splinter");

       Dogs dog = new Dogs();
       dog.setName("Rex");

        addedPets(list, cat, bird, rat, dog); // TODO: this №4

        printListIfIsNotEmpty(list); // TODO: this №1,2,6
        //Выводим на печать если лист не пустой
        tryToFindKesha(list, bird); // TODO: this №3
        //Ищем Кешу, если нету говори что Кеша улетел
        list.remove(bird);         // TODO: this №4
        //Удаляем Кешу, пусть полетает
        tryToFindKesha(list, bird);
        //Опять ищем Кешу, его тут уже нет, он летает
        list.clear(); // TODO: this №5
        //Вы свободны, идите гулять вслед за Кешой
        printListIfIsNotEmpty(list);
        //ПРоверяем Лист, а там никого
        addedPets(list, cat, bird, rat, dog);
        //Все погуляли, давайте назад в Лист
        printListIfIsNotEmpty(list);
        //А Кеша где?
        System.out.println(list.indexOf(bird));
    }

    private static void addedPets(ArrayList<Pets> list, Cats cat, Birds bird, Rats rat, Dogs dog) {
        list.add(cat);
        list.add(bird);
        list.add(rat);
        list.add(dog);
    }

    private static void printListIfIsNotEmpty(ArrayList<Pets> list) {
        if (list.isEmpty()){
             System.out.println("pls add somebady");

         } else {
            for (int i = 0; i < list.size(); i++){
                System.out.println(list.get(i));
            }
         }
    }

    private static void tryToFindKesha(ArrayList<Pets> list, Birds bird) {
        if (list.contains(bird)){
            System.out.println("Kesha is her");
        }else {
            System.out.println("That bird fly away");
        }
    }

}
