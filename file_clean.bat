@echo off
cd /d %~dp0

rem Delete *.class files
del /s /q /f *.class

rem Delete *.jar files
del /s /q /f *.jar

echo Cleanup completed.
pause
