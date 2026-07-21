package SpringOpsApplication.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import SpringOpsApplication.dto.HealthResponse;
import SpringOpsApplication.dto.InfoResponse;
import SpringOpsApplication.dto.JobResponse;
import SpringOpsApplication.dto.MaintenanceResponse;
import SpringOpsApplication.dto.CacheResponse;
import SpringOpsApplication.service.CacheService;
import SpringOpsApplication.service.HealthService;
import SpringOpsApplication.service.InfoService;
import SpringOpsApplication.service.JobService;
import SpringOpsApplication.service.MaintenanceService;

@RestController
@RequestMapping("/ops")
public class OpsController {
    private final HealthService healthService;
    private final InfoService infoService;
    private final CacheService cacheService;
    private final JobService jobService;
    private final MaintenanceService maintenanceService;

    public OpsController(HealthService healthService,InfoService infoService,CacheService cacheService,JobService jobService,MaintenanceService maintenanceService){
        this.healthService = healthService;
        this.infoService = infoService;
        this.cacheService = cacheService;
        this.jobService = jobService;
        this.maintenanceService = maintenanceService;
    }

    @GetMapping("/health")
    public HealthResponse getHealth(){
        return healthService.getHealth();
    }

    @GetMapping("/info")
    public InfoResponse getInfo(){
        return infoService.getInfo();
    }

    @GetMapping("/maintenance/status")
    public MaintenanceResponse status(){
        return maintenanceService.status();
    }


    @PostMapping("/cache/clear")
    public CacheResponse clearCache(){
        return cacheService.clearCache();
    }

    @PostMapping("/jobs/report")
    public JobResponse generateReport(){
        return jobService.generateReport();
    }

    @PostMapping("/maintenance/on")
    public MaintenanceResponse enable(){
        return maintenanceService.enable();
    }


    @PostMapping("/maintenance/off")
    public MaintenanceResponse disable(){
        return maintenanceService.disable();
    }


}
