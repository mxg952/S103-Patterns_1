package level2.model;

public class SpanishAddress implements Address {

    private String street, city, postalCode;
    public SpanishAddress(String street, String city, String postalCode) {
        this.city = city;
        this.street = street;
        this.postalCode = postalCode;
    }

    @Override
    public String getFullAddress() {
        return "Address: " + this.street + "," + this.postalCode + "," + this.city + ", Spain";
    }
}
