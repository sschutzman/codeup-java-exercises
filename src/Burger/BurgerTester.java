package Burger;

public class BurgerTester{
    public static void main(String[] args) {
        BurgerTools tools = new BurgerTools();
        tools.mostPopularTopping = "Pickles";
        tools.averageDaysBeforeExpiration = 564;
        tools.temperatureWhenCooked = 160;
        tools.grill();

    }
}
