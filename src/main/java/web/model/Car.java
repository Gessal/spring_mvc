package web.model;

public class Car {
    private String model;
    private String mark;
    private int horsePower;

    public Car(String model, String mark, int horsePower) {
        this.model = model;
        this.mark = mark;
        this.horsePower = horsePower;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
