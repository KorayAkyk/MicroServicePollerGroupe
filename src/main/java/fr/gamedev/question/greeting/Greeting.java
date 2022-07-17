package fr.gamedev.question.greeting;

/**
 * @author djer1
 *
 */
public class Greeting {
    /**
     * Greeting id.
     */
    private final long id;
    /**
     * Greeting content.
     */
    private final String content;

    public Greeting(final long theid, final String thecontent) {
        this.id = theid;
        this.content = thecontent;
    }

    /**
     * @return id
     */
    public long getId() {
        return id;
    }

    /**
     * @return content
     */
    public String getContent() {
        return content;
    }

}
