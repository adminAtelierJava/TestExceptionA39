public class MethodCalling {

    public void method1(){
        this.method2();
    }

    private void method2() {
        this.method1();
    }

    public static void main(String[] args) {
        MethodCalling mc = new MethodCalling();
        try {
            mc.method1();
        }catch (StackOverflowError er)
        {
            System.out.println(er);
        }
    }
}
