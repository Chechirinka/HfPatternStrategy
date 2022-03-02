set DIR_PROJECT=OOP
del /s %DIR_BIN%\*.class >NUL
javac MiniDucksSimulator.java
java MiniDucksSimulator
pause