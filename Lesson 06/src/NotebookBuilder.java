/**
Билдер для экземпляра класса Notebook с геттерами и сеттерами
 */
public class NotebookBuilder {
    private String name = "не задано";
    private int ram = -1;
    private String os = "не задано";
    private int price = -1;
    private String model = "не задано";
    private String color = "не задано";
    private int hdd = -1;

    public NotebookBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public NotebookBuilder setRAM(int ram) {
        this.ram = ram;
        return this;
    }

    public NotebookBuilder setOS(String os) {
        this.os = os;
        return this;
    }

    public NotebookBuilder setPrice(int price) {
        this.price = price;
        return this;
    }

    public NotebookBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public NotebookBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public NotebookBuilder setHDD(int hdd) {
        this.hdd = hdd;
        return this;
    }

    public Notebook createNotebook() {
        return new Notebook(name, ram, os, price, model, color, hdd);
    }
}