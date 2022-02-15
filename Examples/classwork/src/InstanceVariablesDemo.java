import java.util.ArrayList;

public class InstanceVariablesDemo {
    static ArrayList<InstanceVariablesDemo> instances = new ArrayList<InstanceVariablesDemo>();
    ArrayList<String> strings = new ArrayList<String>();

    InstanceVariablesDemo(String string) {
        strings.add(string);
    }

    static void println() {
        for(String s : strings) {
            System.out.println(s);
        }
     }

    public static void main(String[] args) throws Exception {
        int numberOfInstances = Integer.parseInt(args[0]);

        for(int i = 0; i < numberOfInstances; i++) {
            instances.add(new InstanceVariablesDemo(args[1]));
        }
       
        for(InstanceVariablesDemo ivd : instances) {
            ivd.println();
        }
    }
}