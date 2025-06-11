import java.util.TreeSet;

// Sydney Hashiro - BalancedTreeDictionary using Java TreeSet (Red-Black Tree)

public class BalancedTreeDictionary {
    private final  TreeSet<Saying> sayings;

    public BalancedTreeDictionary() {
        sayings = new TreeSet<>();
    }

    // Inserts a new saying.
    public void insert(Saying saying) {
        sayings.add(saying);
    }

    // checked if a Hawaiian phrase exists in the tree
    public boolean member(String hawaiianPhrase) {
        return sayings.contains(new Saying(hawaiianPhrase, "", "", ""));
    }

    // Returns the alphabetically first saying.
    public Saying first() {
        return sayings.first();
    }

     // Returns the alphabetically last saying.
    public Saying last() {
        return sayings.last();
    }

    //Returns the saying just before the given one alphabetically.
    public Saying predecessor(String hawaiianPhrase) {
        return sayings.lower(new Saying(hawaiianPhrase, "", "", ""));
    }

    //Returns the saying just after the given one alphabetically.
    public Saying successor(String hawaiianPhrase) {
        return sayings.higher(new Saying(hawaiianPhrase, "", "", ""));
    }

    // Returns all sayings (for testing or search).
    public TreeSet<Saying> getAllSayings() {
        return sayings;
    }
}