public class JavaMain {
    public static void main(String[] args) {
        String map0 = """
                xxoo
                ooox
                oxoo""";
        System.out.println(countIsles(map0)); //expected 3

        String map1 = """
                oxooooxo
                oxxoooxo
                ooooxooo
                ooooooxo
                oooxxxx0
                oooooooo""";
        System.out.println(countIsles(map1)); //expected 4
    }

    static int countIsles(String bitmap) {
        System.out.println(bitmap);
        return 0;
    }
}
