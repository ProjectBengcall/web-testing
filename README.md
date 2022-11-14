<div align="center">
  <a href="https://github.com/ALTA-Bringeee-Group1/Bringeee-API">
    <img src="./bc.png" width="400" height="144">
  </a>

  <p align="center">
    Capstone Program Immersive Alterra Academy
    <br />
    <a href="https://www.figma.com/file/FS9o3dSTRtTSmgwB834nbk/Bengcall-Design?node-id=1%3A144"><strong>| Figma User Interface Design |</strong></a>
    <br />
    <br />
  </p>
</div>

## 📑 About the Project

<p align="justify">You don't have time to go to the workshop or you just simply don't know what's the problem that occured on your vehicle? Well it can be happen to anyone and this is where BengCall is come. BengCall is builded to make you hustle free from maintainig your two-wheels vehicle with fast, reliable, and great service </p>

## 📓 Testing Documentation
[Test Case For WebUI](https://docs.google.com/spreadsheets/d/1O6KXBNgfuOaJJmRbachmq_b3TQBppHi5DMILPnsZIZk/edit?pli=1#gid=1278518793)

## 📝 Reports
<!--
#### Login
![report-api-login](https://user-images.githubusercontent.com/68207916/186056420-bf4e443d-2e33-45e8-a07c-ac6757ceb643.png)

#### Register
![report-api-register](https://user-images.githubusercontent.com/68207916/186057740-8d5ea020-f722-4d6e-a8ba-098efb53426c.png)

#### Chats
![report-api-chats](https://user-images.githubusercontent.com/68207916/186059526-aa1641ed-12c8-47c1-9eae-e8f9aa9daa73.png)
-->

**Automation:**  
![IntellijIDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
![Apache Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)

**Framework for automation:**

![Selenium](https://img.shields.io/badge/-selenium-%43B02A?style=for-the-badge&logo=selenium&logoColor=white)
![Serenity](https://img.shields.io/badge/-serenity-16a67a?style=for-the-badge&logo=serenity&logoColor=black)
![Cucumber](https://img.shields.io/badge/-cucumber-4bc47b?style=for-the-badge&logo=cucumber&logoColor=black)

**Test Case Management:**  

![Google Sheets](https://img.shields.io/badge/-Google%20sheets-4bc47b?style=for-the-badge&logoColor=black)

**Communication:**  

![GitHub](https://img.shields.io/badge/github%20Project-%23121011.svg?style=for-the-badge&logo=github&logoColor=white)
![Discord](https://img.shields.io/badge/Discord-%237289DA.svg?style=for-the-badge&logo=discord&logoColor=white)


## 📱 Our teams

  [![LinkedIn](https://img.shields.io/badge/-Luqman%20Hanung%20Asidiq-white?style=for-the-badge&logo=linkedin&logoColor=blue)](https://www.linkedin.com/in/luqman-hanung-asidiq/)
  [![GitHub](https://img.shields.io/badge/-Luqmanhanung-white?style=for-the-badge&logo=github&logoColor=black)]([https://github.com/Luqmanhanung])

  [![LinkedIn](https://img.shields.io/badge/-Rahdian%20Abdi-white?style=for-the-badge&logo=linkedin&logoColor=blue)](https://www.linkedin.com/in/rahdianabdi/)
  [![GitHub](https://img.shields.io/badge/-rahdianabdi-white?style=for-the-badge&logo=github&logoColor=black)]([https://github.com/rahdian-abdi])

  [![LinkedIn](https://img.shields.io/badge/-Panji%20Eka%20Sukmana-white?style=for-the-badge&logo=linkedin&logoColor=blue)](https://www.linkedin.com/in/panji-eka-sukmana-3b478512b/)
  [![GitHub](https://img.shields.io/badge/-panjiekasukmana-white?style=for-the-badge&logo=github&logoColor=black)]([https://github.com/panjiekasukmana])

  [![LinkedIn](https://img.shields.io/badge/-Riovaldo%20Todoan%20Sihombing-white?style=for-the-badge&logo=linkedin&logoColor=blue)](https://www.linkedin.com/in/todoantodoan/)
  [![GitHub](https://img.shields.io/badge/-eltodoan-white?style=for-the-badge&logo=github&logoColor=black)]([https://github.com/eltodoan])

# Testing Documentation
Testing documentaion for Manual Testing (https://docs.google.com/spreadsheets/d/1O6KXBNgfuOaJJmRbachmq_b3TQBppHi5DMILPnsZIZk/edit?pli=1#gid=1278518793)

## How to run the test
To run the this project, you can either just run the `CucumberTestSuite` test runner class, or run `mvn verify` from terminal.

This is how you run it :

1. Clone the repository
```json
$ git clone https://github.com/ProjectBengcall/web-testing.git
```
2. In case there is a poput asked whether the project based on Maven or Gradle, choose Maven
3. Run this on the IDE terminal
```json
$ mvn clean verify
```

By default, the tests will run using Chrome. You can run them in Firefox by overriding the `driver` system property, e.g.
```json
$ mvn clean verify -Ddriver=firefox
```

The test results will be recorded in the `target/site/serenity` directory.
