@echo off

REM Chemin vers le répertoire contenant les classes
set "classpath=C:\Users\Utilisateur\git\repository\FarmManager\src"

REM Nom complet de la classe principale
set "main_class=fr.webforce.farmManager.App"

REM Exécution de l'application
java -classpath "%classpath%" "%main_class%"
