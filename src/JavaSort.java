import java.util.*;

class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

public class JavaSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<queue.Student> studentList = new ArrayList<queue.Student>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            queue.Student st = new queue.Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        Collections.sort(studentList, new Comparator<queue.Student>() {
            @Override
            public int compare(queue.Student s1, queue.Student s2) {
                if (s1.getCgpa() != s2.getCgpa()) {
                    return Double.compare(s2.getCgpa(), s1.getCgpa()); // Higher CGPA first
                } else if (!s1.getFname().equals(s2.getFname())) {
                    return s1.getFname().compareTo(s2.getFname()); // Alphabetical order
                } else {
                    return Integer.compare(s1.getId(), s2.getId()); // Ascending order by ID
                }
            }
        });

        for (queue.Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}