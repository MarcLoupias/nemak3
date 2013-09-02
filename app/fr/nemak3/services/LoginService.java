package fr.nemak3.services;

import fr.nemak3.core.Player;
import fr.nemak3.db.Dao;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class LoginService {
    private static LoginService instance = new LoginService();

    public static LoginService getInstance() {
        return instance;
    }

    private LoginService() {

    }

    @Nullable
    public Player login(@NotNull Dao db, @NotNull String login, @NotNull String pwd) {
        Player player = db.querySingleFor(Player.class, "from Player where login = ?1", login);
        if(player == null){
            return null;
        }

        if(!pwd.equals(player.getPwd())){
            return null;
        }

        return player;
    }
}
