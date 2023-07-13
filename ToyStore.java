import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class ToyStore {
    private ArrayList<Toy> toys = new ArrayList<Toy>();
    private ArrayList<Toy> prizeToys = new ArrayList<Toy>();
    private Random random = new Random();

    public void addToy(Toy toy) {
        toys.add(toy);
    }

    public void editToyWeight(int id, double weight) {
        for (Toy toy : toys) {
            if (toy.getId() == id) {
                toy.setWeight(weight);
            }
        }
    }

    public Toy getPrizeToy() {
        if (prizeToys.isEmpty()) {
            return null;
        }
        Toy prizeToy = prizeToys.get(0);
        prizeToys.remove(0);
        decreaseToyCount(prizeToy);
        savePrizeToyToFile(prizeToy);
        return prizeToy;
    }

    public void choosePrizeToy() {
        double totalWeight = 0;
        for (Toy toy : toys) {
            totalWeight += toy.getWeight();
        }
        double randomValue = random.nextDouble() * totalWeight;
        double weightSum = 0;
        for (Toy toy : toys) {
            weightSum += toy.getWeight();
            if (randomValue <= weightSum) {
                prizeToys.add(toy);
                break;
            }
        }
    }

    private void decreaseToyCount(Toy toy) {
        for (Toy t : toys) {
            if (t.getId() == toy.getId()) {
                t.setCount(t.getCount() - 1);
                break;
            }
        }
    }

    private void savePrizeToyToFile(Toy toy) {
        String fileName = "prize-toys.txt";
        try {
            File file = new File(fileName);
            FileWriter writer = new FileWriter(file, true);
            writer.write(toy.getName() + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Произошла ошибка при сохранении призовой игрушки в файл: " + e.getMessage());
        }
    }

    public String toString() {
        return "Магазин с игрушками: Игрушки=" + this.toys + "}";
    }
}