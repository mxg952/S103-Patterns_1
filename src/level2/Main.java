package level2;

import level2.app.Agenda;
import level2.factory.ContactFactory;
import level2.factory.SpanishContactFactory;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        ContactFactory spanishFactory = new SpanishContactFactory();
        agenda.addContact(spanishFactory, "Carrer Marin 125", "Barcelona", "08048", "612345678");

        agenda.showContacts();

    }}
