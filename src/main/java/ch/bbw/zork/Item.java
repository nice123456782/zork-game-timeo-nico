package ch.bbw.zork;

public class Item {
    private String name; // Privates String Attribut namens "name" für den Namen des Items
    private String description; // Privates String Attribut namens "description" für die Beschreibung des Items

    private int weight; // Privates integer Attribut names weight
    public Item(String name, String description, int weight) { // Konstruktor der Public Class Item wird verwendet wenn man die Klasse aufruft | z.B Item schlüssel = new Item("Schlüssel", "Ein alter rostiger Schlüssel"); | "Schlüssel" wird in name gespeichert und man muss halt sagen name ist ein string
        this.name = name; // Eingebener Name wird in this.name gespeichert also "name" gespeichert
        this.description = description; // Eingegebene Beschreibung wird in this.description also "description" gespeichert
        this.weight = weight; // Eingegebenes Gewicht "weight" wird in this.weight also "weight" Attribut gespeichert.
    }

    public String getName() { // Mit dieser Getter Methode kann man von ausserhalb dieser Klasse den Namen abfragen halt nicht direkt weil ja name private ist darum diese getter methode
        return name; // name wird zurückgegeben
    }

    public int getWeight() { // Mit cieser Getter Methoder kann man von ausserhalb dieser Klasse das Gewicht abfragen halt nicht direkt weil ja weight attribut privat ist darum diese getter methode
        return weight; // weight attribut wird zurückgegeben
    }

    public String getDescription() { // Mit dieser Getter Methode kann mann von ausseralbt dieser Klasse die Beschreiben abfragen halt wieder nicht direkt weil ja descripition privat ist
        return description; // beschreibung wird zurückgegeben
    }

    @Override // Man überschreibt die Methode toString aus der Klasse Object
    public String toString() { // öffentliche toString Methode, die ein String zurückgibt
        return name + ": " + description + " (Gewicht: " + weight + ")"; // return den namen: beschreibung
    } // Diese to String Methode ist wichtig und wir immer nur bei Textaufrufen verwendet bsp: Item schlüssel = new Item("Schlüssel", "Ein alter Schlüssel");
        //System.out.println(schlüssel); dann wird diese toString Methode verwendet
}
