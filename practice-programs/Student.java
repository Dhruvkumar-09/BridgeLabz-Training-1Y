class Student {
    int id, age;
    String name;

    void displayDetails() {
        String status = "Active";
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Status : " + status);
    }

    public static void main(String[] args) {
        Student sc = new Student();

        sc.id = 23;
        sc.age = 19;
        sc.name = "Dhruv";

        sc.displayDetails();
    }
}
