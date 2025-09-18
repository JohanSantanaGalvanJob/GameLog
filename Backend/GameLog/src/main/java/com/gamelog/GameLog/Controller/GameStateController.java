/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gamelog.GameLog.Controller;

import com.gamelog.GameLog.Entity.GameState;
import com.gamelog.GameLog.Entity.Platform;
import com.gamelog.GameLog.Service.GameStateService;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author johan
 */
@RestController
//http://localhost:8080/api/gamestates
@RequestMapping("/api/gamestates")
@CrossOrigin(origins = "http://localhost:4200")
public class GameStateController {

    private final GameStateService gameStateService;

    public GameStateController(GameStateService gameStateService) {
        this.gameStateService = gameStateService;
    }

    @PostMapping
    public GameState save(@RequestBody GameState pGameState) {
        return gameStateService.save(pGameState);
    }

    @GetMapping
    public List<GameState> findAll() {
        return gameStateService.findAll();
    }

    @GetMapping("/{pGameStateId}")
    public GameState findById(@PathVariable Integer pGameStateId) {
        return gameStateService.findById(pGameStateId);
    }

    @DeleteMapping("/{pGameStateId}")
    public void deleteById(@PathVariable Integer pGameStateId) {
        gameStateService.deleteById(pGameStateId);
    }

    @PutMapping
    public GameState updateUser(@RequestBody GameState pPlatform) {
        GameState lGameStateDb = gameStateService.findById(pPlatform.getGameStateId());
        lGameStateDb.setGameStateName(pPlatform.getGameStateName());
        return gameStateService.update(lGameStateDb);
    }

}
