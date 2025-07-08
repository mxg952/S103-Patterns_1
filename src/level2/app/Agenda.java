package level2.app;

import level2.factory.ContactFactory;
import level2.model.Address;
import level2.model.Phone;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Address> addresses = new ArrayList<>();
    private List<Phone> phoneNumbers = new ArrayList<>();

    public void addContact (ContactFactory factory, String street, String city, String postalCode, String phoneNumber ) {
        addresses.add(factory.createAddress(street, city, postalCode));
        phoneNumbers.add(factory.createPhone(phoneNumber));
    }

    public void showContacts() {
        for (int i = 0; i < addresses.size(); i ++){
            System.out.println(addresses.get(i).getFullAddress());
            System.out.println(phoneNumbers.get(i).getPhoneNumber());
        }
    }
}
