enum Gender {
    MALE, FEMALE, UNKNOWN;
}

public class Artist{
    protected String aname;
    protected String stname;
    protected String nationality;
    protected String dob;
    protected Gender gender;
    protected int age;


    public Artist(){ //DEFAULT CONSTRUCTOR OF ARTIST
        aname = "Unknown name";
        stname = "No stage name defined";
        nationality = "Unknown";
        dob = "n.d.";
        gender = Gender.UNKNOWN;
        age = 0;
    }

    public Artist(
        String aname,
        String stname,
        String nationality,
        String dob,
        Gender gender,
        int age
        ) {
            this.aname = aname;
            this.stname = stname;
            this.nationality = nationality;
            this.dob = dob;
            this.gender = gender;
        }

    public void showArtist() {
        System.out.println("ARTIST PROFILE");
        System.out.println("Name: " +aname);
        System.out.println("Stage Name: " +stname);
        System.out.println("Nationality: " +nationality);
        System.out.println("Date of Birth: " +dob);
        System.out.println("Gender: " +gender);
    }
}