package SpringOpsApplication.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import SpringOpsApplication.dto.InfoResponse;
import SpringOpsApplication.service.InfoService;

@Service
public class InfoServiceImpl implements InfoService{
    
    private final String application;
    private final String version;

    public InfoServiceImpl(@Value("${spring.application.name}") String application,@Value("${spring.application.version}") String version){
        this.application = application;
        this.version = version;
    }

    private String java = System.getProperty("java.version");
    private String up = "Running";
    @Override
    public InfoResponse getInfo(){
        return new InfoResponse(
            application,
            version,
            java,
            up
        );
    }
}
