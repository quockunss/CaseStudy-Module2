public class PhoneExampleTest {
    private static PhoneExample phoneExample;
    public static final String[] validPhone = new String[]{"(123)4567890" , "1234567890", "123-456-7890", "(123)456-7890"};
    public static final String[] indvalidPhone = new String[]{"(1234567890)","123)4567890", "12345678901", "(1)234567890",
            "(123)-4567890", "1", "12-3456-7890", "123-4567", "Hello world"};

    public static void main(String[] args) {
        phoneExample = new PhoneExample();
        for (String phone : validPhone){
            boolean isvalid = phoneExample.validate(phone);
            System.out.println("this phone number "+phone+" is valid: "+ isvalid);
        }
        for (String phone : indvalidPhone){
            boolean isvalid = phoneExample.validate(phone);
            System.out.println("this phone number "+phone+" is valid: "+ isvalid);
        }
    }
}
