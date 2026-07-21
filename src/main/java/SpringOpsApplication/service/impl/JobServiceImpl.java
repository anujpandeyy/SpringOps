package SpringOpsApplication.service.impl;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import SpringOpsApplication.dto.JobResponse;
import SpringOpsApplication.service.JobService;

@Service
public class JobServiceImpl implements JobService{

    private final String status;
    private final String message;

    public JobServiceImpl(@Value("${app.status}") String status,@Value("${app.message}") String message){
        this.status = status;
        this.message = message;
    }

    @Override
    public JobResponse generateReport(){
        return new JobResponse(
            status,
            message,
            true,
            LocalDateTime.now()
        );
    }
}
