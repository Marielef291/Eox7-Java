package org.example.Exo7_zoo;

public class Lion extends Animal {
    private String nom;
    private int age;

    public Lion(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    @Override
    public void manger() {

    }

    @Override
    public void dormir() {

    }

    @Override
    public void faireDuBruit() {

    }

    @Override
    public String toString() {
        return super.getClass().getSimpleName() +
                ", nom=" + nom +", age ="+age;
    }
}
