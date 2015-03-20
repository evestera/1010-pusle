class ExampleClass {
    public static void main(String[] args) {
        ExampleClass someObject = new ExampleClass();

        new Thread(someObject::sayHello).start();
    }

    void sayHello() {
        System.out.println("Hello");
    }
}
