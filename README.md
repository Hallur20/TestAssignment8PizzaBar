# TestAssignment8PizzaBar


<h1>Test Assignment 8 (Mario PizzaBar)</h1>

<h3>Description</h3>

<p>This project is about doing automated tests, continuing from assignment 6, which was about testing creating/deleting orders in tests with mocking. We have built upon this by using celenium / cucumber so that we made it possible to do automated tests in a web project.</p>

<h3>instructions</h3>

<p>in order to run the project, you need to clone it, and you will need a tomcat server <a href="https://tomcat.apache.org/download-80.cgi"> (link here)</a>, you will also need a chromedriver (we use version 73) which you can download <a href="http://chromedriver.chromium.org/">here.</a> After you have downloaded the neccesary files, you will need to change the url in OrderTests at line 39 in the second string into the path of where your chromedriver is located. After all this you should be able to run the project. Click run, then after the webserver is started then right click RunCucumberTest and click "Test File". If all goes well you should get the same results as in the images below. If for some reason you will be asked for a tomcat password you did not make yourself, then try the password we used : 123</p>

<h3>What do our automated tests do?</h3>
<p>With cucumber, Serenium and Mockito, we made it possible to mock a customer. The customer orders a pepperoni pizza by picking it 
in the radio buttons and then he clicks the order pizza button. Then the employee clicks on remove order, and after 2 seconds a message will confirm that the order has been removed. Also there is a list in the backend containing the order where we do testing on the size both before and after deleting order.
</p>

<img src="https://github.com/Hallur20/TestAssignment8PizzaBar/blob/master/Capture1.PNG" alt="c1"/><br/><br/><br/>
<img src="https://github.com/Hallur20/TestAssignment8PizzaBar/blob/master/Capture2.PNG" alt="c2"/><br/><br/><br/>
<img src="https://github.com/Hallur20/TestAssignment8PizzaBar/blob/master/Capture3.PNG" alt="c3"/>
