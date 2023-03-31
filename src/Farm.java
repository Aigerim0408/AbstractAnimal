import java.util.Arrays;

public class Farm {
    private String address;
    private String ownerName;
    private Horse horse[];
    private Cow cow[];
    private Sheep sheep[];
    public Farm(){

    }

    public Farm(String address, String ownerName, Horse[] horse, Cow[] cow, Sheep[] sheep) {
        this.address = address;
        this.ownerName = ownerName;
        this.horse = horse;
        this.cow = cow;
        this.sheep = sheep;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Horse[] getHorse() {
        return horse;
    }

    public void setHorse(Horse[] horse) {
        this.horse = horse;
    }

    public Cow[] getCow() {
        return cow;
    }

    public void setCow(Cow[] cow) {
        this.cow = cow;
    }

    public Sheep[] getSheep() {
        return sheep;
    }

    public void setSheep(Sheep[] sheep) {
        this.sheep = sheep;
    }

    @Override
    public String toString() {
        return "Farm: " +"\n"+
                "Address: " + address + "\n"+
                "Owner name:" + ownerName + "\n"+
                "Horse: " + Arrays.toString(horse) +
                "\n---------------------------------"+"\n"+
                "Cow: " + Arrays.toString(cow) +
                "\n--------------------------------"+"\n"+
                "Sheep: " + Arrays.toString(sheep);
    }
}
