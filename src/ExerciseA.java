public class ExerciseA {
    public static final int NUM_ITER = 5;

    static class MyThread extends Thread {
        private String name;

        MyThread (String name) {
            this.name = name;
        }

        void writeHello() {
            System.out.println("Hello " + name);
        }

        public void run () {
            for (int i = 0; i < NUM_ITER; i++) {
                writeHello();
            }
        }
    }

    public static void main (String[] args) throws Exception {
        Thread a = new MyThread("A");
        Thread b = new MyThread("B");

        a.start();
        b.start();

        a.join();
        System.out.println("I'm done");
        b.join();


    }
}
