
public class Main {
    public static void main(String[] args) {
        HavingSuperAbility[] heroes = {new Warrior(), new Magic(), new Medic(),};
        String Hero[] = {"Magic", "Medic", "Warrior"};
        System.out.println("___________");
        for (int i = 0; i <heroes.length ; i++) {
            heroes[i].applySuperAbility();
        }

    }
}