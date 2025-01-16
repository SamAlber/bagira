@echo off
echo Running hello_pipeline project...
python main.py
if %errorlevel% neq 0 exit /b %errorlevel%
echo Build succeeded!
