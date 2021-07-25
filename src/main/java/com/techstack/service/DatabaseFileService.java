package com.techstack.service;

import com.techstack.entity.DatabaseFile;
import org.springframework.web.multipart.MultipartFile;

public interface DatabaseFileService {
    DatabaseFile storeFile(MultipartFile file);

    DatabaseFile getFile(String fileId);
}
