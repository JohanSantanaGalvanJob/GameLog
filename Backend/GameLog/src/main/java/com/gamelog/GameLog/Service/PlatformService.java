/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gamelog.GameLog.Service;

import com.gamelog.GameLog.Entity.Platform;
import java.util.List;

/**
 *
 * @author johan
 */
public interface PlatformService {

    Platform save(Platform pPlatform);

    List<Platform> findAll();

    Platform findById(Integer pPlatformId);

    void deleteById(Integer pPlatformId);

    Platform update(Platform pPlatform);
}
