# study-spring-basic

## 프로젝트 스펙
- Project : Gradle Project
- Spring Boot : 2.7.x
- Language : Java
- Packaging : Jar
- Java : 11

## 비즈니스 요구사항과 설계
- 회원
  - 회원을 가입하고 조회할 수 있다.
  - 회원은 일반과 VIP 두 가지 등급이 있다.
  - 회원 데이터는 자체 DB를 구축할 수 있고, 외부 시스템과 연동할 수 있다. (미확정)
- 주문과 할인 정책
  - 회원은 상품을 주문할 수 있다.
  - 회원 등급에 따라 할인 정책을 적용할 수 있다.
  - 할인 정책은 모든 VIP는 1000원을 할인해주는 고정 금액 할인을 적용해달라. (나중에 변경 될 수 있다.)
  - 할인 정책은 변경 가능성이 높다. 회사의 기본 할인 정책을 아직 정하지 못했고, 오픈 직전까지 고민을 미루고 싶다. 최악의 경우 할인을 적용하지 않을 수 도 있다. (미확정)
 
 ## 회원 도메인 설계
 - 회원 도메인 요구사항
  - 회원을 가입하고 조회할 수 있다.
  - 회원은 일반과 VIP 두 가지 등급이 있다.
  - 회원 데이터는 자체 DB를 구축할 수 있고, 외부 시스템과 연동할 수 있다.(미확정)
 
 ### 회원 도메인 협력 관계
 ![image](https://user-images.githubusercontent.com/51067202/195248971-9c2fcacd-b158-4810-a8ad-22ec0fd55d52.png)
 
 ### 회원 클래스 다이어그램
 ![image](https://user-images.githubusercontent.com/51067202/195249004-f5f9183b-a239-43a6-86ff-469085de167b.png)

 
 
 ### 회원 객체 다이어그램
 ![image](https://user-images.githubusercontent.com/51067202/195249047-6f972e41-c90e-4d2e-a948-1f5cdfbd93df.png)
- 회원 서비스 : MemberServiceImpl
