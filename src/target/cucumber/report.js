$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Stories\\Launch Etext By Ecollege Instructor.feature");
formatter.feature({
  "id": "launching-of-etext-by-teacher",
  "description": "",
  "name": "launching of etext by teacher",
  "keyword": "Feature",
  "line": 1
});
formatter.background({
  "description": "",
  "name": "",
  "keyword": "Background",
  "line": 3,
  "type": "background"
});
formatter.step({
  "name": "instructor is logged into application",
  "keyword": "Given ",
  "line": 4
});
formatter.step({
  "name": "user access course",
  "keyword": "When ",
  "line": 5
});
formatter.step({
  "name": "Course Home page should display",
  "keyword": "Then ",
  "line": 6
});
formatter.match({
  "location": "LaunchEtextByEcollegeInstructor_StepClass.instructorlogin()"
});
formatter.result({
  "duration": 29272888606,
  "status": "passed"
});
formatter.match({
  "location": "LaunchEtextByEcollegeInstructor_StepClass.courseaccess()"
});
formatter.result({
  "duration": 27089109503,
  "status": "passed"
});
formatter.match({
  "location": "LaunchEtextByEcollegeInstructor_StepClass.coursehomepage()"
});
formatter.result({
  "duration": 50813333,
  "status": "passed"
});
formatter.scenario({
  "id": "launching-of-etext-by-teacher;to-add-etextlink-in-course-material-tab-by-ecollege-teacher",
  "tags": [
    {
      "name": "@etext",
      "line": 8
    }
  ],
  "description": "",
  "name": "To Add eTextLink in course material tab by ECollege Teacher",
  "keyword": "Scenario",
  "line": 9,
  "type": "scenario"
});
formatter.step({
  "name": "I navigate to the Course Materials tab",
  "keyword": "When ",
  "line": 10
});
formatter.step({
  "name": "I should be on the Course Materials page",
  "keyword": "Then ",
  "line": 11
});
formatter.step({
  "name": "I click on the Add Course Materials option",
  "keyword": "When ",
  "line": 12
});
formatter.step({
  "name": "I click on the Add eText Link activity type",
  "keyword": "And ",
  "line": 13
});
formatter.step({
  "name": "I create eText link",
  "keyword": "And ",
  "line": 14
});
formatter.step({
  "name": "I should see the successfull message eText link saved successfully",
  "keyword": "Then ",
  "line": 15
});
formatter.match({
  "location": "LaunchEtextByEcollegeInstructor_StepClass.coursematerialtabaccess()"
});
formatter.result({
  "duration": 57403593808,
  "status": "passed"
});
formatter.match({
  "location": "LaunchEtextByEcollegeInstructor_StepClass.coursematerialspageassert()"
});
formatter.result({
  "duration": 328549003,
  "status": "passed"
});
formatter.match({
  "location": "LaunchEtextByEcollegeInstructor_StepClass.addcontent()"
});
formatter.result({
  "duration": 1471807726,
  "status": "passed"
});
formatter.match({
  "location": "LaunchEtextByEcollegeInstructor_StepClass.AddEtextLink()"
});
formatter.result({
  "duration": 14674733415,
  "status": "passed"
});
formatter.match({
  "location": "LaunchEtextByEcollegeInstructor_StepClass.EtextCreation()"
});
formatter.result({
  "duration": 30945953009,
  "status": "passed"
});
formatter.match({
  "location": "LaunchEtextByEcollegeInstructor_StepClass.SuccessMsg()"
});
formatter.result({
  "duration": 16144577422,
  "status": "passed"
});
});