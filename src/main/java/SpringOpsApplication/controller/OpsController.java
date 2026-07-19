package SpringOpsApplication.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import SpringOpsApplication.dto.HealthResponse;
import SpringOpsApplication.dto.InfoResponse;
import SpringOpsApplication.dto.CacheResponse;
import SpringOpsApplication.service.CacheService;
import SpringOpsApplication.service.HealthService;
import SpringOpsApplication.service.InfoService;

@RestController
@RequestMapping("/ops")
public class OpsController {
    private final HealthService healthService;
    private final InfoService infoService;
    private final CacheService cacheService;

    public OpsController(HealthService healthService,InfoService infoService,CacheService cacheService){
        this.healthService = healthService;
        this.infoService = infoService;
        this.cacheService = cacheService;
    }

    @GetMapping("/health")
    public HealthResponse getHealth(){
        return healthService.getHealth();
    }

    @GetMapping("/info")
    public InfoResponse getInfo(){
        return infoService.getInfo();
    }

    @PostMapping("/cache/clear")
    public CacheResponse clearCache(){
        return cacheService.clearCache();
    }

}
