package entity.account;

import java.time.LocalDateTime;

public class AccountHistoryStatus {
    //用户创建时间
    private LocalDateTime createDateTime;

    //上一次登录时间
    private LocalDateTime lastLoginDateTime;

    //上一次修改时间
    private LocalDateTime lastModifyTime;

    //上一次登录地点
    private String lastLoginAddr;

    //常用登录地点
    private String commonLoginAddr;

    //当前登录地点
    private String currentLoginAddr;


}
