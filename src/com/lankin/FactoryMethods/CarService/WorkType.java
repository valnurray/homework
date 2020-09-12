package com.lankin.FactoryMethods.CarService;

public enum WorkType {
    CHANGTAIR("Change tairs"),
    DIAGNOSTIC("Diagnostic your car"),
    REPAIR("Repair your car"),
    WASH("Wash your car");

    private String massage;
    WorkType(String massage){
        this.massage = massage;
    };
}
