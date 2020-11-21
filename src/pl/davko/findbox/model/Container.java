package pl.davko.findbox.model;

public class Container implements Stackable {
    String name;
    int width;
    int length;
    int height;

    public Container(String name, int width, int length, int height) {
        this.name = name;
        this.width = width;
        this.length = length;
        this.height = height;
    }

    @Override
    public void stack(int levels) {
        height = height * levels;
    }
}
