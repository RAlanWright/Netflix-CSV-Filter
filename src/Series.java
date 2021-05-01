public class Series extends Media {
//    protected String duration;
//    public void setDuration(String duration) {
//        this.duration = duration;
//    }

    public Series(String type, String title, String director, String cast, String country,
                  String releaseYear, String rating, String genre, String duration, String description)  {
        super(type,
                title,
                director,
                cast,
                country,
                releaseYear,
                rating,
                genre,
                duration,
                description);
        setDuration(duration);
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tRuntime: " + duration + " season(s)" + "\n\n\t" + description + "\n\n-----\n";
    }
}