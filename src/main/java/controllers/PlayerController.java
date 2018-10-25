package controllers;

import models.Player;
import views.PlayerView;

public class PlayerController {
    private Player player;
    private PlayerView playerView;

    public PlayerController(Player player) {
        this.player = player;
    }

}
