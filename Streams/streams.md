1. What is Stream ?
    ![alt text](Images/image.png)
    ![alt text](Images/image-1.png)

2.  Different ways of creating stream

3. Different Intermediate Operations:
    ![alt text](Images/image-2.png)
    ![alt text](Images/image-3.png)
    ![alt text](Images/image-4.png)
    ![alt text](Images/image-5.png)

4. Why we call intermediate operation "Lazy"
    ![alt text](Images/image-6.png)

5. Sequence of stream operations:
    ![alt text](Images/image-7.png)

6. Different terminal operations:
    ![alt text](Images/image-8.png)
    ![alt text](Images/image-9.png)
    ![alt text](Images/image-10.png)
    ![alt text](Images/image-11.png)

7. How many times we can sue a single stream:
    ![alt text](Images/image-12.png)

8. Parallel Stream:
    Helps to perform operation on stream concurrently, taking advantage of multi core CPU.
    ParrallelStream() method is used instead of regular stream() method.

    Internally it does: 
        - Task splitting: it uses 'spliterator' function to split the data into multiple chunks
        - Task submision and parrallel processing: Uses Fork-Join pool technique.

    ![alt text](Images/image-13.png)  
    ![alt text](Images/image-14.png)