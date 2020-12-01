package memento;

import java.util.ArrayList;
import java.util.List;

public class History {

    private List<EditorState> states = new ArrayList<EditorState>();

    public void pushState(EditorState state) {
        states.add(state);
    }

    public EditorState popState() {
        return states.get(states.size() - 2);
    }
}
