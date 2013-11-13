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
formatter.step({
  "name": "Fill the External tool form with required data",
  "keyword": "And ",
  "line": 13
});
formatter.match({
  "location": "CanvasIntegration_StepClass.userformfill()"
});
formatter.result({
  "duration": 21291207769,
  "status": "failed",
  "error_message": "org.openqa.selenium.remote.UnreachableBrowserException: Could not start a new session. Possible causes are invalid address of the remote server or browser start-up failure.\nBuild info: version: \u00272.32.0\u0027, revision: \u00276c40c187d01409a5dc3b7f8251859150c8af0bcb\u0027, time: \u00272013-04-09 10:39:28\u0027\nSystem info: os.name: \u0027Windows 7\u0027, os.arch: \u0027x86\u0027, os.version: \u00276.1\u0027, java.version: \u00271.7.0_25\u0027\nDriver info: driver.version: InternetExplorerDriver\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:216)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:201)\r\n\tat org.openqa.selenium.ie.InternetExplorerDriver.setup(InternetExplorerDriver.java:105)\r\n\tat org.openqa.selenium.ie.InternetExplorerDriver.\u003cinit\u003e(InternetExplorerDriver.java:51)\r\n\tat CanvasPages.login.\u003cinit\u003e(login.java:30)\r\n\tat Stories.CanvasIntegration_StepClass.userformfill(CanvasIntegration_StepClass.java:26)\r\n\tat ✽.Given canvas user enter username and password(Stories\\CanvasIntegration.feature:5)\r\nCaused by: org.openqa.selenium.WebDriverException: Timed out waiting for driver server to start.\nBuild info: version: \u00272.32.0\u0027, revision: \u00276c40c187d01409a5dc3b7f8251859150c8af0bcb\u0027, time: \u00272013-04-09 10:39:28\u0027\nSystem info: os.name: \u0027Windows 7\u0027, os.arch: \u0027x86\u0027, os.version: \u00276.1\u0027, java.version: \u00271.7.0_25\u0027\nDriver info: driver.version: InternetExplorerDriver\r\n\tat org.openqa.selenium.remote.service.DriverService.start(DriverService.java:165)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:62)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:527)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:216)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:201)\r\n\tat org.openqa.selenium.ie.InternetExplorerDriver.setup(InternetExplorerDriver.java:105)\r\n\tat org.openqa.selenium.ie.InternetExplorerDriver.\u003cinit\u003e(InternetExplorerDriver.java:51)\r\n\tat CanvasPages.login.\u003cinit\u003e(login.java:30)\r\n\tat Stories.CanvasIntegration_StepClass.userformfill(CanvasIntegration_StepClass.java:26)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:606)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:44)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:12)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:40)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:35)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:38)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:268)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:45)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:40)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:36)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:83)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:77)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:82)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:252)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:141)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:112)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:606)\r\n\tat org.apache.maven.surefire.util.ReflectionUtils.invokeMethodWithArray(ReflectionUtils.java:189)\r\n\tat org.apache.maven.surefire.booter.ProviderFactory$ProviderProxy.invoke(ProviderFactory.java:165)\r\n\tat org.apache.maven.surefire.booter.ProviderFactory.invokeProvider(ProviderFactory.java:85)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:115)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:75)\r\nCaused by: org.openqa.selenium.net.UrlChecker$TimeoutException: Timed out waiting for [http://localhost:41956/status] to be available after 20004 ms\r\n\tat org.openqa.selenium.net.UrlChecker.waitUntilAvailable(UrlChecker.java:104)\r\n\tat org.openqa.selenium.remote.service.DriverService.start(DriverService.java:163)\r\n\t... 52 more\r\nCaused by: com.google.common.util.concurrent.UncheckedTimeoutException: java.util.concurrent.TimeoutException\r\n\tat com.google.common.util.concurrent.SimpleTimeLimiter.callWithTimeout(SimpleTimeLimiter.java:143)\r\n\tat org.openqa.selenium.net.UrlChecker.waitUntilAvailable(UrlChecker.java:79)\r\n\t... 53 more\r\nCaused by: java.util.concurrent.TimeoutException\r\n\tat java.util.concurrent.FutureTask$Sync.innerGet(FutureTask.java:258)\r\n\tat java.util.concurrent.FutureTask.get(FutureTask.java:119)\r\n\tat com.google.common.util.concurrent.SimpleTimeLimiter.callWithTimeout(SimpleTimeLimiter.java:130)\r\n\t... 54 more\r\n"
});
formatter.match({
  "location": "CanvasIntegration_StepClass.signin()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CanvasIntegration_StepClass.homepage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CanvasIntegration_StepClass.courseaccess()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CanvasIntegration_StepClass.settingsaccess()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CanvasIntegration_StepClass.Appslink_access()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CanvasIntegration_StepClass.viewinstallappaccess()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CanvasIntegration_StepClass.Addnewapp_access()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CanvasIntegration_StepClass.Externaltool_formfill()"
});
formatter.result({
  "status": "skipped"
});
});