/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gamelog.GameLog.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 *
 * @author johan
 */
@Entity
public class GameState {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gameStateId;
    private String gameStateName;

    public GameState() {
    }

    public GameState(Integer gameStateId, String gameStateName) {
        this.gameStateId = gameStateId;
        this.gameStateName = gameStateName;
    }

    public Integer getGameStateId() {
        return gameStateId;
    }

    public void setGameStateId(Integer gameStateId) {
        this.gameStateId = gameStateId;
    }

    public String getGameStateName() {
        return gameStateName;
    }

    public void setGameStateName(String gameStateName) {
        this.gameStateName = gameStateName;
    }
}
