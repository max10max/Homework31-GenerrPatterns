public class PersonBuilder {
    private String name;
    private String secondName;
    private int age;
    private String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSecondName(String secondName) {
        this.secondName = secondName;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age <= 0) throw new IllegalArgumentException("Введите корректный возраст!");
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (name == null || secondName == null || address == null)
            throw new IllegalStateException("Заполните все данные!");
        return new Person(name, secondName, age, address);
    }
}
