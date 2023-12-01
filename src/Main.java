import java.util.HashSet;
import java.util.Iterator;

//Scrivere una funzione che restituisca un hashset riempito
//Creare un oggeto dello stesso tipo inserito nell'HashSet e popolarlo
//Scorrere il set, per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo
// Svuotare l'hashset, verificarlo e stampare il risultatopublic
 class Main {
    public static void main(String[] args) {
        HashSet<Character> vocales = new HashSet<Character>();

        vocales.add('a');
        vocales.add('e');
        vocales.add('i');
        vocales.add('o');
        vocales.add('u');
        System.out.println(vocales);
        verificareHash(vocales);
        System.out.println("Dopo della rimozzione do 'o' :"+ vocales);
        verificareSet(vocales);
    }

    public static void verificareHash(HashSet<Character> hashSet) {
        HashSet<Character> oggettoPopolato = new HashSet<>();
        oggettoPopolato.add('o');

        Iterator<Character> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            Character vocale = iterator.next();
            if (vocale.equals('o')) {
                iterator.remove();
            }

        }
    }

    public static void verificareSet(HashSet<Character> hashSet) {
    hashSet.clear();
    if (hashSet.isEmpty()) {
        System.out.println("è vuoto");
    } else {
        System.out.println("non è vuoto");
    }
    }
 }