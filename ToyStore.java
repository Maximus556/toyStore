import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.PriorityQueue;

public class ToyStore {
    public static void main(String[] args) {
        // Создание массивов:
        String[] ids = {"1", "2", "3"};
        int[] frequencies = {10, 5, 3};
        double[] weights = {0.5, 1.2, 2.0};

        // Добавление элементов в PriorityQueue:

        PriorityQueue<Toy> toys = new PriorityQueue<>(Comparator.comparingDouble(Toy::getWeight));
        for (int i = 0; i < ids.length; i++) {
            toys.add(new Toy(ids[i], "Toy " + ids[i], frequencies[i], weights[i]));
        }

        // Запись в файл:

        try (PrintWriter writer = new PrintWriter(new File("toys.csv"))) {
            StringBuilder sb = new StringBuilder();
            sb.append("Id,Name,Frequency,Weight\n");
            for (Toy toy : toys) {
                sb.append(toy.getId()).append(",")
                        .append(toy.getName()).append(",")
                        .append(toy.getFrequency()).append(",")
                        .append(toy.getWeight()).append("\n");
            }
            writer.write(sb.toString());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}