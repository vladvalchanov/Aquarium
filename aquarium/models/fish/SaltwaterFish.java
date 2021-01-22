package aquarium.models.fish;

public class SaltwaterFish extends BaseFish {
    private static final int SIZE = 5;
    private static final int INCREASE = 5;

    public SaltwaterFish(String name, String species, double price) {
        super(name, species, price);
        this.setSize(SIZE);
    }



    @Override
    public void eat() {
        int oldSize = this.getSize();
        this.setSize(oldSize + INCREASE);

    }
}
