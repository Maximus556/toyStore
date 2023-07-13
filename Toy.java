
public class Toy {
    private int id;
    private String name;
    private int count;
    private double weight;

    
    public Toy(int id, String name, int count, double weight) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.weight = weight;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "id=" + this.id + ", название=" + this.name + ", количество=" + this.count + ", вес=" + this.weight + "\n";
    }
}