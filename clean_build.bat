@echo off
cd /d %~dp0

del /s /q /f *.class
del /s /q /f *.jar

echo file clean completed.

javac -d .\bin .\src\jp\co\rmi\MyRMIServer.java .\src\jp\co\rmi\MyRMIServerImpl.java .\src\jp\co\rmi\MyRMIClient.java .\src\jp\co\rmi\MyRMIClientImpl.java

echo compilation completed.

cd bin
jar cfe ..\build\MyRMIServer.jar jp.co.rmi.MyRMIServerImpl jp/co/rmi/MyRMIServer.class jp/co/rmi/MyRMIClient.class jp/co/rmi/MyRMIServerImpl.class
jar cfe ..\build\MyRMIClient.jar jp.co.rmi.MyRMIClientImpl jp/co/rmi/MyRMIServer.class jp/co/rmi/MyRMIClient.class jp/co/rmi/MyRMIClientImpl.class
cd /d %~dp0

echo making jar completed.
