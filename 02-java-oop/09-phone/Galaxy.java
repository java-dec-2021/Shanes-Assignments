public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }

    @Override
    public String ring() {
        String versionNumber = this.getVersionNumber();
        String ringTone = this.getRingTone();
        return String.format("Galaxy %s says %s", versionNumber, ringTone);
    }

    @Override
    public String unlock() {
        String unlock = "Unlocking via finger print";
        return unlock;
    }
    
    @Override
    public void displayInfo() {
        String versionNumber = this.getVersionNumber();
        String carrier = this.getCarrier();
        System.out.println(String.format("Galaxy %s from %s", versionNumber, carrier));
    }
}
