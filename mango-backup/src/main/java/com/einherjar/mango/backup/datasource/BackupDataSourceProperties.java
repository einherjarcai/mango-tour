package com.einherjar.mango.backup.datasource;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author :   einherjar
 * @date :   2019-09-16 19:29
 */
@Data
@Component
@ConfigurationProperties(prefix = "mango.backup.datasource")
public class BackupDataSourceProperties {
    private String host;

    private String userName;

    private String password;

    private String database;
}
