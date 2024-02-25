public class Main {

    public static void main(String[] args) {
        Scanner objInput = new Scanner(System.in);

        System.out.print("Name: ");
        String inputName = objInput.nextLine();
        System.out.print("Gender (M/F): ");
        String inputGender = objInput.nextLine();
        System.out.print("Month of Birth (yyyy-mm-dd): ");
        String inputMonthBirth = objInput.nextLine();

        String gender = ""; // menggunakan nama variabel yang dimulai dengan huruf kecil

        if ("F".equals(inputGender)) {
            gender = "Female";
        } else if ("M".equals(inputGender)) {
            gender = "Male";
        }

        LocalDate monthBirth = LocalDate.parse(inputMonthBirth); // menggunakan nama variabel yang dimulai dengan huruf kecil
        Period age = Period.between(monthBirth, LocalDate.now());

        System.out.println("Name: " + inputName);
        System.out.println("Gender: " + gender);
        System.out.println("Your Age: " + age.getYears() + " years " + age.getMonths() + " months");
    }
}