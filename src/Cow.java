public class Cow extends Animal{
    private String color;
    public Cow(){

    }

    public Cow(String color) {
        this.color = color;
    }

    public Cow(String nickname, String gender, int weight, int age, String color) {
        super(nickname, gender, weight, age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cow: " + "\n"+
                "Color: " + color + "\n"+
                super.toString();
    }
}
