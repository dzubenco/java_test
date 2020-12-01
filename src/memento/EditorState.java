package memento;

public class EditorState {

    private String content;

    public EditorState(String content) {
        setContent(content);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
