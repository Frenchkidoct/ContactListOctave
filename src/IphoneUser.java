public class IphoneUser extends Person{
    public boolean hasIphone;

    public IphoneUser(String firstName, String lastName, String phoneNumber, boolean hasIphone)
    {
        super(firstName,lastName, phoneNumber);
        this.hasIphone = hasIphone;
    }
    public String toString()
    {
        return getFirstName() + getLastName() + " - " + "#" + getPhoneNumber();
    }

}
