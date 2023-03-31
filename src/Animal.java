public abstract class Animal {
    private String nickname;
    private String gender;
    private int weight;
    private int age;

    public Animal() {

    }

    public Animal(String nickname, String gender, int weight, int age) {
        this.nickname = nickname;
        this.gender = gender;
        this.weight = weight;
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal: " + "\n" +
                "Nickname: '" + nickname + "\n" +
                "Gender: " + gender + "\n" +
                "weight: " + weight + " kg"+"\n"+
                "age: " + age+ " years old"+"\n";
    }
}
