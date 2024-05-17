package Klasswork2304;

public class Main01 {
    public static void main(String[] args) {
        Cat cat = new Cat( "Belysh", "Sfinks",10);
    String name = cat.getName();
        System.out.println(name);
        cat.setName("Черныш");

        name = cat.getName();
        System.out.println(name);

        cat.setAge(100);
        int age = cat.getAge();
        System.out.println(age);

        for (int i = 0; i < 1000; i++) {
            boolean successJump = cat.jump();
            if (!successJump) {
                break;
            }
        }

    }
}
