# E5 renewal procedure
This project is the source code (backend) of the URL https://e5.qyi.io/
(Front end) https://github.com/luoye663/e5-html
#### Use tutorial
https://qyi.io/archives/687.html

#### Plan:
- [ ] The underlying data uses lightweight H2 storage
- [x] Logs are stored using TDengine/influxdb
- [ ] Remove mysql dependencies
- 
### 2021-08-19
1. Cancel the start of clearing redis  
2. Put the call log into influx to reduce the pressure on MySQL
### 2021-07-28
Remove rabbitMQ dependencies and use the thread pool for simpler implementation (less granularity of execution time)

### 2020-12-20
The front-end framework was changed to Angular, which supports multiple applications at the same time, and supports up to 5 applications per account.
## Description
This project is a beginner for me, code spicy chicken, has been running since March 2020.  
If you want to build it yourself, you have to research it yourself, do not provide technical support (lazy), remember to modify the configuration file 
src/main/resources/application-online.properties
