import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;
import static model.constants.Colour.*;

public class Main {
    public static void main(String[] args) {
        Food[] foods = {
                new Meat(5, 100),
                new Apple(10, 50, RED),
                new Apple(8, 60, GREEN)
        };
        ShoppingCart shoppingCart = new ShoppingCart(foods);
        System.out.println("Сумма без скидки: " + shoppingCart.getTotalWithoutDiscount());
        System.out.println("Сумма со скидкой: " +shoppingCart.getTotalWithDiscounts());
        System.out.println("Сумма вегетарианских без скидки: " + shoppingCart.getTotalVegetarianWithoutDiscounts());


    }
}