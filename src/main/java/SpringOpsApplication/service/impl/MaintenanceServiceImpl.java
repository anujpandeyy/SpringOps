package SpringOpsApplication.service.impl;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import SpringOpsApplication.dto.MaintenanceResponse;
import SpringOpsApplication.service.MaintenanceService;

@Service
public class MaintenanceServiceImpl implements MaintenanceService{
    private boolean maintenance = false;
    @Override
    public MaintenanceResponse enable(){
        maintenance = true;
        return new MaintenanceResponse(
            "SUCCESS",
            "Maintenance mode is enabled",
            maintenance,
            LocalDateTime.now()
        );
    }

    @Override
    public MaintenanceResponse disable(){
        maintenance = false;
        return new MaintenanceResponse(
            "SUCCESS",
            "Maintenance mode is disabled",
            maintenance,
            LocalDateTime.now()
        );

    }

    @Override
    public MaintenanceResponse status(){
        return new MaintenanceResponse(
            "SUCCESS",
            "Maintenance status retrieved successfully",
            maintenance,
            LocalDateTime.now()
        );
    }
}
