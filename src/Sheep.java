public class Sheep extends Animal{
    private int sheepNumber;
    private Sheep(){

    }
    public Sheep(int sheepNumber) {
        this.sheepNumber = sheepNumber;
    }

    public Sheep(String nickname, String gender, int weight, int age, int sheepNumber) {
        super(nickname, gender, weight, age);
        this.sheepNumber = sheepNumber;
    }

    public int getSheepNumber() {
        return sheepNumber;
    }

    public void setSheepNumber(int sheepNumber) {
        this.sheepNumber = sheepNumber;
    }

    @Override
    public String toString() {
        return "Sheep: " +
                "Sheep Number: " + sheepNumber +
                super.toString();
    }
}
