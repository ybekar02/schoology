$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/LoginPage.feature");
formatter.feature({
  "name": "Login",
  "description": "  As user I want to login",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Schoology"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Login as wrogUser",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@trials"
    }
  ]
});
formatter.step({
  "name": "user is on the landing page",
  "keyword": "Given "
});
formatter.step({
  "name": "user logs on with \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "hello",
        "world"
      ]
    },
    {
      "cells": [
        "hpschemistry@gmail.com",
        "hpschemistry@gmail.com"
      ]
    },
    {
      "cells": [
        "selenium",
        "cucumber"
      ]
    },
    {
      "cells": [
        "java",
        "python"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login as wrogUser",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Schoology"
    },
    {
      "name": "@trials"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_the_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logs on with \"hello\" and \"world\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions.user_logs_on_with_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login as wrogUser",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Schoology"
    },
    {
      "name": "@trials"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_the_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logs on with \"hpschemistry@gmail.com\" and \"hpschemistry@gmail.com\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions.user_logs_on_with_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login as wrogUser",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Schoology"
    },
    {
      "name": "@trials"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_the_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logs on with \"selenium\" and \"cucumber\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions.user_logs_on_with_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login as wrogUser",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Schoology"
    },
    {
      "name": "@trials"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_the_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logs on with \"java\" and \"python\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions.user_logs_on_with_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});