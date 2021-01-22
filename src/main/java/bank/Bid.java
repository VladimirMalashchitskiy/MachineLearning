package bank;

public class Bid {
    private boolean state;
    private final Person person;

    Bid(Person person) {
        this.person = person;
    }

    @Override
    public int hashCode() {
        return person.getSalary() / 2 + person.getAge() / 2;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + person.getName() + '\'' +
                ", age=" + person.getAge() +
                ", salary=" + person.getSalary() +
                ", state=" + state +
                '}';
    }
}
