package com.lankin.FactoryMethods.CarService;

import com.lankin.FactoryMethods.CarService.Persons.Client;
import com.lankin.FactoryMethods.CarService.Persons.ServiceFactory;
import com.lankin.FactoryMethods.CarService.Persons.ServiceStaff;

public class ServiceCar {
    public static void main(String[] args) {
        Client client = new Client();
        ServiceFactory serviceFactory = new ServiceFactory();
        String order = client.doSomeThing();
        WorkType work = getWork(order);
        ServiceStaff serviceStaff =  serviceFactory.service(work);
        System.out.println(serviceStaff.work(work));

    }
    private static WorkType getWork(String order){
        switch (order){
            case "ChangeTair":
                return WorkType.CHANGTAIR;
            case "Diagnostic":
                return WorkType.DIAGNOSTIC;
            case "Repair":
                return WorkType.REPAIR;
            case "Wash":
                return WorkType.WASH;

        }
        return null;
    }
}
