# iot-dock

#### 用户默认权限

| 用户类型 用户权限 | Local Admin | Local Installer | Local Operator | Cloud Admin | Cloud Operator | Installer Admin | Installer Employee |
| -------------- | ----------- | --------------- | -------------- | ----------- | -------------- | --------------- | ------------------ |
| 布防 | √ | √ | √ | √ | √ | √ | √ | 
| 撤防(包括消警) | √ | √ | √ | √ | √ | √ | √ | 
| 旁路 | √ | √ | × | √ | √ | √ | √ | 
| 查看日志和状态 | √ | √ | × | √ | √ | √ | √ | 
| 参数配置 | √ | √ | × | √ | × | √ | √ | 
| 子系统管理 | √ | √ | × | √ | × | √ | √ | 
| 操作继电器 | √ | √ | 一次性用户：× 临时用户：√ | √ | √ | √ | √ | 
| 修改localAdmin键盘密码 | √ | √ | × | × | × | √ | √ | 
| 修改cloudAdmin键盘密码 | × | √ | × | √ | × | √ | √ | 
| 修改localInstaller键盘密码 | × | √ | × | × | × | × | × | 
| 修改installerAdmin键盘密码 | × | × | × | × | × | √ | × | 
| 修改installerEmployee键盘密码 | × | × | × | × | × | √ | √(只限自己) | 
| 修改localOperator键盘密码 | √ | √ | × | √ | × | √ | √ | 
| 修改cloudOperator键盘密码 | × | √ | × | √ | √(只限 自己) | √ | √ | 
| 修改localAdmin用户权限 | × | × | × | × | × | × | × | 
| 修改cloudAdmin用户权限 | × | × | × | × | × | × | × | 
| 修改localInstaller用户权限 | √ | × | × | √ | × | × | × | 
| 修改installerAdmin用户权限 | √ | × | × | √ | × | × | × | 
| 修改 installerEmployee用户权限 | √ | × | × | √ | × | × | × | 
| 修改localOperator用户权限 | √ | √ | × | √ | × | √ | √ | 
| 修改 cloudOperator用户权限 | × | √ | × | √ | × | √ | √ |