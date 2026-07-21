package SpringOpsApplication.service;

import SpringOpsApplication.dto.MaintenanceResponse;

public interface MaintenanceService {
    MaintenanceResponse enable();
    MaintenanceResponse disable();
    MaintenanceResponse status();
}
