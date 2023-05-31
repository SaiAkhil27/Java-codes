public class MultiThreadExample {

  public static void main(String[] args) {
    // Create multiple threads
    Thread thread1 = new Thread(new MyRunnable("Thread 1"));
    Thread thread2 = new Thread(new MyRunnable("Thread 2"));
    Thread thread3 = new Thread(new MyRunnable("Thread 3"));

    // Start the threads
    thread1.start();
    thread2.start();
    thread3.start();
  }

  static class MyRunnable implements Runnable {
    private final String name;

    public MyRunnable(String name) {
      this.name = name;
    }

    @Override
    public void run() {
      try {
        for (int i = 1; i <= 5; i++) {
          System.out.println("Thread " + name + ": " + i);
          Thread.sleep(1000);
        }
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
