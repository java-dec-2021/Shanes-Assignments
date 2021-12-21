public class PhoneTest {
    public static void main(String[] args) {
        IPhone iphoneTen = new IPhone("X", 100, "AT&T", "Zing");
        Galaxy s9 = new Galaxy("S9", 99, "Verizon", "Ring Ring Ring!");

        s9.displayInfo();
        System.out.println(s9.ring());
        System.out.println(s9.unlock());

        iphoneTen.displayInfo();
        System.out.println(iphoneTen.ring());
        System.out.println(iphoneTen.unlock());
    }
}
