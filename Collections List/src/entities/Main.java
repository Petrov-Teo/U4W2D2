package entities;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
        ArrayList<String> list = new ArrayList<>();
        list.add("Mela");
        list.add("Banana");
        list.add("Arancia");

        for (String fruit : list) {
            System.out.println(fruit);
        }
        LinkedList<String> list2 = new LinkedList<>();
        list2.add("mela");
        list2.add("pera");
        list2.add("Arancia");
        list2.add("Cocomero");

        for (String fruit2 : list2) {
            System.out.println(list2);
        }
        HashSet<String> set = new HashSet<>();
        set.add("Mela");
        set.add("Banana");
        set.add("cocomero");

        for (String fruit3 : set) {
            System.out.println(fruit3);

        }
        System.out.println("la dimensione del HashSet è:" + set.size());
        set.remove("cocomero");
        System.out.println(set.size());
        for (String fruit3 : set) {
            System.out.println(fruit3);
        }
                 */
        User aldo = new User("Aldo", "Baglio", 20);
        User giovanni = new User("Giovanni", "Storti", 30);
        User giacomo = new User("Giacomo", "Proietti", 40);
        ArrayList<User> userList = new ArrayList<>();

        System.out.println("la lista User è lunga:" + userList.size());
        userList.add(aldo);
        userList.add(giovanni);
        userList.add(1, giacomo);
        userList.add(new User("Pino", "Daniele", 50));
        System.out.println("la lista User è lunga:" + userList.size());

        for (User users : userList) {
            System.out.println(users);
        }
        System.out.println(userList);
        try {
            User found = userList.get(1);
            System.out.println(found);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("La lista non è così lunga");
        }
        System.out.println("L'indicie di Giovanni è: " + userList.indexOf(giovanni));


        if (userList.contains(aldo)) {
            System.out.println("la lista contiene Aldo");
        } else {
            System.out.println("La lista non contiene Aldo");
        }
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(0, 7);
        numbers.add(55);


        System.out.println(numbers);
        //_________________________________________________________________________________
        ArrayList<String> lettere = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e"));

        System.out.println(lettere);
/*
        for (String lettera : lettere) {
            if (lettera.equals("d")) lettere.remove(lettera);
            else System.out.println(lettera);
        }
        */


// SAREBBE MEGLIO USARE GLI ITERATORI
        Iterator<String> iterator = lettere.iterator();
        while (iterator.hasNext()) {
            String letteraCorrente = iterator.next();
            if (letteraCorrente.equals("d")) iterator.remove();
            else System.out.println(letteraCorrente);

        }

        System.out.println(lettere);


        // *************************************************** SET **************************************
// non permette i duplicati, per ogni inserzione effettua un controllo, per cio ha un costo di performance;
        HashSet<User> userSet = new HashSet<>(); // non tiene in considerazione l'ordine di inserzione;
        userSet.add(aldo);
        userSet.add(giovanni);
        userSet.add(giacomo);
        userSet.add(aldo);
        System.out.println(userSet);


        LinkedHashSet<User> userLinkedHashSet = new LinkedHashSet<>(); // in questo caso mantiene l'ordine di inserzione
        userLinkedHashSet.add(aldo);
        userLinkedHashSet.add(giovanni);
        userLinkedHashSet.add(giacomo);

        try {
            if (userLinkedHashSet.contains(aldo)) {
                System.out.println(aldo + " Già contenente nella lista");
            } else userLinkedHashSet.add(aldo);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println("Errore generico");
        }
        System.out.println(userLinkedHashSet);

        TreeSet<String> alfabeto = new TreeSet<>();//Non consente duplicati ordina pure gli elementi (operazione molto costosa);
        alfabeto.add("d");
        alfabeto.add("a");
        alfabeto.add("r");
        alfabeto.add("t");
        alfabeto.add("s");
        System.out.println(alfabeto);

        TreeSet<User> userTreeSet = new TreeSet<>();
        //Per rendere compatibili oggetti creati da noi con i TreeSet, essi dovranno implementare l'interfaccia Cmparable<User>
        //Implementare l'interfaccia vuol dire dover implementare obbligatoriamente il metodo comparTo, il quale,
        //servirà per il TreeSet per capire come confrontare i due elementi e ordinare
        userTreeSet.add(aldo);
        userTreeSet.add(giacomo);
        userTreeSet.add(giovanni);
        System.out.println(userTreeSet);

        // *************************************************** MEP **************************************
        //Le Map sono strutture in cui ogni elemento è caratterizzato da una <CHIAVE, VALORE>
        HashMap<Integer, User> usersMap = new HashMap<>();// Add esempio qui sto dichiarando che ogni elemento della Map
        //Sarà rappresentato da una chiave di tipo numerico intero e un valore di tipo User. Ad esempio potrei usarla per salvare
        // e ricercare gli utenti in base al loro id, stinga oppure quello che abbiamo impostato per la chiave.
        //ES
        // 111111 - Aldo Baglio 20
        //222222 - Giacomo Pizzo 35

        usersMap.put(11111, aldo);
        usersMap.put(22222, giacomo);
        usersMap.put(33333, giovanni);
        System.out.println(usersMap);


        //ES. Dizionario
        HashMap<String, String> dizionario = new HashMap<>();
        dizionario.put("Albero", "questa è la definizione della parola albero bla bla bla");
        dizionario.put("Fiore", "questa è la definizione della parola fiore");
        dizionario.put("Sedia", "questa è la definizione della parola sedia");
        dizionario.put("Divano", "questa è la definizione della parola divano");
        System.out.println(dizionario);
        //***************************************************** LEGGERE ELEMENTI **********************************

        System.out.println("la definizione della parola Albero è: " + dizionario.get("Albero")); // la chiave serve per accedere
        //agli elementi in lettura, scrittura e rimozione
        //***************************************************** RIMPIAZARE ELEMENTI **********************************
        dizionario.replace("Albero", "Una definizione più aggiornata di albero bla bla bla");
        System.out.println("la definizione della parola Albero è: " + dizionario.get("Albero"));

        //***************************************************** RIMUOVERE ELEMENTI **********************************

        dizionario.remove("Albero");
        System.out.println(dizionario);

        Set<String> chiavDizionario = dizionario.keySet();
        System.out.println(chiavDizionario);
    }


}