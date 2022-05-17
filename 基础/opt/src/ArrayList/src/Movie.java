public class Movie {
    private String name;
    private double score;
    private String actor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Movie() {
    }

    public Movie(String name, double score, String actor) {
        this.name = name;
        this.score = score;
        this.actor = actor;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }
}
