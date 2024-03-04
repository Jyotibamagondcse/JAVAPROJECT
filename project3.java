private static void updateFaculty(Scanner scanner) {
        System.out.print("Enter Faculty ID to update: ");
        int facultyId = scanner.nextInt();

        Iterator<Faculty> iterator = facultyList.iterator();
        while (iterator.hasNext()) {
            Faculty faculty = iterator.next();
            if (faculty.getId() == facultyId) {
                System.out.print("Enter new Experience: ");
                int newExperience = scanner.nextInt();
                System.out.print("Enter new Salary: ");
                double newSalary = scanner.nextDouble();

                faculty.setExperience(newExperience);
                faculty.setSalary(newSalary);

                System.out.println("Faculty updated successfully!");
                return;
            }
        }

        System.out.println("Faculty with ID " + facultyId + " not found.");
    }

    private static void deleteFaculty(Scanner scanner) {
        System.out.print("Enter Faculty ID to delete: ");
        int facultyId = scanner.nextInt();

        Iterator<Faculty> iterator = facultyList.iterator();
        while (iterator.hasNext()) {
            Faculty faculty = iterator.next();
            if (faculty.getId() == facultyId) {
                iterator.remove();
                System.out.println("Faculty deleted successfully!");
                return;
            }
        }

        System.out.println("Faculty with ID " + facultyId + " not found.");
    }

    private static void searchFaculty(Scanner scanner) {
        System.out.print("Enter Faculty Name to search: ");
        String facultyName = scanner.nextLine();

boolean found = false;
        for (Faculty faculty : facultyList) {
            if (faculty.getName().equalsIgnoreCase(facultyName)) {
                faculty.displayFaculty();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Faculty with name '" + facultyName + "' not found.");
        }
    }
}
