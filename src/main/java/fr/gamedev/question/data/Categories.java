package fr.gamedev.question.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * 
 * @author nicolas
 *
 */
@Entity
public class Categories {
    /**
     * id.
     */
    @GeneratedValue(generator = "seq_gen_category")
    @GenericGenerator(name = "seq_gen_category", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = { @Parameter(name = "sequence_name", value = "seq_category"),
                    @Parameter(name = "initial_value", value = "0"), @Parameter(name = "increment_size", value = "1") })

    @Id
    private long id;

    /**
     * Titre de la categorie.
     */
    private String titre;

    /**
     * @return id
     */
    public long getId() {
        return id;
    }

    /**
     * @param theid
     */
    public void setId(final long theid) {
        this.id = theid;
    }

    /**
     * @return titre
     */
    public String getTitre() {
        return titre;
    }

    /**
     * @param thetitre
     */
    public void setTitre(final String thetitre) {
        this.titre = thetitre;
    }
}
