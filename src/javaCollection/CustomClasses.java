package javaCollection;

class Data {
    private int id;
    private String name;

    private InternalData internalData;

    Data(int id, String name, int revenue) {
        this.id = id;
        this.name = name;
        this.internalData = new InternalData(revenue);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

class InternalData {
    public int revenue;
    InternalData(int revenue) {
        this.revenue = revenue;
    }
}

public class CustomClasses {
    public static void main(String[] args) {
        Data dataObj1 = new Data(1, "A", 1000);
        Data dataObj2 = new Data(2, "B", 10000);

        dataObj2.setName("Kamran");
        System.out.println(dataObj2.getName());
    }
}
