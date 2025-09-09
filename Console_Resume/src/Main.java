public class Main {

    public static String getDescription(){
        return "\tI, Kim Carvie Fernandez Rebamba, am a 2nd Year College Student \n" +
                "taking a degree of Information Technology at the Technological \n" +
                "University of The Philippines – Taguig Branch, presenting myself \n" +
                "capable of ABC Company’s IT internship program for undergraduates.";
    }

    public static String getEducation(){
        return "\tTechnological University of The Philippines (2024 – Present)\n" +
                "\tMoonwalk National High School (2017 – 2024) \n" +
                "\tFirst Born Christian School (2013 – 2017)\n";
    }

    public static String getAwards(){
        return "-\tYamsuan ECO-TALINO Award for Barangay Moonwalk (2024 – 2025)\n" +
                "-\tResearch Representative for Moonwalk National High School (Paranaque) (2022 – 2024)\n" +
                "-\tAchieved Latin Honors throughout Senior High School in Moonwalk National High School.\n";
    }

    public static String name(){
        return "Kim Carvie Fernandez Rebamba";
    }
    public static String number(){
        return "09165745766";
    }

    public static String mail(){
        return "Kim.fernandezmail@gmail.com";
    }

    public static String address(){
        return "123 Anywhere St., Paranaque City";
    }

    public static void sec_contact(){
        System.out.println("Contact Information:");
        System.out.println("\t Name: " + name());
        System.out.println("\t Phone #: " + number());
        System.out.println("\t Mail: " + mail());
        System.out.println("\t Address: " + address());
    }

    public static String getWork(){
        return "Freelance Designer (2023 – 2024)\n" +
                "-\tMainly posted in Instagram that included logos, cards, and symbols.\n" +
                "-\tAccepted commissions and collaborated with other local artists.\n" +
                "Producer (2024 – Present)\n" +
                "-\tUnder the DistroKid’s label to publish self-produced songs, reaching a following \n" +
                "of 23k Subscribers and 10k followers in Instagram, with 5k monthly streams in Spotify.";
    }

    public static String getProjects(){
        return "-\tC++: Payroll System, 1-in-6 Games, Simple Calculators\n" +
                "-\tJava: Resume\n" +
                "-\tPHP: CRUD transactions for databases, Resume Website\n" +
                "-\tMySQL: CRUD transactions for databases\n" +
                "-\tVisual Basic: SQL integrations, Simple progress-bar game, Simple Calculator, Save & Make Notepad";
    }

    public static void main(String[] args) {
        System.out.println();
            System.out.println("IT Internship Resume: ");
            System.out.println("\tKim Carvie Fernandez Rebamba");
            System.out.println("\tIT Intern Applicant");
            System.out.println();

            sec_contact();
        System.out.println();

            System.out.println("Description:");
            System.out.println(getDescription());
        System.out.println();

            System.out.println("Education:");
            System.out.println(getEducation());
        System.out.println();

            System.out.println("Work Experiences:");
            System.out.println(getWork());
        System.out.println();

            System.out.println("Projects:");
            System.out.println(getProjects());
        System.out.println();

            System.out.println("Awards:");
            System.out.println(getAwards());
        System.out.println();
    }

}
