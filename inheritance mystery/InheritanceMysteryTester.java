public class InheritanceMysteryTester {
    public static void main(String[] args) {
        Arya[] thrones = {new Oberyn(), new Arya(), new Brienne(), new Tyrion()};
        for (int i = 0; i < thrones.length; i++) {
            thrones[i].a();
            System.out.println();
            System.out.println(thrones[i]);
            thrones[i].b();
            System.out.println();
            System.out.println();
        }
    }
}
