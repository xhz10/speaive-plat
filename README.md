# 脚手架 #

> 使用指南如下

## 安装 ##

1. 安装教授加到本地
```bash
mvn archetype:create-from-project
```
2. install 装配到本地
```bash
cd target/generated-sources/archetype
mvn install
```

3. 执行命令
```bash
 mvn archetype:generate -DarchetypeGroupId=com.speaive -DarchetypeArtifactId=speaive-plat-archetype -DarchetypeVersion=0.0.1-SNAPSHOT -DgroupId=你的group -DartifactId=你的artifact
```
