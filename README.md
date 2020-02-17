# FarmDataApi

Changes made:

1. I used Java Springboot JPA to create my API. this lets me get json and xml easily from my api depending on the clients request.

2. I used Javascript to visualize my data with a bar graph as it is more coherent and easy to read and understand.

3. I used PHP libraries to validate my JSON and XML data against my Schemas.

4. I added restrictions to my schema to make sure proper data is passed through alone.

## Setup

First of all Clone this repo,

Open /FarmAPI in IntelliJ as a project,

change the applications.properties file's database directory to that of your local device. Dont forget to export the database to your localhost using phpMyAdmin,

Install all dependencies,

Run FarmDataTracker.Java,

you can test routes by using postman,

To run the client, save the /FarmCLIENT folder to your htdoc(localhost),

Note: make sure youre running both API and Client on different ports.

Each client page is linked to one another for easy navigation.


