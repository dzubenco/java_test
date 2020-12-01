package memento;
public class Test {

    public static void main(String[] args){
      Editor edit = new Editor("First state");
      History mem = new History();

      mem.pushState(edit.createState());
      edit.setContent("Second state");
      mem.pushState(edit.createState());
      edit.setContent("Third state");
      mem.pushState(edit.createState());
      edit.setContent("Fourth state");
      mem.pushState(edit.createState());
      edit.restoreState(mem.popState());
      System.out.println(edit.getContent());

      Editor edit1 = new Editor("First ");
            History mem1 = new History();

            mem1.pushState(edit1.createState());
            edit1.setContent("Second ");
            mem1.pushState(edit1.createState());
            edit1.setContent("Third ");
            mem1.pushState(edit1.createState());
            edit1.restoreState(mem1.popState());
            System.out.println(edit1.getContent());

    }
}
