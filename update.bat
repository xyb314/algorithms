for /f "tokens=1,2,3 delims=/- " %%a in ("%date%") do @set D=%%a%%b%%c
git add -A
git commit -m "%D% update"
git push origin main