/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gamelog.GameLog.Service;

import com.gamelog.GameLog.Entity.GameState;
import com.gamelog.GameLog.Exception.ResourceNotFoundException;
import com.gamelog.GameLog.Repository.GameStateRepository;
import java.util.List;

/**
 *
 * @author johan
 */
public class GameStateServiceImpl implements GameStateService {
    
    private final GameStateRepository gameStateRepository;

    public GameStateServiceImpl(GameStateRepository pGameStateRepository) {
        this.gameStateRepository = pGameStateRepository;
    }

    @Override
    public GameState save(GameState pGameState) {
        return gameStateRepository.save(pGameState);
    }

    @Override
    public List<GameState> findAll() {
        return gameStateRepository.findAll();
    }

    @Override
    public GameState findById(Integer pGameStateId) {
        GameState lGameState = gameStateRepository.findById(pGameStateId).orElseThrow(
                () -> {
                    throw new ResourceNotFoundException("GameState with ID "+pGameStateId+" not found");
                });
        return lGameState;
    }

    @Override
    public void deleteById(Integer pGameStateId) {
        gameStateRepository.deleteById(pGameStateId);
    }

    @Override
    public GameState update(GameState pGameState) {
        return gameStateRepository.save(pGameState);
    }
    
}
