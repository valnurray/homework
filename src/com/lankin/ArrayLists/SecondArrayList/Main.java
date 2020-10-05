package com.lankin.ArrayLists.SecondArrayList;

//Let`s make party to kill boss (bad gay)

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
     //Create our characters
        RoboBuffer buffer = new RoboBuffer("Buffi", 99);
        RoboBuffer bufferer = new RoboBuffer("Guffi", 118);
        RoboDamageDiller damageDiller = new RoboDamageDiller("Damage", 100);
        RoboDamageDiller anotherDamageDiller = new RoboDamageDiller("DamageDiller", 117);
        RoboHealler healler = new RoboHealler("Heal", 87);
        RoboHealler healler2 = new RoboHealler("Healer", 98);
        RoboTank tank = new RoboTank("Tank", 98);
        RoboTank tanker = new RoboTank("Tanker", 109);
     //Create Boss
        RoboBoss boss = new RoboBoss("Enemy", 120);

        ArrayList<Robots> party = new ArrayList<>();
        //Create party with heroes who will kill the boss
        addedCharactersToParty(buffer, damageDiller, healler, tank, party);
        //We must chek characters in party
        chekAnyCharactersInParty(buffer, damageDiller, healler, tank, party);
        //Let`s FIGHT!
        party.add(boss);
        //Oh nooo, this boss too strong fo this party!!
        party.remove(tank);
        party.remove(damageDiller);
        party.clear();
        //everyone is dead, we need help!
        //Lets check where is the boss!
        System.out.println(party.indexOf(boss));
        //Try added stronger characters
        CreateNewParty(bufferer, anotherDamageDiller, healler2, tanker, party);
        //Lets chek who is there
        CheckWhoInParty2(party);
        //Let`s FIGHT!
        party.add(boss);

        //he is defeated!!!
        party.remove(boss);
        //chek
        CheckWhoInParty2(party);



    }

    private static void CheckWhoInParty2(ArrayList<Robots> party) {
        for(int i = 0; i< party.size(); i++){
            System.out.println(party.get(i));
        }
    }

    private static void CreateNewParty(RoboBuffer bufferer, RoboDamageDiller anotherDamageDiller, RoboHealler healler2, RoboTank tanker, ArrayList<Robots> party) {
        party.add(tanker);
        party.add(healler2);
        party.add(anotherDamageDiller);
        party.add(bufferer);
    }

    private static void chekAnyCharactersInParty(RoboBuffer buffer, RoboDamageDiller damageDiller, RoboHealler healler, RoboTank tank, ArrayList<Robots> party) {
        if (party.isEmpty()) {
            System.out.println("Hey, you didnt add characters!");
        }else {
            checkPartyToRightComposition(buffer, damageDiller, healler, tank, party);
        }
    }

    private static void checkPartyToRightComposition(RoboBuffer buffer, RoboDamageDiller damageDiller, RoboHealler healler, RoboTank tank, ArrayList<Robots> party) {
        if (party.contains(tank) && party.contains(healler) && party.contains(buffer) && party.contains(damageDiller) ){
            System.out.println("Ready to fight");
        }else{
            System.out.println("pls, add character");
        }
    }

    private static void addedCharactersToParty(RoboBuffer buffer, RoboDamageDiller damageDiller, RoboHealler healler, RoboTank tank, ArrayList<Robots> party) {
        party.add(buffer);
        party.add(damageDiller);
        party.add(healler);
        party.add(tank);
    }
}
