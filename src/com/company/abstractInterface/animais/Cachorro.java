package com.company.abstractInterface.animais;

public class Cachorro extends Animal implements Carnivoro{

    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("uau");
    }

    @Override
    public void comerMeat() {
        System.out.println("Comendo");
    }


}
