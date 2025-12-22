class Student{
    String name;
    String course;
    int age;
    String studentid;
    
    public Student(String name, String course, int age, String studentid){
        this.name = name;
        this.course = course;
        this.age = age;
        this.studentid = studentid;
    }
    public static void main(String[] x){
        Student s1 = new Student("Yodin Raya", "BIT", 18, "cp4a05f230405");    
        Student s2 = new Student("Biraj Shrestha", "BIT", 17, "cp4a05f230424");
        Student s3 = new Student("Divyamani Khawas", "BIT", 47000000, "cp4a05f240405");
        System.out.println(s1.name + " " + s1.age + " " + s1.course + " " + s1.studentid);
        System.out.println(s2.name + " " + s2.age + " " + s2.course + " " + s2.studentid);
        System.out.println(s3.name + " " + s3.age + " " + s3.course + " " + s3.studentid);
    }
}