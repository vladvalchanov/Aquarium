package aquarium.models.fish;

import java.util.SplittableRandom;

import static aquarium.common.ExceptionMessages.*;

public abstract class BaseFish implements Fish {
    private String name;
    private String species;
    private int size;
    private double price;


    protected BaseFish(String name,String species,double price) {
        this.setName(name);
        this.setSpecies(species);
        this.setPrice(price);

    }

    @Override
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()){
            throw new NullPointerException(FISH_NAME_NULL_OR_EMPTY);
        }else {
           this.name = name;

        }
    }

    protected void setSize(int size) {
        this.size = size;
    }

    private void setSpecies(String species) {
        if (species == null || species.trim().isEmpty()){
            throw new NullPointerException(SPECIES_NAME_NULL_OR_EMPTY);
        }else {

            this.species = species;
        }

    }

    private void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException(FISH_PRICE_BELOW_OR_EQUAL_ZERO);
        }else {
            this.price = price;
        }
    }

    @Override
    public abstract void eat();


    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
