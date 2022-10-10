//package fast_food;

import java.util.ArrayList;
import java.util.List;

public class Pizza extends Food{
    protected List<String> toppings;

    public Pizza(){
        super("Pizza", 45);
        toppings = new ArrayList<>();
    }

    public void addTopping(String topping){
        toppings.add(topping);
        price += 10;
    }

    @Override
    public void display() {
        String displayText = price + " kr " + name + " { ";
        String seperator = ", ";
        for (int i = 0; i < toppings.size(); i++) {
            if(i == toppings.size() - 1){
                seperator = " ";
            }
            displayText += toppings.get(i) + seperator;
            
        }
        displayText += "}";
        System.out.println(displayText);
    }

    public void setName(String name){
        this.name = name;
    }
}
