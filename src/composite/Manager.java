package composite;

import java.util.LinkedList;
import java.util.List;

public class Manager<E> implements Employee<E> {

    private String name;
    private double salary;
    private List<E> developers;

    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.developers = new LinkedList<>();
    }

    @Override
    public void addChild(E elem) {
        this.developers.add(elem);
    }

    public double getSalary() {
        return 0;
    }

    public String getName() {
        return name;
    }

    public List<E> getChild() {
        return developers;
    }
}
