package com.lankin.FactoryMethods.CarService.Persons;

import com.lankin.FactoryMethods.CarService.WorkType;

public class ServiceFactory {
    public ServiceStaff service (WorkType type){
        ServiceStaff serviceStaff = null;
        switch (type) {

            case CHANGTAIR:
            case DIAGNOSTIC:
            case REPAIR:
                    serviceStaff = new Master();
                    break;
            case WASH:
                serviceStaff = new Washer();
                break;
        }



        return serviceStaff;



    }
}
