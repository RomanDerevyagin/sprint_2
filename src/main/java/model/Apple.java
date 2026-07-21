package model;
import static model.constants.Colour.*;
import static model.constants.Discount.*;
public class Apple extends Food implements Discountable{
    private String colour;
    public Apple(int amount,double price,String colour){
        this.amount=amount;
        this.price=price;
        this.colour=colour;
        this.isVegetarian=true;
    }
    @Override
    public double getDiscount() {
        if (colour.equals(RED)) {
            return DISC_RED;
        } else if (colour.equals(GREEN)) {
            return DISC_GREEN;
        }
        return 0;
    }
}
