package com.company.abstractInterface.animais;

public class Gato extends Animal implements Carnivoro{

    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("miau");
    }

    @Override
    public void comerMeat() {
        System.out.println("Comendo");
    }

}
