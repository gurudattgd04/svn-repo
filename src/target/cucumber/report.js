$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Stories\\Set the etext preferences.feature");
formatter.feature({
  "id": "set-etext-preferences",
  "tags": [
    {
      "name": "@etextpref",
      "line": 1
    }
  ],
  "description": "",
  "name": "Set etext preferences",
  "keyword": "Feature",
  "line": 2
});
formatter.scenario({
  "id": "set-etext-preferences;set-the-etext-preference-in-work-space",
  "description": "",
  "name": "Set the eText preference in Work Space",
  "keyword": "Scenario",
  "line": 4,
  "type": "scenario"
});
formatter.step({
  "name": "I am on the Global Home page",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "I enter in the MySpanishLabMaster from the Global Home page as HedWsInstructor",
  "keyword": "When ",
  "line": 6
});
formatter.step({
  "name": "I navigate to the Preferences tab",
  "keyword": "And ",
  "line": 7
});
formatter.step({
  "name": "I should be on the Preferences page",
  "keyword": "Then ",
  "line": 8
});
formatter.step({
  "name": "I select LTI Tools sub tab",
  "keyword": "When ",
  "line": 9
});
formatter.step({
  "name": "I set the eText in enable state",
  "keyword": "And ",
  "line": 10
});
formatter.step({
  "name": "I should see the successfull message Preferences updated successfully",
  "keyword": "Then ",
  "line": 11
});
formatter.match({
  "location": "Set_etext_preferences_StepClass.homepageaccess()"
});
formatter.result({
  "duration": 13570935645,
  "status": "passed"
});
formatter.match({
  "location": "Set_etext_preferences_StepClass.courseaccess()"
});
formatter.result({
  "duration": 6645458438,
  "status": "passed"
});
formatter.match({
  "location": "Set_etext_preferences_StepClass.preferencetabaccess()"
});
formatter.result({
  "duration": 5430705551,
  "status": "passed"
});
formatter.match({
  "location": "Set_etext_preferences_StepClass.preferencepagevalidatior()"
});
formatter.result({
  "duration": 20103263,
  "status": "passed"
});
formatter.match({
  "location": "Set_etext_preferences_StepClass.subpreferenceaccess()"
});
formatter.result({
  "duration": 5120425813,
  "status": "passed"
});
formatter.match({
  "location": "Set_etext_preferences_StepClass.etextprefset()"
});
formatter.result({
  "duration": 33362,
  "status": "passed"
});
formatter.match({
  "location": "Set_etext_preferences_StepClass.messagecheck()"
});
formatter.result({
  "duration": 26519,
  "status": "passed"
});
});