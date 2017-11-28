public class RestaurantDish {
    public static void main(String[] args) {
        RestaurantDish dish = new RestaurantDish();
        dish.costInCents = 1099;
        dish.nameOfDish = "Chicken Fried Steak";
        dish.wouldRecommend = true;
        dish.eat();
    }
    public int costInCents;
    public String nameOfDish;
    public boolean wouldRecommend;
    public void eat(){
        System.out.println("Nom nom nom");
    }


}
