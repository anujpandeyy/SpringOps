package SpringOpsApplication.dto;
import java.time.LocalDateTime;

public record CacheResponse(String status,String message,LocalDateTime timeStamp){

}
