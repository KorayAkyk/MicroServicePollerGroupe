package fr.gamedev.question.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * @author nicolas
 */
@Entity
public class Tags {

    /**
     * id.
     */
    @GeneratedValue(generator = "seq_gen_tag")
    @GenericGenerator(name = "seq_gen_tag", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
            @Parameter(name = "sequence_name", value = "seq_tag"), @Parameter(name = "initial_value", value = "0"),
            @Parameter(name = "increment_size", value = "1") })

    /**
     * Id du tag.
     */
    @Id
    private long id;

    /**
     * Titre du tag.
     */
    private String titre;

    /**
     * Categorie du tag.
     */
    @ManyToOne
    private Categories categorie;

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

    /**
     * @return categories
     */
    public Categories getCategorie() {
        return categorie;
    }

    /**
     * @param thecategorie
     */
    public void setCategory(final Categories thecategorie) {
        this.categorie = thecategorie;
    }

}
