@echo off
echo Deleting all .class files...
for /r %%i in (*.class) do del "%%i"
echo All .class files deleted.

echo Compiling Start.java...
javac Start.java
if errorlevel 1 goto compile_error

echo Running Start...
java Start
if errorlevel 1 goto run_error

goto end

:compile_error
echo Compilation failed.
goto end

:run_error
echo Running Start failed.
goto end

:end
