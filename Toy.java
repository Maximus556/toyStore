public class Toy {
    private String id;
    private String name;
    private int frequency;
    private double weight;

    public Toy(String id, String name, int frequency, double weight) {
        this.id = id;
        this.name = name;
        this.frequency = frequency;
        this.weight = weight;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void updateToy(String name, int frequency, double weight) {
        this.name = name;
        this.frequency = frequency;
        this.weight = weight;
    }
    
}
