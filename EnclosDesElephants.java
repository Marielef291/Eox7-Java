package org.example.Exo7_zoo;

public class EnclosDesElephants implements Enclos{
    private final Elephant[] elephants = new Elephant[20];

    @Override
    public void ajouterAnimal(Animal animal) {
        for (int i = 0; i < elephants.length - 1; i++) {
            if (elephants[i] == null) {
                elephants[i] = (Elephant) animal;
                System.out.println("Elephant ajouté");
                return;
            }
        }
        System.out.println("Nous avons plus de 20 Elephants");
    }

    @Override
    public void afficherAnimaux() {
        for (Elephant elephant : elephants) {
            System.out.println(elephant.toString());
        }
    }
}
