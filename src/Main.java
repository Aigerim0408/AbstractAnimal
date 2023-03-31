public class Main {
    public static void main(String[] args) {
        Horse[] horse = new Horse[]{new Horse("Mavi", "Femail", 140, 4, "Arabian"),
                new Horse("Lukas", "Mail", 150, 3, "Belgium")};
        for (Horse horse1 : horse) {
            System.out.println(horse1 + "\n------------------------------------------------------");
        }
        System.out.println();
        Cow[] cow = new Cow[]{new Cow("Marry", "Femail", 105, 2, "Brown"),
                new Cow("Lilly", "Femail", 110, 2, "Black"),
                new Cow("Lulu", "Mail", 108, 1, "Brown"),
                new Cow("Mike", "Mail", 108, 5, "Whight"),
                new Cow("Niki", "Femail", 110, 1, "Black")};
        for (Cow cow1 : cow) {
            System.out.println(cow1 + "\n------------------------------------------------------------");
        }
        System.out.println();
        Sheep[] sheep = new Sheep[]{new Sheep("Molly", "Femaial", 20, 2, 1102),
                new Sheep("Merry", "Femail", 20, 2, 1103)};
        for (Sheep sheep1 : sheep) {
            System.out.println(sheep1 + "\n----------------------------------------------------------");
        }
        Farm[] farm = new Farm[]{new Farm("Pioneer Str 12", "Adrew", horse, cow, sheep),
                new Farm("Pioneer Str 12", "Adrew", horse, cow, sheep)};
        for (Farm farm1 : farm) {
            System.out.println(farm1 + "\n===========================================================");

        }
    }
}
