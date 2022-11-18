class ArtistDemo{

    public static void main(String[]args){
        Singer singer1 = new Singer();
        Singer singer2 = new Singer(
            "Charles Otto Puth Jr.",
            "Charlie Puth",
            "American",
            "1991-DEC-02",
            Gender.MALE,
            30,
            "Pop, Contemporary R&B",
            "APG; Atlantic; Loudr; eleveneleven",
            Band.NO
        );


        Singer singer3 = new Singer(
            "Jeon Jung-kook",
            "Jungkook",
            "South Korean",
            "1997-SEP-01",
            Gender.MALE,
            25,
            "K-pop, EDM",
            "Big Hit Music",
            Band.YES
        );

        Writer writer1 = new Writer();
        Artist writer2 = new Writer(
            "Jonnahmae Pacala",
            "jonaxx",
            "Filipino",
            "1991-JAN-23",
            Gender.FEMALE,
            31,
            "Wattpad",
            "Romance, Hurt/Comfort"
        );

        singer1.showArtist();
        System.out.println("\n");
        singer2.showArtist();
        System.out.println("\n");
        singer3.showArtist();
        System.out.println("\n");
        writer1.showArtist();
        System.out.println("\n");
        writer2.showArtist();


    }

}