package com.einherjar.mango.backup.service.impl;

import com.einherjar.mango.backup.service.MysqlBackupService;
import com.einherjar.mango.backup.util.MysqlBackupRestoreUtils;
import org.springframework.stereotype.Service;

/**
 * @author :   einherjar
 * @date :   2019-09-16 19:40
 */
@Service
public class MysqlBackupServiceImpl implements MysqlBackupService {
    @Override
    public boolean backup(String host, String userName, String password, String backupFolderPath, String fileName, String database) throws Exception {
        return MysqlBackupRestoreUtils.backup(host, userName, password, backupFolderPath, fileName, database);
    }

    @Override
    public boolean restore(String restoreFilePath, String host, String userName, String password, String database) throws Exception {
        return MysqlBackupRestoreUtils.restore(restoreFilePath, host, userName, password, database);
    }
}
