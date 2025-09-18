/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gamelog.GameLog.Service;

import com.gamelog.GameLog.Entity.GameState;
import java.util.List;

/**
 *
 * @author johan
 */
public interface GameStateService {

    GameState save(GameState pGameState);

    List<GameState> findAll();

    GameState findById(Integer pGameStateId);

    void deleteById(Integer pGameStateId);

    GameState update(GameState pGameState);
}
