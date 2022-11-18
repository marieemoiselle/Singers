public class Writer extends Artist{
    String publisher;
    String wtype;

    public Writer() {
        publisher = "Unknown";
        wtype = "Unknown";
    }

    public Writer(
        String aname,
        String stname,
        String nationality,
        String dob,
        Gender gender,
        int age,
        String pub,
        String wt){
            super(aname, stname, nationality, dob, gender, age);
            this.publisher = pub;
            this.wtype = wt;   
    }

    protected void showArtist(){
        super.showArtist();
        System.out.println("WRITER DETAILS");
        System.out.println("Publisher: " +publisher);
        System.out.println("Writer Type: " +wtype);
    }

}