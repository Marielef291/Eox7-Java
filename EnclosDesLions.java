package org.example.Exo7_zoo;

import org.example.Exo5_commercial.Salarie;

public class EnclosDesLions implements Enclos{
    private final Lion[] lions = new Lion[20];


    @Override
    public void ajouterAnimal(Animal animal) {
        for (int i = 0; i < lions.length - 1; i++) {
            if (lions[i] == null) {
                lions[i] = (Lion) animal;
                System.out.println("Lion ajouté à l'enclos");
                return;
            }
        }
        System.out.println("Nous avons plus de 20 Lions");
    }

    @Override
    public void afficherAnimaux() {
        for (Lion lion : lions) {
            if (lion!=null) {
                System.out.println(lion.toString());
            }
        }
    }

}
