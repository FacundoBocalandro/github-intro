public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            list.add(i, "hola");
        }

        list.remove(7);

        for (int i = 0; i < 10; i++) {
            System.out.println(list.get(i));
        }

    }
}
