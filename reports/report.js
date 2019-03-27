$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("hellocucumber.feature");
formatter.feature({
  "name": "Login Functionality Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login Functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user navigates to http://localhost:8080/MarioPizzaWeb/index.jsp",
  "keyword": "* "
});
formatter.match({
  "location": "OrderTests.navigatePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user picks the \"pepperoni\" pizza",
  "keyword": "* "
});
formatter.match({
  "location": "OrderTests.pickPizza()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks \"order\"",
  "keyword": "* "
});
formatter.match({
  "location": "OrderTests.makeOrder()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "employee deletes order from user",
  "keyword": "* "
});
formatter.match({
  "location": "OrderTests.deleteOrder()"
});
formatter.result({
  "status": "passed"
});
});