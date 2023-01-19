public class Iphone extends Person{
    public boolean hasIphone;

    public Iphone(String firstName, String lastName, String phoneNumber, boolean hasIphone)
    {
        super(firstName,lastName, phoneNumber);
        this.hasIphone = hasIphone;
    }
    public String toString()
    {
        return getFirstName() + getLastName() + " - " + "#" + getPhoneNumber();
    }

}
