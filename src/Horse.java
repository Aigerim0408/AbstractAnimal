public class Horse extends Animal{
    private String breed;
    public Horse(){

    }

    public Horse(String breed) {
        this.breed = breed;
    }

    public Horse(String nickname, String gender, int weight, int age, String breed) {
        super(nickname, gender, weight, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Horse: " + "\n"+
                "Breed: " + breed + "\n" +
                super.toString();
    }
}
