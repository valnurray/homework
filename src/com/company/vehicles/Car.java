package com.company.vehicles;

import com.company.details.*;
import com.company.professions.*;



/*Класс Car содержит поля - марка автомобиля, класс автомобиля,
вес, водитель типа Driver, мотор типа Engine.
Методы start(), stop(), turnRight(), turnLeft(),
которые выводят на печать: "Поехали", "Останавливаемся", "Поворот направо" или "Поворот налево".
А также метод printInfo(), который выводит полную информацию об автомобиле, ее водителе и моторе.
Создать производный от Car класс  - Lorry (грузовик), характеризуемый также грузоподъемностью кузова.
Создать производный от Car класс - SportCar, характеризуемый также предельной скоростью*/
public class Car {
    public String mark;
    public String ClassAuto;
    public int weight;
    Driver driver1 = new Driver("Васильев Сергей Петрович",20);
    Engine engine1 = new Engine("M52", 220);

    public void start(){
        System.out.println("Поехали");
    }

    public void stop(){
        System.out.println("Останавливаемся");
    }

    public void turnRight(){  System.out.println("Поворот направо"); }

    public void turnLeft(){
        System.out.println("Поворот налево");
    }

    public void printInfo(){

        System.out.println("Марка авто - " + mark + ". Класс авто -  " + ClassAuto + ". Вес авто -  " + weight
                + " кг. Водитель автомобиля - " + driver1.fio + ". Со стажем вождения - " + driver1.stag
                + ". Двигатель этого автомобиля - легендарный " + engine1.engineName + ", мощность которого, целых - "
                + engine1.power);
    }


    class Lorry extends Car{
        public int gruz;

    }
    class SportCar extends Car{
        public int maxSpeed;
    }
    public static void main(String[] args) {
        Car car = new Car();
        car.mark = "BMW";
        car.ClassAuto = "S-class";
        car.weight = 500;

        car.printInfo();
    }
}
