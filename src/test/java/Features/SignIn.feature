#By creating a feature file which consists of feature, tags and scenarios and scenario outline as applicable.
#For automation testing with Selenium & Cucumber framework for Java, we need to create SignInFeature.feature file 
#under Features package with below content under “src/main/resources” path.
Feature: Signin Page feature file

  Scenario Outline: Verify Signin with valid credentials username and password
    When User Enter "<Username>" and "<Password>"
    Then Check user should login

    Examples: 
      | Username | Password |
      | priyadeosarkar@gmail.com      | priyankaS1113  |
      | priyadeosarkar91@gmail.com		 | priyanka1113  |
      | priyadeosarkar91@gmail.com		 | Priyanka$1113  |