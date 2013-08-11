package fr.nemak3.db;

import fr.nemak3.core.GameObject;
import org.jetbrains.annotations.NotNull;
import play.db.jpa.JPA;

import javax.persistence.Query;
import java.util.List;

public class Dao {
    private static Dao instance = new Dao();

    public static Dao getInstance() {
        return instance;
    }

    private Dao() {

    }

    public <T extends GameObject> T load(@NotNull Class<T> clazz, @NotNull Long id) {
        return JPA.em().find(clazz, id);
    }

    public <T extends GameObject> List<T> loadAll(@NotNull Class<T> clazz) {
        return JPA.em().createQuery("from " + clazz.getName()).getResultList();
    }

    public <T> T querySingleFor(@NotNull Class<T> clazz, @NotNull String jpaQL, @NotNull Object... idList) {
        return (T) internalQueryFactory(jpaQL, idList).getSingleResult();
    }

    private Query internalQueryFactory(@NotNull String jpaQL, @NotNull Object[] jpaParametersValues) {
        Query query = JPA.em().createQuery(jpaQL);
        for (int i = 0; i < jpaParametersValues.length; i++) {
            query.setParameter(i + 1, jpaParametersValues[i]);
        }
        return query;
    }

    public <T> List<T> queryFor(@NotNull Class<T> clazz, @NotNull String jpaQL, @NotNull Object... jpaParametersValues) {
        return (List<T>) internalQueryFactory(jpaQL, jpaParametersValues).getResultList();
    }

    public <T> List<T> nativeQuery(@NotNull Class<T> clazz, @NotNull String nativeSqlQuery)
    {
        Query query = JPA.em().createNativeQuery(nativeSqlQuery,clazz);
        return (List<T>)query.getResultList();
    }

    public GameObject store(@NotNull GameObject elt) {
        return JPA.em().merge(elt);
    }

    public void saveNew(@NotNull GameObject elt) {
        JPA.em().persist(elt);
    }

    public void remove(@NotNull GameObject elt) {
        JPA.em().remove(elt);
    }
}
