public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("James", 7, 2.13);
        cat1.introduce();
        cat1.printCatInfo();
        Cat cat2 = new Cat("Robin", 2, 3.14);
        cat2.printCatInfo();
        cat2.introduce();
    }
}
