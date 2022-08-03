# Java

- [생활코딩](https://www.youtube.com/watch?v=qR90tdW0Hbo&list=PLuHgQVnccGMCeAy-2-llhw3nWoQKUvQck&index=2)

- [동빈나](https://www.youtube.com/watch?v=wjLwmWyItWI&list=PLRx0vPvlEmdBjfCADjCc41aD4G0bmdl4R)

---

### 왜 Java를 학습해야 하는가?

- 한국에서는 정부나 기업의 시스템 통합 프로젝트가 대부분 자바로 구현됨

- 자바는 기업용 시장에서 두각을 나타내고 있다.

- SI - 시스템 통합
  
  - System Integration
  
  - 기관이나 기업의 업무 관리를 소프트웨어화하는 것을 의미한다.
  
  - 제조 공정의 경우 생산설비의 상태를 시스템적으로 관리

- 자바 언어에대한 학습 자료가 매우 풍부함 - 1995년 시작

- 국내에서 자바는 가장 시장 규모가 큰 언어입니다.
  
  - 기업용 시장에서 전통적인 강자
  
  - 안드로이드가 주류가 되면서 다시 한 번 그 중요성이 커짐
  
  - JSP (웹 에플리케이션), 안드로이드

---

### Java 용어

- Java SE
  
  - Java Platform Standard Edition 자바 표준안
  
  - 이 명세서에 따라서 Java가 만들어지게 된다.

- JCP
  
  - Java Community Process
  
  - JCP는 Java 기술에 대한 표준 기술 사양을 개발하기 위한 메커니즘, 조직

- JDK
  
  - Java Development Kit
  
  - Java SE의 표준안에 따라서 만들어진 소프트웨어
  
  - 컴파일러, 개발에 필요한 각종도구, JRE가 포함되어 있음
  
  - **개발자**를 위한 자바 버전
  
  - 3가지 분류가 있음
    
    - Java SE
    
    - Java EE - 기업용
    
    - Java Me - 모바일

- JRE
  
  - Java Runtime Environment
  
  - 자바가 실제로 동작하는데 필요한 JVM, 라이브러리, 각종 파일들이 포함되어 있음
  
  - **일반 사용자**가 자바로 만들어진 프로그램을 구동하려고 한다면 JRE가 필요함

- JVM
  
  - Java Virtual Machine
  
  - 자바로 만들어진 소프트웨어가 가상화된 환경에서 구동됨
  
  - 하드웨어나 운영체제에 따라서 달라질 수 있는 호환성의 문제는 JVM이 알아서 해결
  
  - 즉, 자바 프로그램이 어떤 환경에서도 실행할 수 있도록 하는 것이 JVM의 역할

---

### Java 설치

- <img title="" src="Java_assets/2022-08-03-22-48-11-image.png" alt="" data-align="center">

- ![](Java_assets/2022-08-03-22-49-35-image.png)

- 원래는 이후에 환경변수 설정을 통해서 javac (컴파일 프로그램)이 있는 경로(C:\Program Files\Java\jdk-18.0.2\bin) 를 환경변수 path에 추가해 주어야하는데 최근 버전은 이러한 작업을 설치시 자동으로 해주는 것 같습니다.

---

### Java 실행

- ![](Java_assets/2022-08-03-23-03-40-image.png)

- ```bash
  $ touch Helloworld.java
  ```
  
  - 파일 생성 후 메모장으로 실행!

- ```java
  class Helloworld {
      public static void main(String[] args){
          System.out.println("Hello World");
      }
  }
  ```
  
  - 내용 입력 후 저장
  
  - ![](Java_assets/2022-08-03-23-25-39-image.png)

- ```bash
  $ javac Helloworld.java
  ```
  
  - 해당 명령어를 실행하면 컴파일 해서 바이트 코드 생성
  
  - Helloworld.class 가 생성됨

- ```bash
  $ java Helloworld
  ```
  
  - bash창에 결과가 출력됨
  
  - ![](Java_assets/2022-08-03-23-26-50-image.png)

---

### 이클립스 설치
