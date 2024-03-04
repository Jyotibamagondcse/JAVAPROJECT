class Faculty {
    private int id;
    private String name;
    private int experience;
    private double salary;

    public Faculty(int id, String name, int experience, double salary) {
        this.id = id;
        this.name = name;
        this.experience = experience;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void displayFaculty() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Experience: " + experience + " years");
        System.out.println("Salary: $" + salary);
        System.out.println("--------------------------");
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
