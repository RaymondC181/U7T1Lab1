import java.util.ArrayList;

public class CatRunner {
    public static void main (String[] args)
    {
        ArrayList<Cat> cats = new ArrayList<Cat>();
        Cat cat1 = new Cat("cat");
        Cat cat2 = new Cat("cat2");
        Cat cat3 = new Cat("cat3");
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        System.out.println(cats);

        Cat cat4 = new Cat("Toby");
        Cat replaced = cats.set(2, cat4);
        System.out.println(cats);
        System.out.println("Replaced: " + replaced);

        cat2.meow();
        System.out.println(cats);

        cats.add(new Cat("Sam"));
        System.out.println(cats);
    }
}
