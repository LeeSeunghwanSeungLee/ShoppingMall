# ShoppingMall

스프링부트를 이용한 쇼핑몰 토이프로젝트이다.

### 비지니스 요구사항 정리

최소한으로 구성된 기능 개발을 목표로 한다.

1. 데이터 : 회원 아이디, 이름 관리
2. 기능 : 회원 등록 및 조회 기능

## 애플리케이션 계층 구조

1. View : 기본 화면
2. Controller : req 에 대한 res를 전달
3. Service : 핵심 비지니스 로직 관리
4. Respository : 데이터베이스 접근, 도메인 객체를 DB에 저장 및 관리
5. DataBase : 데이터베이스
6. Domain : Entity 역할
