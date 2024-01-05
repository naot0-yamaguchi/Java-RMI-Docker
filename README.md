1. clean_build.batを実行  
2. docker-compose upを実行  
3. 以下の出力になれば成功  
```[+] Running 3/3
 ✔ Network java-rmi-docker_default         Created                                                                                                                                                   0.0s 
 ✔ Container java-rmi-docker-rmi-server-1  Created                                                                                                                                                   0.0s 
 ✔ Container java-rmi-docker-rmi-client-1  Created                                                                                                                                                   0.0s 
Attaching to java-rmi-docker-rmi-client-1, java-rmi-docker-rmi-server-1
java-rmi-docker-rmi-server-1  | RMI Server is running...
java-rmi-docker-rmi-client-1  | serverHost: 192.168.144.2
java-rmi-docker-rmi-client-1  | Response from server: Hello, from the RMI server!
