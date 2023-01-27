public class Person {
    private final String name;
    private final String secondName;
    private int age;
    private String address;
    private final static int hashCoef = 31;

    public Person(String name, String secondName, int age, String address) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAge(int age) {
        if (!hasAge()) this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean hasAddres() {
        if (address != null) return true;
        return false;
    }


    public void happyBirthday() {
        if (hasAge()) age++;
    }

    public boolean hasAge() {
        if (age != 0) return true;
        return false;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\nSecondName: " + getSecondName() +
                "\nAge: " + getAge() + "\nAddres: " + getAddress();
    }

    @Override
    public int hashCode() {

        return hashCoef * ((getName() == null ? 0 : getName().hashCode()) +
                (getSecondName() == null ? 0 : getSecondName().hashCode()) +
                getAge() +
                (getAddress() == null ? 0 : getAddress().hashCode()));
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setAddress(address).setSecondName(secondName);
    }
}
