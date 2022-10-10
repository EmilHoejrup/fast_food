package fast_food;

public class Food {
    private String name;
    private int price;

    public Food(String name, int price){
        this.name = name;
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public void display(){
        System.out.println(price + " kr " + name);
    }
}
