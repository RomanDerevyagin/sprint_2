package model;

import static model.constants.Discount.*;

public class  Meat extends Food implements Discountable{
    public Meat(int amount, double price){
        this.amount=amount;
        this.price=price;
        this.isVegetarian =false;
    }
    @Override
    public double getDiscount(){
        return DISC_MEAT;
    }
}
