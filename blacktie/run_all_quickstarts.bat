@echo off

echo "Running all quickstarts"

set OLDPWD=%cd%

for /R . %%i in (.) do (
	if exist %%i\run.sh (
 		cd %%i
 		call run.bat %*
		IF %ERRORLEVEL% NEQ 0 exit -1
	)
)

cd /d %OLDPWD%

rem LET THE USER KNOW THE OUTPUT
cd %BLACKTIE_HOME%
echo "All quickstarts ran OK"
