public class Main {
    public static void main(String[] args) {
        Business contact1 = new Business("Ned", "ned@gmail.com");
        Number number1 =  new Number("John", "123-234-2454");
        contact1.contact();
        number1.contact();


    }
}

abstract class Contact {
    private String name;

    public Contact(String name) {
        this.name = name;
    }

    abstract public void contact();

}

class Business extends Contact {
    private String email;

    public Business(String name, String email) {
        super(name);
        this.email = email;
    }

    @Override
    public void contact() {
        System.out.println("Email: " + email);
    }
}

class Number extends Contact {
    private String number;

    public Number(String name, String number) {
        super(name);
        this.number = number;
    }

    @Override
    public void contact() {
        System.out.println("Calling: " + number);
    }
}