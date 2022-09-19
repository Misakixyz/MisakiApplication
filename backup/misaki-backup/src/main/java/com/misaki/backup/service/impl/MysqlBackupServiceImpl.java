package com.misaki.backup.service.impl;

import com.misaki.backup.service.MysqlBackupService;
import org.springframework.stereotype.Service;

@Service
public class MysqlBackupServiceImpl implements MysqlBackupService {
    /**
     * @param host
     * @param userName
     * @param password
     * @param backupFolderPath
     * @param fileName
     * @param database
     * @return
     * @throws Exception
     */
    @Override
    public boolean backup(String host, String userName, String password, String backupFolderPath, String fileName, String database) throws Exception {
        return false;
    }

    /**
     * @param restoreFilePath
     * @param host
     * @param userName
     * @param password
     * @param database
     * @return
     * @throws Exception
     */
    @Override
    public boolean restore(String restoreFilePath, String host, String userName, String password, String database) throws Exception {
        return false;
    }
}
