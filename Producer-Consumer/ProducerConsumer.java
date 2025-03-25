
class SharedResource {
    private int data;
    private boolean valueSet = false;  

    
    public synchronized void produce(int value) {
        while (valueSet) {  
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        data = value;
        valueSet = true;  
        System.out.println("Produced: " + value);
        notify();  
    }

    // Consumer's method to consume data
    public synchronized void consume() {
        while (!valueSet) { // Wait if no data is available
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Consumed: " + data);
        valueSet = false; // Reset the flag
        notify(); // Notify the producer
    }
}

// Producer Class
class Producer implements Runnable {
    private final SharedResource resource;

    public Producer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            resource.produce(i);
            try {
                Thread.sleep(500); // Simulating production delay
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class Consumer implements Runnable {
    private final SharedResource resource;

    public Consumer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            resource.consume();
            try {
                Thread.sleep(1000); // Simulating consumption delay
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

// Main Class
public class ProducerConsumer {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread producerThread = new Thread(new Producer(resource));
        Thread consumerThread = new Thread(new Consumer(resource));

        producerThread.start();
        consumerThread.start();
    }
}


// implement the program where cointainer can hold k number of problem.