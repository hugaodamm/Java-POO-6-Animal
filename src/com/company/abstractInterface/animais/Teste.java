package com.company.abstractInterface.animais;

public class Teste {
    public static void main(String[] args) {
        Vaca vaca = new Vaca();
        Gato gato = new Gato();
        Cachorro cachorro = new Cachorro();

        vaca.comerAnimal(gato);
    }
}
