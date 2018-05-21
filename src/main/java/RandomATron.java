import java.util.ArrayList;
import java.util.Collections;

public class RandomATron {

    private ArrayList<String> names;

    public RandomATron() {
        this.names = new ArrayList<String>();
        this.names.add("John Paul Jones");
        this.names.add("Robert Plant");
        this.names.add("Jimmy Page");
        this.names.add("John Bonham");
        this.names.add("Mick Jagger");
        this.names.add("Keith Richards");
        this.names.add("Brian Jones");
        this.names.add("Ronnie Wood");
        this.names.add("Charlie Watts");
    }

    public void shuffleNames() {
        Collections.shuffle(this.names);
    }

    public String single() {
        return this.names.get(0);
    }

    public ArrayList<String> pairs() {
        ArrayList<String> pairOfNames = new ArrayList<String>();
        pairOfNames.add(this.names.get(0));
        pairOfNames.add(this.names.get(1));
        return pairOfNames;
    }

}

}
