package com.lankin.FactoryMethods.CarService.Persons;

import com.lankin.FactoryMethods.CarService.WorkType;

public class Washer extends Person implements ServiceStaff {
    @Override
    public String doSomeThing() {
        return null;
    }

    @Override
    public String work(WorkType type) {
        return type.name();
    }
}
