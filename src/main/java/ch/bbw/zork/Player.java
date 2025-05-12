package ch.bbw.zork;


import java.util.ArrayList;

public class Player {
    private ArrayList<Item> inventory = new ArrayList<>(); // Variable namens inventory Typ ist eine Arrayliste die Item Objekte speichern kann | Ist privat und erstellt eine neue Arrayliste in der man Item Objekte speichern kann.
    private int maxWeight = 10;
    private int currentWeight = 0;

    public void takeItem(Item item) { // Public Methode ohne Rückgabe| nimmt ein objekt "item" von der Klasse oder Typ genannt Item als Parameter
        if (currentWeight + item.getWeight() > maxWeight) { // Wenn das aktuelle Gewicht + das gewicht des Items grösser ist also das maximal gewicht
            System.out.println("❌ Du kannst " + item.getName() + " nicht aufnehmen – zu schwer!");
        }
        else { // Wann das so nicht stimmt beim if dann:
            inventory.add(item); // das "item" Objekt wird hinzugefügt zu der ArrayListe "inventory", übrigens bei array listen immer ".add"
            currentWeight += item.getWeight(); // currentWeight wird geändert zu einem neuen Gewicht also currentWeight = currentWeight + item.getWeight also das Gewicht des Items
            System.out.println("Du hast \"" + item.getName() + "\" aufgenommen."); // Diese TextAusgabe | "getName()" eine Methode aus der Item Klasse | der Backslash also \ steht für einen Zeilenumbruch oder Abstand
        }
    }

    public String showInventory() { // Public Methode | Gibt einen String zurück | Namens "showInventory"
        if (inventory.isEmpty()) { // Wenn die Array Liste "inventory" leer ist dann:
            return "Dein Inventar ist leer."; // Diese Rückgabe als String
        }
        StringBuilder builder = new StringBuilder("Dein Inventar:\n"); // Stringbuilder ist eien Java Klasse mit der man mehrere Stringszusammensetzen kann | Also builder ist vom Typ StringBuilder | builder hat den Wert von einem neuen Stringbuilder mit bis jetzt einem kleinen Text und Zeilenabstand
        for (Item item : inventory) { // Für jedes Objekt "item" von der Klasse/Typ "Item" im inventory also der Arrayliste:
            builder.append("- ").append(item).append("\n"); // Zu dem StringBuilder "builder" wird hinzugefügt das hier also z.B - schluessel  dann Zeilenumbruch
        }
        builder.append("Gesamtgewicht: ").append(currentWeight).append(" /").append(maxWeight).append(" kg\n"); // Das wird ebenfalls noch zum StringBuilder "builder" hinnzugefügt sieht dann so aus beispielsweise -> Gesamtgewicht: 2 / 5 kg
        return builder.toString(); // Ganzer zusammengesetzter String also der "builder" zu einem String zurückgeben
    }

    public ArrayList<Item> getInventory() { // Public Methode | gibt eine Array Liste zurück mit Item Objekten
        return inventory; // gibt das inventory zurück also die array liste
    }

    public void removeItem(Item item) { // Public Methode | Ohne Rückgabe | bekommt ein item Objekt von dem Typ Item
        inventory.remove(item); // enfernt aus dem inventory also aus der ArrayListe das item
        currentWeight-= item.getWeight(); // currentWeight wird kleiner also currentWeight = currentWeight - item.getWeight(Gibt das Gewicht des item zurück)
    }

}
