# Intro to STS projects
## To get started for the first Java Project
1. Install the STS Eclipse 
2. When STS launches, pick the workspace (folder) you want to use for all the Java assignments/projects
   - Once you picked the workspace, a hidden folder .metadata will be created to keep track of all your project preference. You should use the same workspace/folder for all the projects
3. To create a new Java project, FILE --> NEW --> JAVA PROJECT
   - Follow the platform and make sure it is Java 17
   - Project naming convension -- Not strict, could be PascalCase
   - uncheck module-info
4. To get started, highly recommend to create packages in /src folder
   - Follow the platform (Packages)
   - Right-click on /src to create packages
   - The package name should follow the convension
     - reverse domain name (i.e. com.heidichen.oopdemo)
     - all lower case 
     - no special characters
     - no dash or slash
5. To create java class, right click on the package you created, add a new Class
   - Follow the Java class convension (PascalCase)
   - Check whether you want to check any boxes like adding the main method. 

## Useful tips
1. If you see squeaky red line, it indicates an error. Hover the squeaky line and wait a little bit. The error details will show up. 
   - Possible fixes will be provided but THINK BEFORE YOU USE THEIR FIX. Sometimes, the provided fix is not helping with the error you want to fix. 
2. To generate getters/setters, SOURCE --> GENERATE GETTERS/SETTERS. You can find source at the top / when you right click on the code within the {}. 
3. To run the Java application, right click the project --> Run as --> Java Application
   - It searches for the main method within the project and compile & run it. 