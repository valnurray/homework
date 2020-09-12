package com.lankin.FactoryMethods.CarService.Persons;

import com.lankin.FactoryMethods.CarService.Service.*;

import java.util.Random;

public class Client extends Person {
    @Override
    public String doSomeThing() {
        return makeOrder(getService());
    }
    public String makeOrder(Service service){
        return service.getName();
    }
    private Service getService(){
        Service service = null;
        int random = new Random().nextInt();
        if (random % 2 ==0) {
            service = new ChangeTair();
        }else if (random % 3 ==0){
            service = new Diagnostic();
        }else if (random % 5 ==0){
            service = new Repair();
        }else {
            service = new Wash();
        }
        return service;
    }
}
