package clan.techreturners.drinks.model;

public class Coffee {
    private int id;
    private String name;

    public Coffee(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
