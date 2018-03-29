import java.util.Objects;

public class Pen {
    private String color;
    private int cost;

    public Pen(String color, int coast) {
        this.color = color;
        this.cost = coast;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pen)) return false;
        Pen pen = (Pen) o;
        return cost == pen.cost &&
                Objects.equals(color, pen.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, cost);
    }

    @Override
    public String toString() {
        return "Pen{" +
                "color='" + color + '\'' +
                ", coast=" + cost +
                '}';
    }
}