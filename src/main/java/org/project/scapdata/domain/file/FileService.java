package org.project.scapdata.domain.file;


import jakarta.servlet.http.HttpServletRequest;
import org.project.scapdata.domain.file.dto.FileResponse;
import org.project.scapdata.domain.file.dto.UserRespone;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface FileService {
    FileResponse uploadSingleFile(MultipartFile file, HttpServletRequest request);
    List<String> getAllFileNames();
    ResponseEntity<Resource> serveFile(String filename, HttpServletRequest request);

    UserRespone getUser();

}
