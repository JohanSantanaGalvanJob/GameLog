/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gamelog.GameLog.Controller;

import com.gamelog.GameLog.Entity.Platform;
import com.gamelog.GameLog.Service.PlatformService;
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
//http://localhost:8080/api/platforms
@RequestMapping("/api/platforms")
@CrossOrigin(origins = "http://localhost:4200")
public class PlatformController {

    private final PlatformService platformService;

    public PlatformController(PlatformService pPlatformService) {
        this.platformService = pPlatformService;
    }

    @PostMapping
    public Platform save(@RequestBody Platform pPlatform) {
        return platformService.save(pPlatform);
    }

    @GetMapping
    public List<Platform> findAll() {
        return platformService.findAll();
    }

    @GetMapping("/{pPlatformId}")
    public Platform findById(@PathVariable Integer pPlatformId) {
        return platformService.findById(pPlatformId);
    }

    @DeleteMapping("/{pPlatformId}")
    public void deleteById(@PathVariable Integer pPlatformId) {
        platformService.deleteById(pPlatformId);
    }

    @PutMapping
    public Platform updateUser(@RequestBody Platform pPlatform) {
        Platform lPlatformDb = platformService.findById(pPlatform.getPlatformId());
        lPlatformDb.setPlatformName(pPlatform.getPlatformName());
        return platformService.update(lPlatformDb);
    }

}
