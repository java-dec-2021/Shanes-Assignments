public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }

    @Override
    public String ring() {
        String versionNumber = this.getVersionNumber();
        String ringTone = this.getRingTone();
        return String.format("Iphone %s says %s", versionNumber, ringTone);
    }

    @Override
    public String unlock() {
        String unlock = "Unlocking via facial recognition";
        return unlock;
    }
    
    @Override
    public void displayInfo() {
        String versionNumber = this.getVersionNumber();
        String carrier = this.getCarrier();
        System.out.println(String.format("Iphone %s from %s", versionNumber, carrier));
    }
}
