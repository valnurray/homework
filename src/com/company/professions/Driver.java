package com.company.professions;



public class Driver  {
    public String fio;
    public int stag;

    public Driver(String fio, int stag) {
        this.fio = fio;
        this.stag = stag;
    }

    public Driver() {
    }

    class Person extends Driver {
        public int age;
        public String nick;

    }
}



