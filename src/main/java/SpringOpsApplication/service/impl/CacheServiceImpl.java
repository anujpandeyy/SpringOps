package SpringOpsApplication.service.impl;
import SpringOpsApplication.dto.CacheResponse;
import java.time.LocalDateTime;

import org.springframework.stereotype.Service;
import SpringOpsApplication.service.CacheService;

@Service
public class CacheServiceImpl implements CacheService{
    @Override
    public CacheResponse clearCache(){
        return new CacheResponse(
            "SUCCESS",
            "Cache cleared successfully",
            LocalDateTime.now()
        );
    }
}
