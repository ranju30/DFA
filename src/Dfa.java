import java.util.ArrayList;

public class Dfa {
    private Tuple tuple;
    private Transitions allTransitions = new Transitions();

    public Dfa(Tuple dfaTuple) {
        this.tuple = dfaTuple;
    }

    public boolean process() {
        String currentState = tuple.getInitialState();
        ArrayList<String> finalStates = tuple.getFinalStates();
        allTransitions = tuple.getAllTransitions();
        ArrayList<String> alphabets = tuple.getAlphabets();
        for (String alphabet : alphabets) {
            currentState = allTransitions.processTransitions(currentState, alphabet);
        }
        return finalStates.contains(currentState);
    }
}
