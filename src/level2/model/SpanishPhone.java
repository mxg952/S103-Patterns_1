package level2.model;

public class SpanishPhone implements Phone{

    private String phoneNumber;

    public SpanishPhone (String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getPhoneNumber() {
        return "Phone number: +34 " + this.phoneNumber;
    }
}
