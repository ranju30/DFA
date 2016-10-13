import java.util.HashMap;
import java.util.Map;

public class Transitions {

    private Map<String, Map<String, String>> transitions = new HashMap<String, Map<String, String>>();

    public void setTransitions(String state1, String state2, String alphabet) {
        transitions.put(state1, new HashMap<String, String>());
        transitions.get(state1).put(alphabet, state2);
    }

    public String processTransitions(String currentState, String alphabet) {
        if (transitions.containsKey(currentState)) {
            return transitions.get(currentState).get(alphabet);
        }
        return null;
    }
}
