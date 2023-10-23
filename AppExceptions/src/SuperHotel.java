public class SuperHotel {
    static int[] tab;

    public void reserve() {
try {
    System.out.println("test");
    tab[0] = 1;
    System.out.println("tab");
}
catch (NullPointerException ex)
{
    System.out.println(ex);
    tab=new int[2];
    tab[0]=1;
}
        System.out.println("suite programme");
        System.out.println(tab[0]);
    }

    public static void main(String[] args) {
        SuperHotel sp = new SuperHotel();
        sp.reserve();
    }
}
