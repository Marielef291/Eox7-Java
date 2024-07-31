package org.example.Exo7_zoo;

public class Elephant extends Animal {
    private String nom;
    private int age;
    private float poids;

    public Elephant(String nom, int age, float poids) {
        this.nom = nom;
        this.age = age;
        this.poids = poids;
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
                ", nom=" + nom +", age ="+age+", poids ="+poids;
    }
}
