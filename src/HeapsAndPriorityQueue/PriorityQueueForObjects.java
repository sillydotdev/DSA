package HeapsAndPriorityQueue;

import java.util.PriorityQueue;

public class PriorityQueueForObjects {
    static class Student implements Comparable<Student>{    // implements Comparable interface to define functions
        String name;
        int rank;
        public Student (String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {  // function from interface to define priority
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("A", 4));
        pq.add(new Student("B", 9));
        pq.add(new Student("C", 1));
        pq.add(new Student("D", 3));
        pq.add(new Student("E", 13));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name+" -> "+pq.peek().rank);
            pq.remove();
        }
    }
}
