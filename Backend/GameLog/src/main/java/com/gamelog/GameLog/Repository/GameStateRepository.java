/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gamelog.GameLog.Repository;

import com.gamelog.GameLog.Entity.GameState;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author johan
 */
public interface GameStateRepository extends JpaRepository<GameState, Integer> {
    
}
