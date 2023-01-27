import org.w3c.dom.ls.LSOutput;

public class Demo {
    public static void main(String[] args) {
        Person pers1 = new PersonBuilder()
                .setName("Benjamin")
                .setAge(317)
                .setAddress("100$")
                .setSecondName("Franklin")
                .build();
        System.out.println(pers1 + "\n");

        Person son = pers1.newChildBuilder()
                .setAge(280)
                .setName("Sara")
                .setAddress("Philadelphia")
                .build();
        System.out.println(son);

        try {
            Person pers2 = new PersonBuilder()
                    .setAge(117)
                    .setAddress("100$")
                    .setSecondName("Franklin")
                    .build();
            System.out.println(pers2 + "\n");


        } catch (IllegalStateException | IllegalArgumentException e) {
            e.printStackTrace();
        }

        try {
            Person pers3 = new PersonBuilder()
                    .setName("Benjamin")
                    .setAge(-100)
                    .setAddress("100$")
                    .setSecondName("Franklin")
                    .build();
            System.out.println(pers3 + "\n");


        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
