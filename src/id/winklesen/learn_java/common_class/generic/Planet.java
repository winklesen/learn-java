package id.winklesen.learn_java.common_class.generic;

class Planet {
    private final String name;
    private final double mass;

    public Planet(String name, double mass) {
        this.name = name;
        this.mass = mass;
    }

    public void print() {
        System.out.println("Planet " + name + ", mass: " + mass);
    }
}
