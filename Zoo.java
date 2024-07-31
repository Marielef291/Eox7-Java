package org.example.Exo7_zoo;

public class Zoo {
    private final EnclosDesLions[] enclosDesLions = new EnclosDesLions[5];
    private final EnclosDesElephants[] enclosDesElephants = new EnclosDesElephants[5];
//    private final Lion[] lions = new Lion[20];
//    private final Elephant[] elephants = new Elephant[20];
    private final Animal[] animals = new Animal[20];


    public void ajouterLion(String nom, int age) {
        Lion lion = new Lion (nom, age);
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                animals[i] = (Lion) lion;
                System.out.println("Lion ajouté au zoo");
                return;
            }
        }
        System.out.println("Nous avons plus de 20 animaux");
    }

    public void creerElephant(String nom, int age, float poids){
        Elephant elephant = new Elephant(nom, age, poids);
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                animals[i] = (Elephant) elephant;
                System.out.println("Elephant ajouté au zoo");
                return;
            }
        }
        System.out.println("Nous avons plus de 20 animaux");
    }

    public void creerEnclosLion(){
        EnclosDesLions enclosDesLion = new EnclosDesLions();

        for (int i = 0; i < enclosDesLions.length - 1; i++) {
            if (enclosDesLions[i] == null) {
                enclosDesLions[i] = (EnclosDesLions) enclosDesLion;
                System.out.println("Enclos des Lion ajouté");
                return;
            }
        }
        System.out.println("Nous avons plus de 5 enclos pour les lions");
    }

    public void creerEnclosElephant(){
        EnclosDesElephants enclosDesElephant = new EnclosDesElephants();

        for (int i = 0; i < enclosDesElephants.length - 1; i++) {
            if (enclosDesElephants[i] == null) {
                enclosDesElephants[i] = (EnclosDesElephants) enclosDesElephant;
                System.out.println("Enclos des Lion ajouté");
                return;
            }
        }
        System.out.println("Nous avons plus de 5 enclos pour les Elephants");
    }

    public void ajoutDansEnclos(int indexEnclos, int indexAnimal){
        if (indexAnimal >= 0 && indexAnimal < 20) {
            if (animals[indexAnimal] instanceof Lion) {
                if (indexEnclos >= 0 && indexEnclos < 5) {
                    enclosDesLions[indexEnclos].ajouterAnimal(animals[indexAnimal]);
                }
            }else{
                if (indexEnclos >=0 && indexEnclos<20){
                    enclosDesElephants[indexEnclos].ajouterAnimal(animals[indexAnimal]);
                }
            }
        }
    }

    public void visualiserEnclos(int groupe, int enclos){
        if (groupe==1){
            enclosDesLions[enclos].afficherAnimaux();
        }else {
            enclosDesElephants[enclos].afficherAnimaux();
        }
    }



}
