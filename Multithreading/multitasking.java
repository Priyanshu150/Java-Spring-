import java.util.*


// Implementing the runnable interface 

public classs MultithreadingLearning implements Runnable{
    @Override
    public void run(){
        System.out.println("code executed by thread: " + Thread.currentThread().getName());
    }
}

public class Main{
    public static void main(String[] args) {
        System.out.println("Going inside the main method: " + Thread.currentThread().getName()) ;
        MultithreadingLearning runnableObj = new MultithreadingLearning();
        Thread thread = new Thread(runnableObj);
        thread.start();
        System.out.println("Finish main mehtod: " + Thread.currentThread().getName());
    }
}

// Implement the Thread Class

public classs MultithreadingLearning2 extendss Thread{
    @Override
    public void run(){
        System.out.println("code executed by thread: " + Thread.currentThread().getName());
    }
}

public class Main{
    public static void main(String[] args) {
        System.out.println("Going inside the main method: " + Thread.currentThread().getName()) ;
        MultithreadingLearning2 myThread = new MultithreadingLearning2();
        myThread.start();
        System.out.println("Finish main mehtod: " + Thread.currentThread().getName());
    }
}

// Monitor lock :

public class MonitorLockExample{
    public synchronized void task1(){
        // do something 
        try {
            System.out.println("inside task1");
            Thread.sleep(100000);
        } catch (Exception e) {
            // exception handling here 
        }
    }

    public void task2(){
        System.out.println("task2, but before synchronized");
        synchronized (this) {
            System.out.println("task2, inside synchronized");
        }
    }

    public void task3(){
        System.out.println("task3");
    }
}

public static void main(String[] args) {
    MonitorLockExample obj = new MonitorLockExample();

    Thread t1 = new Thread(() -> {obj.task1();});
    Thread t2 = new Thread(() -> {obj.task2();});
    Thread t3 = new Thread(() -> {obj.task3();});

    t1.start();
    t2.start();
    t3.start();
}


// Producer - Consumer problems 

// 1. Both working on single item availability 

public class SharedResource{
    boolean itemAvailable = false;

    // sunchronized put the monitor lock 
    public synchronized void addItem(){
        itemAvailable = true;
        System.out.println("Item added by: " + Thread.currentThread().getName() + " and invoking all the therads which are waiting");
        notifyAll();
    }

    public synchronized consumeItem(){
        System.out.println("ConsumeItem method invoked by: " + Thread.currentThread().getName());

        // using while loop to avoid 'Suprious wake-up', sometime becuase of system noise 
        while(itemAvailable){
            try {
                System.out.println("ConsumeItem mehtod invoked by: " + Thread.currentThread().getName() + " is waiting now");
                wait();     // it releases the monitor lock 
            } catch (Exception e) {
            }
        }
        System.out.println("Item consumed by: " + Thread.currentThread().getName());
        itemAvailable = false;
    }
}

public class ProduceTask implements Runnable{
    SharedResource sharedResource;

    ProduceTask(SharedResource resource){
        this.sharedResource = resource;
    }

    @Override
    public void run(){
        System.out.println("Producer thread: " + Thread.currentThread().getName());
        try {
            Thread.sleep(5000l);
        } catch (Exception e) {
        }
        sharedResource.addItem();
    }
}

public class ConsumeTask implements Runnable{
    SharedResource sharedResource;

    ConsumeTask(SharedResource resource){
        this.sharedResource = resource;
    }

    @Override
    public void run(){
        System.out.println("Consumer thread: " + Thread.currentThread().getName());
        sharedResource.consumeItem();
    }
}

public class Main{
    public static void main(String[] args) {
        System.out.println("Main method start");

        SharedResource sharedResource = new SharedResource();

        // producer thread 
        Thread producerThread = new Thread(new ProduceTask(sharedResource));

        // consumer thread 
        Thread consumerThread = new Thread(new consumerTask(sharedResource));

        // thread is in 'RUNNABLE' state
        producerThread.start();
        consumerThread.start();

        System.out.println("Main method ends !!");
    }
}


/* Question 
 Two threads, a producer and consumer, share a common, fixed-size buffer as as queue
 The producer's job is to generate data and put it into the buffer, while consumer's job is to consume the data from the buffer.
 The problem is to make sure that the producer worn't produce data if the buffer is full, and the consume won't consume data if the buffer is empty.
 
*/