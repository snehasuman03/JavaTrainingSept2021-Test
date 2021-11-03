
public class encapsulation_ex {

    private String name, phone;

    public encapsulation_ex(String name, String phone) {

        this.name = name;
        this.phone = phone;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public static void main(String[] args) {

        encapsulation_ex obj = new encapsulation_ex("sneha","5645454");

        System.out.println(obj.getName());
        System.out.println(obj.getPhone());

    }

}
