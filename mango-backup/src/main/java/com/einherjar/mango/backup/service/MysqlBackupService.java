package com.einherjar.mango.backup.service;

/**
 * @author :   einherjar
 * @date :   2019-09-16 19:35
 */
public interface MysqlBackupService {
    /**
     * 备份数据库
     * @param host
     * @param userName
     * @param password
     * @param backupFolderPath
     * @param fileName
     * @param database 需要备份的数据库的名称
     * @return
     * @throws Exception
     */
    boolean backup(String host, String userName, String password, String backupFolderPath, String fileName, String database) throws Exception;

    /**
     * 恢复数据库
     * @param restoreFilePath
     * @param host
     * @param userName
     * @param password
     * @param database
     * @return
     * @throws Exception
     */
    boolean restore(String restoreFilePath, String host, String userName, String password, String database) throws Exception;
}
