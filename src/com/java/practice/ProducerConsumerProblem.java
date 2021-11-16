package com.java.practice;
import java.lang.Thread;

		// Java program to implement the
		// producer consumer's problem

		

		// Producer class which extends the
		// thread
		class Producer extends Thread {

			// Creating a string buffer
			StringBuffer buffer;
			boolean dp = false;

			// Initializing the string buffer
			Producer()
			{
				buffer = new StringBuffer(4);
			}

			// Overriding the run method
			public void run()
			{
				synchronized (buffer)
				{

					// Adding the data into the
					// buffer
					for (int i = 0; i < 4; i++) {
						try {
							buffer.append(i);
							System.out.println("Produced " + i);
						}
						catch (Exception e) {
							e.printStackTrace();
						}
					}

					// Notifying the buffer
					System.out.println("Buffer is FUll");
					buffer.notify();
				}
			}
		}

		// Consumer class which extends
		// the thread
		class Consumer extends Thread {

			// Creating the object of the
			// producer class
			Producer p;

			// Assigning the object of the
			// producer class
			Consumer(Producer temp)
			{
				p = temp;
			}

			// Overriding the run method
			public void run()
			{

				// Controlling the access of the
				// buffer to the shared producer
				synchronized (p.buffer)
				{
					try {
						p.buffer.wait();
					}
					catch (Exception e) {
						e.printStackTrace();
					}

					// Printing the values of the string buffer
					// and consuming the buffer
					for (int i = 0; i < 4; i++) {
						System.out.print(p.buffer.charAt(i) + " ");
					}
					System.out.println("\nBuffer is Empty");
				}
			}
		}

		// Main class to implement the
		// Producer Consumer problem
		public class ProducerConsumerProblem {

			public static void main(String[] args) {
				
				// Initially, there needs to be some data
				// in order to consume the data. So,
				// Producer object is created first
				Producer p = new Producer();

				// Sending this producer object
				// into the consumer
				Consumer c = new Consumer(p);
				Thread t1 = new Thread(p);
				Thread t2 = new Thread(c);

				// Since from the producer object,
				// we have already produced the data.
				// So, we start by consuming it.
				t2.start();
				t1.start();
			}
		


	}
		
		//Producer Consumer’s Problem without Synchronization: The above code is inefficient because the CPU resources are not being utilized in an efficient way. The threads are waiting for the buffer in the waiting state. Instead of this, we can utilize these threads in an efficient way by terminating them and creating them again. That is: 
		 

		//We create a thread to produce the data.
		//Once the buffer is full we will terminate that thread.
		//Create another thread to consume the data(at this point producer thread is dead).
		//Once the buffer is empty, consumer thread terminates and producer thread gets created and produces the data (at this point consumer thread is dead).

		// Java program to implement the
		// producer consumer's problem
		// without using synchronization

		import java.lang.Thread;

		// Producer class which extends the
		// thread
		class Producer extends Thread {

			// Creating a string buffer
			StringBuffer buffer;

			// Initializing the string buffer
			Producer()
			{
				buffer = new StringBuffer(4);
			}

			// Overriding the run method
			public void run()
			{

				// Loop to add data into the
				// buffer
				for (int i = 0; i < 4; i++) {
					try {
						buffer.append(i);
						System.out.println("Produced " + i);
					}
					catch (Exception e) {

						// Exception is returned when
						// the buffer is not accessible
						e.printStackTrace();
					}
				}
				System.out.println("Buffer is FUll");

				// Creating a consumer object after
				// execution of the above method.
				// Here, this keyword refers to
				// the current object of the
				// producer. This object is passed
				// into the consumer to access the
				// created buffer
				Consumer c = new Consumer(this);
			}
		}

		// Consumer class which extends
		// the thread
		class Consumer1 extends Thread {
			Producer p;
			Thread t2;

			// Constructor to get the
			// producer object
			Consumer1(Producer temp)
			{
				p = temp;

				// Creating a new thread for
				// the object
				t2 = new Thread(this);
				t2.start();
			}

			// Overriding the run method
			public void run()
			{
				try {

					// Printing the string buffer and
					// consuming it
					for (int i = 0; i < 4; i++) {
						System.out.print(p.buffer.charAt(i) + " ");
					}
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("\nBuffer is Empty");
			}
		}

		// Main class to implement the
		// Producer Consumer problem
		class Efficiency {
			public static void main(String args[])
			{
				// Producer object is created and
				// passed into the thread.
				Producer p = new Producer();
				Thread t1 = new Thread(p);

				// Here, instead of the same
				// thread waiting, a new thread
				// is created in the constructor
				// of the consumer class
				t1.start();
			}
		}

