1. Process 
    ![alt text](images/image.png)

2. Thread 
    ![alt text](images/image-1.png)

![alt text](images/image-2.png)

![alt text](images/image-3.png)

![alt text](images/image-4.png)


3. Multithreading 
    ![alt text](images/image-5.png)

4. Multitasking vs Multithreading 
    *Multitasking* is multiple process executing at the same time 

    *Multithreading* is multiple thread within the same process getting executed at the same time 


5. Thread Creation Ways 
    5.1. Implementing 'Runnable' functional Interface (with single run() method)
        ![alt text](images/image-6.png)
    5.2. extending 'Thread' class
        ![alt text](images/image-7.png)

6. Why only 2 ways to create threads ?
    - A class can implement more than 1 interface 
    but 
    - A class can extend only 1 class 

7. Thread lifecycle 
    ![alt text](images/image-8.png)
    ![alt text](images/image-9.png)

8. Monitor lock:
    It helps to make sure that only 1 thread goes inside the particular section of code (a synchronized block or method)