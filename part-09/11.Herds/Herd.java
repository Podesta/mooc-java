import java.util.ArrayList;

public class Herd implements Movable {

    private ArrayList<Movable> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        this.herd.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable movable : this.herd) {
            movable.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String toPrint = "";
        for (Movable movable : this.herd) {
            toPrint += movable.toString() + "\n";
        }
        return toPrint;
    }

}
