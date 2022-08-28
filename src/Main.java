import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        Queue<Person> client = new LinkedList<>(generateClients());

        while (!client.isEmpty()) {
            Person currentPerson = client.poll();
            System.out.println(currentPerson.getName() + " " + currentPerson.getSurname() + " Сошел с атракциона, Колличество билетов " + currentPerson.getTicket());
            int tickets = currentPerson.getTicket();
            if (tickets > 0) {
                System.out.println(currentPerson.getName() + " " + currentPerson.getSurname() + " Покатается еще");
                currentPerson.setTicket(--tickets);
                client.offer(currentPerson);
            }
        }
        System.out.println("Билеты закончились");

    }

    private static List<Person> generateClients() {
        LinkedList<Person> mans = new LinkedList<>();
        mans.add(new Person("Oleg", "Zaycev", 3));
        mans.add(new Person("Igor", "Voronov", 2));
        mans.add(new Person("Nikita", "Volkov", 5));
        mans.add(new Person("Ruslan", "Sobolev", 4));
        mans.add(new Person("Ilya", "Galkin", 1));
        return mans;
    }


}