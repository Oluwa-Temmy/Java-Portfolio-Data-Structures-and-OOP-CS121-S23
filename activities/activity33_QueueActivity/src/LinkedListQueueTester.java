public class LinkedListQueueTester {
    public static void main(String[] args) {
        LinkedListQueue test = new LinkedListQueue();
        LinkedListQueue rwar = new LinkedListQueue();

        //1. Queue List Activity
        System.out.println("1. Objective\n");
        String [] iems = {"Tom", "Jane","Beth"};
        for (int i = 0; i < iems.length; i++)
            test.enqueue(iems[i]);
        System.out.println(test.displayQueue());

        //2. Queue List Activity
        System.out.println("\n2. Objective\n");
        String [] iems2 = {"John", "Mary"};
        for ( Object names : iems2)
            test.enqueue(names);
        System.out.println(test.displayQueue());

        //3.
        System.out.println("\n3. Objective\n");
        System.out.println("Queue is empty: " + test.isEmpty() +
                "\nNumber of items in queue is: " + test.size() +
                "\nThe head of the queue is: " + test.peek());

        //4.
        System.out.println("\n4. Objective\n");
        test.dequeue();
        System.out.println(test.displayQueue());

        //5.
        System.out.println("\n5. Objective\n");
        System.out.println("Queue is empty: " + test.isEmpty() +
                "\nNumber of items in queue is: " + test.size() +
                "\nThe head of the queue is: " + test.peek());

        //6.
        System.out.println("\n6. Objective\n");
        System.out.printf("Remove %s\n",test.peek());
        test.dequeue();
        System.out.printf("The head of queue is: %s\n", test.peek());

        //7.
        System.out.println("\n7. Objective\n");
        System.out.printf("Remove %s\n",test.peek());
        test.dequeue();
        System.out.printf("The head of queue is: %s", test.peek());

        //8.
        System.out.println("\n8. Objective\n");
        System.out.printf("Remove %s\n",test.peek());
        test.dequeue();
        System.out.printf("The head of queue is: %s", test.peek());

        //9.
        System.out.println("\n9. Objective\n");
        System.out.printf("Remove %s\n",test.peek());
        test.dequeue();
        System.out.printf("The head of queue is: %s\n\n", test.peek());

        //10.
        System.out.println("\n10. Objective\n");
        System.out.printf("Queue is empty: %s", test.isEmpty());
    }


}
