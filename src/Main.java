import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        List<String>firstClients= List.of("Anya","Sveta","Olya", "Alexandra", "Ruslana", "Olesya", "Vika");
        Queue<String> q = new LinkedList<>();
        q.addAll(firstClients);
        int count = 0;

        while (!q.isEmpty()) {
            String name = q.poll();
            System.out.println(name + " сделала новый маникюр");
            count ++;
            if (Math.random() < 0.5) {
                q.add("friend of " + name);
            }
        }
        System.out.println();
        System.out.println("Число выполненных маникюров: " + count);
    }
}
