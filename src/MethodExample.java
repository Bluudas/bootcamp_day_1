public class MethodExample {

    public static void main(String[] args) {
        MethodExample methodExample = new MethodExample();
        methodExample.sayHelloToUser("andrius");

        sum(13,56);
    }

    private String sayHelloToUser(String name) {
        String result = "Labas" + name;
        return result;
    }


    public static void sum(int numb, int numb2) {
        int result = numb + numb2;
        System.out.println(result);
    }
}
