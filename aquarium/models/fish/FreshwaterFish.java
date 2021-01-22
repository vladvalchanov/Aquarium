package aquarium.models.fish;

public class FreshwaterFish extends BaseFish {
    private static final int SIZE = 3;
    private static final int INCREASE = 3;


    public FreshwaterFish(String name, String species, double price) {
        super(name, species, price);
        this.setSize(SIZE);
    }


    @Override
    public void eat() {
        int oldSize = this.getSize();
        super.setSize(oldSize + INCREASE);
    }
}
