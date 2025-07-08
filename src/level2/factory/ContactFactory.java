package level2.factory;

import level2.model.Address;
import level2.model.Phone;

public interface ContactFactory {
    Address createAddress(String street, String city, String postalCode);
    Phone createPhone(String number);
}
