$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Stories\\CanvasIntegration.feature");
formatter.feature({
  "id": "canvas-integration-with-pegasus",
  "tags": [
    {
      "name": "@canvas",
      "line": 1
    }
  ],
  "description": "",
  "name": "Canvas integration with pegasus",
  "keyword": "Feature",
  "line": 2
});
formatter.scenario({
  "id": "canvas-integration-with-pegasus;upon-canvas-instructor-logs-in-he-should-see-the-home-page",
  "description": "",
  "name": "Upon canvas instructor logs in he should see the home page",
  "keyword": "Scenario",
  "line": 4,
  "type": "scenario"
});
formatter.step({
  "name": "canvas user enter username and password",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "clicks on sign in button",
  "keyword": "When ",
  "line": 6
});
formatter.step({
  "name": "user should see home page",
  "keyword": "Then ",
  "line": 7
});
formatter.step({
  "name": "user access the course",
  "keyword": "When ",
  "line": 8
});
formatter.step({
  "name": "Click on Settings Clicks",
  "keyword": "And ",
  "line": 9
});
formatter.step({
  "name": "Access Apps link",
  "keyword": "And ",
  "line": 10
});
formatter.step({
  "name": "instructor click on View installed apps button",
  "keyword": "When ",
  "line": 11
});
formatter.step({
  "name": "clicks on Add New App button",
  "keyword": "And ",
  "line": 12
});
formatter.match({
  "location": "CanvasIntegration_StepClass.userformfill()"
});
formatter.result({
  "duration": 13923157862,
  "status": "passed"
});
formatter.match({
  "location": "CanvasIntegration_StepClass.signin()"
});
formatter.result({
  "duration": 3333887950,
  "status": "passed"
});
formatter.match({
  "location": "CanvasIntegration_StepClass.homepage()"
});
formatter.result({
  "duration": 21118082,
  "status": "passed"
});
formatter.match({
  "location": "CanvasIntegration_StepClass.courseaccess()"
});
formatter.result({
  "duration": 8537152436,
  "status": "passed"
});
formatter.match({
  "location": "CanvasIntegration_StepClass.settingsaccess()"
});
formatter.result({
  "duration": 7710526620,
  "status": "passed"
});
formatter.match({
  "location": "CanvasIntegration_StepClass.Appslink_access()"
});
formatter.result({
  "duration": 1245437774,
  "status": "passed"
});
formatter.match({
  "location": "CanvasIntegration_StepClass.viewinstallappaccess()"
});
formatter.result({
  "duration": 1407378433,
  "status": "passed"
});
formatter.match({
  "location": "CanvasIntegration_StepClass.Addnewapp_access()"
});
formatter.result({
  "duration": 10340241382,
  "status": "passed"
});
});