package SpringOpsApplication.dto;

import java.time.LocalDateTime;

public record JobResponse(String status,String message,boolean reportGenerated,LocalDateTime timestamp) {
    
}
