package id.winklesen.learn_java.common_class.collection;

class Planet {
    private final String name;
    private final double mass;

    public Planet(String name, double mass) {
        this.name = name;
        this.mass = mass;
    }

    @Override
    public String toString() {
        return "Planet " + name + ", mass: " + mass;
    }
}