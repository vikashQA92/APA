set projectPath=C:\Users\workspace\TestProject
cd %projectPath%
set classpath=%projectPath%\bin;%projectPath%\lib\*;
java org.testng.TestNG servcorp.xml

pause

