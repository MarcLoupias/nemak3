package fr.marco46;

import play.db.jpa.JPA;

import javax.persistence.Query;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: marco
 * Date: 22/07/13
 * Time: 15:35
 * To change this template use File | Settings | File Templates.
 */
public class Dao {
    private static Dao instance = new Dao();

    public static Dao getInstance() {
        return instance;
    }

    private Dao() {

    }

    public <T extends DaoObject> T load(Class<T> clazz, Long id) {
        return JPA.em().find(clazz, id);
    }

    public <T extends DaoObject> List<T> loadAll(Class<T> clazz) {
        return JPA.em().createQuery("from " + clazz.getName()).getResultList();
    }

    public <T> T querySingleFor(Class<T> clazz, String jpaQL, Object... caleIdList) {
        return (T) internalQueryFactory(jpaQL, caleIdList).getSingleResult();
    }

    private Query internalQueryFactory(String jpaQL, Object[] jpaParametersValues) {
        Query query = JPA.em().createQuery(jpaQL);
        for (int i = 0; i < jpaParametersValues.length; i++) {
            query.setParameter(i + 1, jpaParametersValues[i]);
        }
        return query;
    }

    public <T> List<T> queryFor(Class<T> clazz, String jpaQL, Object... jpaParametersValues) {
        return (List<T>) internalQueryFactory(jpaQL, jpaParametersValues).getResultList();
    }

    public DaoObject store(DaoObject elt) {
        return JPA.em().merge(elt);
    }

    public void saveNew(DaoObject elt) {
        JPA.em().persist(elt);
    }

    public void remove(DaoObject elt) {
        JPA.em().remove(elt);
    }
}
