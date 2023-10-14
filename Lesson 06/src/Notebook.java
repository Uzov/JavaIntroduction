import java.util.Formatter;
import java.util.Objects;

public class Notebook {
    private String name;
    private int RAM;
   private String OS;
    private int price;
    private String model;
    private String color;
    private int HDD;

    public Notebook(String name, int RAM, String OS, int price, String model, String color, int HDD) {
        this.setName(name);
        this.setRAM(RAM);
        this.setOS(OS);
        this.setPrice(price);
        this.setModel(model);
        this.setColor(color);
        this.setHDD(HDD);
    }

    @Override
    public String toString() {
        return String.format("Ноутбук: %s, модель: %s, OS: %s, RAM: %d GB, HDD: %d GB, цвет: %s,  цена: %d",
                getName(), getModel(), getOS(), getRAM(), getHDD(), getColor(), getPrice());
    }

    @Override
    public boolean equals(Object obj){
        boolean flag = false;
        // Сравниваем ссылки
        if (this == obj)
            return true;
        // Переданный объект — null?
        if (obj == null)
            return false;
        // Если переданный объект не типа Notebook
        if (!(obj instanceof Notebook))
            return false;
        Notebook itm = (Notebook) obj;

        if (!Objects.equals(itm.getName(), "не задано")){
            if (Objects.equals(this.getName(), itm.getName())){
                flag = true;
            } else flag = false;
        };
        if (itm.getRAM() != -1);{
            if (this.getRAM() == itm.getRAM()){
                flag = true;
            } else flag = false;
        }
        if (!Objects.equals(itm.getOS(), "не задано")){
            if (Objects.equals(this.getOS(), itm.getOS())){
                flag = true;
            } else flag = false;
        };
        if (itm.getPrice() != -1){
            if (this.getPrice() == itm.getPrice()){
                flag = true;
            } else flag = false;
        };
        if (!Objects.equals(itm.getModel(), "не задано")){
            if (Objects.equals(this.getModel(), itm.getModel())){
                flag = true;
            } else flag = false;
        };
        if (!Objects.equals(itm.getColor(), "не задано")){
            if (Objects.equals(this.getColor(), itm.getColor())){
                flag = true;
            } else flag = false;
        };
        if (itm.getHDD() != -1){
            if (this.getHDD() == itm.getHDD()){
                flag = true;
            } else flag = false;
        };

        return flag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getHDD() {
        return HDD;
    }

    public void setHDD(int HDD) {
        this.HDD = HDD;
    }
}
