public class AddTable {

    public static void main(String[] args) {
        int[] array = new int[3];
        for (int i=0;i< 4;i++){
           try {
               array[i] = i;
               System.out.println(array[i]);
           }catch (ArrayIndexOutOfBoundsException ar)
           {
               System.out.println(ar);
           }
        }
        System.out.println(array);
        System.out.println("suite");
    }
}
