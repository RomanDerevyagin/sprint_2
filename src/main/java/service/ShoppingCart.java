package service;
import model.Food;

public class ShoppingCart {
    private Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }

    public double getTotalWithoutDiscount() {
        double total = 0;
        for (int i = 0; i < foods.length; i++) {
            total += foods[i].getPrice() * foods[i].getAmount();
        }
        return total;
    }

    public double getTotalWithDiscounts() {
        double total = 0;
        for (int i = 0; i < foods.length; i++) {
            double discount = foods[i].getDiscount();
            double priceWithDiscount = foods[i].getPrice() * (100 - discount) / 100;
            total += priceWithDiscount * foods[i].getAmount();
        }
        return total;
    }

    public double getTotalVegetarianWithoutDiscounts() {
        double total = 0;
        for (int i = 0; i < foods.length; i++) {
            if (foods[i].isVegetarian()) {
                total += foods[i].getAmount() * foods[i].getPrice();
            }
        }
        return total;
    }
}