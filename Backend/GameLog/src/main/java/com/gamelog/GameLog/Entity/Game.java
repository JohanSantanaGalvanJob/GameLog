/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gamelog.GameLog.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import java.util.Date;

/**
 *
 * @author johan
 */
@Entity
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gameId;
    private String gameTitle;
    private String hoursTaken;
    private float note;
    private Date finishedDate;
    
    @ManyToOne
    @JoinColumn(name = "user_id")  // clave foránea
    private User user;
    
//    @OneToOne
//    @JoinColumn(name = "gamestate_id")
//    private GameState gameState;
//    
//    @OneToOne
}
