enum Band {
    YES, NO;
}

public class Singer extends Artist {
    String genre;
    String reclabel;
    Band band;
    
    public Singer(){
       genre = "Unknown";
       reclabel = "Unknown";
       band = Band.NO;

    }

    public Singer(
        String aname,
        String stname,
        String nationality,
        String dob,
        Gender gender,
        int age,
        String genre,
        String reclabel,
        Band band){
            super(aname, stname, nationality, dob, gender, age);
            this.genre = genre;
            this.reclabel = reclabel;
            this.band = band;
    }

    protected void showArtist() {
        super.showArtist();
        System.out.println("MUSIC DETAILS");
        System.out.println("Genre: " +genre);
        System.out.println("Record Label: " +reclabel);
        System.out.println("Band/Group: " +band);
    }
}
