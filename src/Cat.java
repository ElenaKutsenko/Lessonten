public class Cat {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    private String getName() {
        return name;
    }
    private String setName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
