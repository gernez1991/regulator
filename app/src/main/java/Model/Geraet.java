package Model;

import java.util.Objects;

//data class User()
public class Geraet  {

    private String name;
    private int priority;
    private int consumption;
    private String description;

    public Geraet(String name, int priority, int consumption, String description) {
        this.name = name;
        this.priority = priority;
        this.consumption = consumption;
        this.description = description;
    }

    public Geraet(String name, String priority, String consumption, String description) {
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public int getConsumption() {
        return consumption;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Geraet geraet = (Geraet) o;
        return name == geraet.name &&
                priority == geraet.priority && consumption == geraet.consumption && description == geraet.description;

    }
}


