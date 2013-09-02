package fr.nemak3.services;

import fr.nemak3.core.Player;
import fr.nemak3.db.Dao;
import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LoginServiceTest {
    @Test
    public void testLoginFail_PlayerNotFound() {

        Dao mockedDao = mock(Dao.class);
        when(mockedDao.querySingleFor(Player.class, "from Player where login = ?1", "toto")).thenReturn(
                null
        );

        assertNull("Login should have failed ...",
                LoginService.getInstance().login(mockedDao, "toto", "mp")
        );
    }

    @Test
    public void testLoginFail_BadPassword() {

        Player p = new Player();
        p.setId(1l);
        p.setLogin("toto");
        p.setPwd("mp");

        Dao mockedDao = mock(Dao.class);
        when(mockedDao.querySingleFor(Player.class, "from Player where login = ?1", "toto")).thenReturn(
                p
        );

        Player res = LoginService.getInstance().login(mockedDao, "toto", "bad_pwd");

        assertNull("Login should have failed ...", res);
    }

    @Test
    public void testLoginSuccessful() {

        Player p = new Player();
        p.setId(1l);
        p.setLogin("toto");
        p.setPwd("good_pwd");

        Dao mockedDao = mock(Dao.class);
        when(mockedDao.querySingleFor(Player.class, "from Player where login = ?1", "toto")).thenReturn(
                p
        );

        Player res = LoginService.getInstance().login(mockedDao, "toto", "good_pwd");

        assertNotNull("Login should have been successful ...", res);
    }
}
