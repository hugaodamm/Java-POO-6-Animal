package com.company.abstractInterface.animais;

public abstract class Animal {

    public void emitirSom(){

    }

    public void comerAnimal( Animal animal){
        this.emitirSom();
    }
}
