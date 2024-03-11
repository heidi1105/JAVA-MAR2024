# Welcome to the JAVA stack with Heidi

## Schedule 
<table>
<thead>
    <th></th>
    <th></th>
    <th> Category </th>
    <th> Topic </th>
    <th> Remarks</th>
</thead>
    <tbody>
    <tr>
        <td>W1D1 </td>
        <td>1</td>
        <td>Java Fundamentals</td>
        <td>Fundamentals </td>
        <td>(<a href="./Java1Fundamentals/">Code</a>)</td>
    </tr>
    <tr>
        <td>W1D2 </td>
        <td>2</td>
        <td>Java OOP</td>
        <td>OOP, access modifier, constructors 
        </td>
 <td> <a href="./Java2OOP/OOP1/">OOP1</a> | <a href="./Java2OOP/OOP2/">OOP2</a> | <a href="./Java2OOP/OOP3/">OOP3</a></td>
    <tr>
        <td>W1D3 </td>
        <td></td>
        <td> - Advanced OOP</td>
        <td> Inheritance, Interface</td>
        <td> (<a href="./Java2OOP/readme.md">Tips on STS</a>)</td>
    </tr>
        <tr>
        <td>W1D4 </td>
        <td></td>
        <td> - Java Hackathon</td>
        <td></td>
        <td></td>
    </tr>
    <tr>
        <td>W1D5 </td>
        <td>3</td>
        <td>Spring</td>
        <td>RestController, Routes, jsp, jstl</td>
        <td><a href="./Java3Spring/">Notes</a> | <a href="./Java3Spring/spring-jsp-demo/"> Code </a> </td>
    </tr>
    <tr>
        <td>W2D1 </td>
        <td></td>
        <td></td>
        <td>Sessions & Form</td>
        <td>(<a href="./Java3Spring/spring-session-form-demo/">Code</a>)</td>
    </tr>
    <tr>
        <td>W2D2 </td>
        <td>4</td>
        <td> MVC </td>
        <td>API CRUD, Web Dashboard & Details</td>
        <td>
        </td>
    </tr>
    <tr>
        <td>W2D3 </td>
        <td></td>
        <td></td>
        <td>Web CRUD, Data binding & form:form </td>
        <td> </td>
    </tr>
    <tr>
        <td> W2D4 </td>
        <td></td>
        <td>Relationships</td>
        <td>One-to-many notes</td>
        <td></td>
    </tr>
    <tr>
        <td> W2D5 </td>
        <td>5</td>
        <td>Auth</td>
        <td></td>
        <td></td>
    </tr>
    <tr>
        <td> W3D1 </td>
        <td></td>
        <td>Full Spring with Auth</td>
        <td> </td>
        <td> </td>
    </tr>
    <tr>
        <td> </td>
        <td></td>
        <td>More on the exam</td>
        <td> </td>
        <td> </td>
    </tr>
    </tbody>
</table>

## Eclipse Shortcut
| Windows | Mac    | Functions |
|----------------- | -----------------| --------------|
| Alt + Shift S  | Command + Option+ S| Open Source to create getter/setter|
| Ctrl + Shift+ O  | Command + Shift +O | Autoimport |
| Ctrl + Shift + T | Command + Shift + T| Open / Search for types, very useful in finding classes|
| Alt + up/down | Option + up/down | Move the line up / down |
| Ctrl + Shift + F| Command + Shift + F | Auto-format | 
|Alt + Shift + R|Command + Option + R|Rename of package, class etc|


## Common errors

### To kill a running port
1. run the first command to get the PID of the port
2. kill the port with the PID. 

    #### **Mac/Linux**
    - to getting the background process and find the PID
    ```lsof -i:8080 ```

    - To kill the PID
    ```kill -9 <PID> ```

    #### **Windows**
    - to getting the background process and find the PID
    ```netstat -ano | findstr :8080```
    - To kill the PID
    ```taskkill /PID <PID> /F ```

