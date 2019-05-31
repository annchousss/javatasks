
public class FilmParticipation {
    private int filmId;
    private int actorId;

    public FilmParticipation(int filmId, int actorId) {
        this.filmId = filmId;
        this.actorId = actorId;
    }

    public int getFilmId() {
        return filmId;
    }

    public int getActorId() {
        return actorId;
    }
}
