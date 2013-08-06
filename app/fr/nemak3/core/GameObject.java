package fr.nemak3.core;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Created with IntelliJ IDEA.
 * User: marco
 * Date: 22/07/13
 * Time: 15:36
 * To change this template use File | Settings | File Templates.
 */
@MappedSuperclass
public class GameObject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
