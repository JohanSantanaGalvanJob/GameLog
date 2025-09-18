/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gamelog.GameLog.Repository;

import com.gamelog.GameLog.Entity.Platform;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author johan
 */
public interface PlatformRepository extends JpaRepository<Platform, Integer>{
    
}
