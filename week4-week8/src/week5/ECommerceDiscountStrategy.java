package week5;

// week 5 : Day 3: Wednesday

// defining abstract class
abstract class Discount {
    /* The class attributes are protected
        - The class is accessbile within the class where they are declared
        - It is accessible by any class within the same package.
        - Accessible through inheritance, whether the subclass is in the same package or not.
        - but cannot be accessible in different package, if not used sub-class inheritance
     */
    protected int price;
    protected int discountPercentage;

    // constructor
    Discount(int price, int discountPercentage) {
        this.price = price;
        this.discountPercentage = discountPercentage;
    }

    // abstract method discount: a kind of skeleton for discount
    abstract void discount();
}

public class ECommerceDiscountStrategy {

    // Non-static inner classes inside ECommerceDiscountStrategy class.

    // Creating child Class FestivalDiscount using Parent class Discount
    public class FestivalDiscount extends Discount {

        // Defining constructor FestivalDiscount
        FestivalDiscount(int price, int discountPercentage) {
            super(price, discountPercentage); // inheriting class attributes of Discount class: accessible
        }

        // method overriding: using abstract skeleton defined in discount class
        @Override
        void discount() {
            System.out.println("Discounted price of festival discount: " + (price - (price * discountPercentage / 100)));
        }
    }

    // Another child class "SeasonalDiscount" being defined
    public class SeasonalDiscount extends Discount {
        // another constructor, and inheritance of attributes
        SeasonalDiscount(int price, int discountPercentage) {
            super(price, discountPercentage);
        }

        // Another method overriding
        @Override
        void discount() {
            System.out.println("Discounted price of seasonal discount: " + (price - (price * discountPercentage / 100)));
        }
    }

    // another child class
    public class CouponDiscount extends Discount {
        CouponDiscount(int price, int discountPercentage) {
            super(price, discountPercentage);
        }

        @Override
        void discount() {
            System.out.println("Discounted price of coupon discount: " + (price - (price * discountPercentage / 100)));
        }
    }

    public static void main(String[] args) {
        // To create an object of an non-static inner class, we need an instance of the outer class.


        // creating new instance of outer class "strategy"
        ECommerceDiscountStrategy strategy = new ECommerceDiscountStrategy();

        /*
        FestivalDiscount is an inner class defined inside the public class which inherited from abstract class Discount
        - So, it cannot exist on it's own without an instance of the outer class
        - So, to create an instance of the inner class, we have to first create an instance of outer class, and then use that instance to create the inner class object
         */

        // So, here we use the outer class instance "strategy" to create a new object of the inner class using the keyword "outerclassobject.new"
        // The syntax strategy.new FestivalDiscount(...) tells: "I want to create a new instance of the inner class FestivalDiscount, but since it’s non-static, I need an existing instance of the outer class (strategy) to do so."
        FestivalDiscount fD = strategy.new FestivalDiscount(2000, 10);
        fD.discount();

        SeasonalDiscount sD = strategy.new SeasonalDiscount(2000, 20);
        sD.discount();

        CouponDiscount cD = strategy.new CouponDiscount(2000, 30);
        cD.discount();
    }
}