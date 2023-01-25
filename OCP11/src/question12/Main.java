package question12;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*  TODO: GPT non è sicura al riguardo, facendo però una media la risposta corretta dovrebbe essere module com.company.clients { exports com.company.clients; }
A company has an existing Java app that includes two Java 8 jar files, sales-8.10.jar and clients-10.2.jar.
The jar file, sales-8.10.jar, references packages in clients-10.2.jar, but clients-10.2.jar does not reference packages in sales-8.10.jar.
They have decided to modularize clients-10.2.jar.
Which module-info.java file would work for the new library version clients-10.3.jar?
    module com.company.clients { exports com.company.clients; }
 */
/*
1. module com.company.clients { requires com.company.clients; }
2. module com.company.clients { exports com.company.clients; }
3. module com.company.clients { uses com.company.clients; }
4. module com.company.clients { exports com.company.clients.Client; }

module com.company.clients { exports com.company.clients; } would work best in this scenario.
Explanation:
With this module-info.java file, clients-10.3.jar will be able to export its packages, which will allow the sales-8.10.jar to access them.
module com.company.clients { requires com.company.clients; } is not a valid option because the module does not require itself.
module com.company.clients { exports com.company.clients.Client; } will only export the package com.company.clients.Client, it will not export other packages that sales-8.10.jar might need to access.
module com.company.clients { uses com.company.clients; } is not a valid option because the "uses" directive is used to specify that a module uses one or more service providers, but in this case, clients-10.3.jar is not providing any service to sales-8.10.jar
 */
/*
module com.company.clients { exports com.company.clients; }
This module-info.java file would work for the new library version clients-10.3.jar because it exports the package com.company.clients, which allows other modules, such as the sales-8.10.jar, to use the classes and interfaces in that package.
exports keyword is used to make the package visible to other modules.

module com.company.clients { requires com.company.clients; }
This will not work because requires keyword is used to declare a module dependency on another module. Here we are trying to make module dependency on itself.

module com.company.clients { exports com.company.clients.Client; }
This will work if the package com.company.clients.Client is the only package that the sales-8.10.jar references. But if there are other packages also which are being used then it will not work.

module com.company.clients { uses com.company.clients; }
This will not work because uses keyword is used to declare that a module uses a service (a class that implements a particular interface). Here we are trying to make use of the module itself which is not possible.
 */
public class Main {}