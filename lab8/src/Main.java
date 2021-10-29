public class Main {

    public static void main(String[] args) {
        Director a = new Director("name1", 5, 101, "special1");
        Director b = new Director("name2", 5, 101, "special2");

        System.out.println(a.equals(b));

        System.out.println(a + "\n");
        System.out.println(b);
    }
}
/* output:

false
name: name1, experience: 5, id: 101
special info: special1

name: name1, experience: 5, id: 101
special info: special2


 */
