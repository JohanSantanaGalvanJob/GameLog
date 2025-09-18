/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gamelog.GameLog.Service;

import com.gamelog.GameLog.Entity.Platform;
import com.gamelog.GameLog.Exception.ResourceNotFoundException;
import com.gamelog.GameLog.Repository.PlatformRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author johan
 */
@Service
public class PlatformServiceImpl implements PlatformService{
        private final PlatformRepository platformRepository;

    public PlatformServiceImpl(PlatformRepository pPlatformRepository) {
        this.platformRepository = pPlatformRepository;
    }

    @Override
    public Platform save(Platform pPlatform) {
        return platformRepository.save(pPlatform);
    }

    @Override
    public List<Platform> findAll() {
        return platformRepository.findAll();
    }

    @Override
    public Platform findById(Integer pPlatformId) {
        Platform lPlatform = platformRepository.findById(pPlatformId).orElseThrow(
                () -> {
                    throw new ResourceNotFoundException("Platform with ID "+pPlatformId+" not found");
                });
        return lPlatform;
    }

    @Override
    public void deleteById(Integer pPlatformId) {
        platformRepository.deleteById(pPlatformId);
    }

    @Override
    public Platform update(Platform pPlatform) {
        return platformRepository.save(pPlatform);
    }
}
