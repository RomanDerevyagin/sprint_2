package service;
import model.Food;

public class ShoppingCart {
    private Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }

    public double getTotalWithoutDiscount() {
        double total = 0;
        for (Food food : foods) {
            total += food.getPrice() * food.getAmount();
        }
        return total;
    }

    public double getTotalWithDiscounts() {
        double total = 0;
        for (Food food : foods) {
            double discount = food.getDiscount();
            double priceWithDiscount = food.getPrice() * (100 - discount) / 100;
            total += priceWithDiscount * food.getAmount();
        }
        return total;
    }

    public double getTotalVegetarianWithoutDiscounts() {
        double total = 0;
        for (Food food : foods) {
            if (food.isVegetarian()) {
                total += food.getAmount() * food.getPrice();
            }
        }
        return total;
    }
}