public class LogicalOperators {
    public static void main(String[] args) {

        int chemistryGrade = 67;
        int englishGrade = 65;

        if (chemistryGrade > 75 || englishGrade > 75/* ||language.equals("Java") this was throwing an error for some reason*/) {
            System.out.println("Congratulations, you got the scholarship");
        } else {
            System.out.println("you suck");
        }

        int credits = 56;
        double GPA = 1.4;

        if (credits >= 40 && GPA >= 2.0) {
            System.out.println("You earned your diploma.");
        } else {
            System.out.println("No diploma for you");
        }

    }
}

