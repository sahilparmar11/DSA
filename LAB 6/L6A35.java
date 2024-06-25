import java.util.Scanner;

class Student_Detail{
    
    private int enrollmentNo;
    private String name;
    private int semester;
    private double cpi;

    public Student_Detail(int enrollmentNo,String name,int semester,double cpi){
        this.enrollmentNo = enrollmentNo;
        this.name = name;
        this.semester = semester;
        this.cpi = cpi;
    }

    public void displayDetails(){
        System.out.println("Enrollment No: " + enrollmentNo);
        System.out.println("Name: " + name);
        System.out.println("Semester: " + semester);
        System.out.println("CPI: " + cpi);
        System.out.println();
    }
}

class L6A35{
    public static void main(String[] args) {
        Student_Detail[] students = new Student_Detail[5];

        Scanner sc = new Scanner(System.in);

        for(int i=0;i<students.length;i++){
            System.out.println("Enter details of student "+(i+1));
            System.out.print("Enrollment No: ");

            int enrollmentNo = sc.nextInt();
            sc.nextLine(); 
            
            System.out.print("Name: ");
            String name = sc.nextLine();
            
            System.out.print("Semester: ");
            int semester = sc.nextInt();
            
            System.out.print("CPI: ");
            double cpi = sc.nextDouble();
            
            students[i] = new Student_Detail(enrollmentNo, name, semester, cpi);
            
            System.out.println();
        
        }
        
        for (Student_Detail s : students) {
            s.displayDetails();
        }
        
        sc.close();
    }
}