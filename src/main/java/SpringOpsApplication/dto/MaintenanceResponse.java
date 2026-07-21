package SpringOpsApplication.dto;

import java.time.LocalDateTime;

public record MaintenanceResponse(String status,String message,boolean maintenance,LocalDateTime timestamp) {

}
