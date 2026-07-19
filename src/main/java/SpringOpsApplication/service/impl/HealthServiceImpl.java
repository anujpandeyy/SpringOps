package SpringOpsApplication.service.impl;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import SpringOpsApplication.dto.HealthResponse;
import SpringOpsApplication.service.HealthService;

@Service
public class HealthServiceImpl implements HealthService{
    
  
    private final String applicationName;
    public HealthServiceImpl(@Value("${spring.application.name}") String applicationName){
        this.applicationName = applicationName;
    }
    @Override
    public HealthResponse getHealth(){
        return new HealthResponse(
            "UP",
            applicationName,
            LocalDateTime.now()
        );
    }
}
