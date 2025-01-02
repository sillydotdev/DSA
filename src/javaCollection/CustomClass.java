package javaCollection;

class Info {
    public int id;
    public String name;

    Info(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class CustomClass {
    public static void main(String[] args) {
        Info info1 = new Info(1, "A");
        Info info2 = new Info(2, "B");
        Info info3 = new Info(3, "C");

        info3.name = "Kamran";
        System.out.println(info3.name);

        System.out.println(info1.id);
        System.out.println(info1.name);
    }
}
