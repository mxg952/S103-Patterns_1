package level2.factory;

import level2.model.Address;
import level2.model.Phone;
import level2.model.SpanishAddress;
import level2.model.SpanishPhone;

public class SpanishContactFactory implements ContactFactory {

    @Override
    public Address createAddress(String street, String city, String postalCode) {
        return new SpanishAddress(street, city, postalCode);
    }

    @Override
    public Phone createPhone(String number) {
        return new SpanishPhone(number);
    }
}
