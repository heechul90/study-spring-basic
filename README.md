# study-spring-basic 저장소입니다.

## 인프런 강의명 : [스프링 핵심 원리 - 기본편](https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81-%ED%95%B5%EC%8B%AC-%EC%9B%90%EB%A6%AC-%EA%B8%B0%EB%B3%B8%ED%8E%B8)

## 강의 전체 목차
1. 객체 지향 설계와 스프링
    > 모든 설계에 역할과 구현을 분리하자. 
    >> 이상적으로는 모든 설계에 인터페이스를 부여해야 하지만 추상화라는 비용이 많이 들기 때문에 기능을 확장할 가능성이 없다면 구체 클래스를 직접 사용하고 향후에 필요할때 리팩터링해서 인터페이스를 도입하자
2. 스프링 핵심 원리 이해1 - 예제 만들기
    - 프로젝트 생성
    - 비즈니스 요구사항과 설계
    - 회원 도메인 설계
    - 회원 도메인 개발
    - 회원 도메인 실행과 테스트
    - 주문과 할인 도메인 설계
    - 주문과 할인 도메인 개발
    - 주문과 할인 도메인 실행과 테스트
3. 스프링 핵심 원리 이해2 - 객체 지향 원리 적용
    - 새로운 할인 정책 개발
    - 새로운 할인 정책 적용과 문제점
    - 관심사의 분리
    - AppConfig 리팩터링
    - 새로운 구조와 할인 정책 적용
    - 전체 흐름 정리
    - 좋은 객체 지향 설계의 5가지 원칙의 적용
    - IoC, DI 그리고 컨테이너
    - 스프링으로 전환하기
4. 스프링 컨테이너와 스프링 빈
    - 스프링 컨테이너 생성
    - 컨테이너에 등록된 모든 빈 조회
    - 스프링 빈 조회 - 기본
    - 스프링 빈 조회 - 동일한 타입이 둘 이상
    - 스프링 빈 조회 - 상속 관계
    - BeanFactory와 ApplicationContext
    - 다양한 설정 형식 지원 - 자바 코드, XML
    - 스프링 빈 설정 메타 정보 - BeanDefinition
5. 싱글톤 컨테이너
    - 웹 애플리케이션과 싱글톤
    - 싱글톤 패터
    - 싱글톤 컨테이너
    - 싱글톤 방식의 주의점
    - @Configuration과 싱글톤
    - @Configuration과 바이트코드 조작의 마법
6. 컴포넌트 스캔
    - 컴포넌트 스캔과 의존관계 자동 주입 시작하기
    - 탐색 위치와 기본 스캔 대상
    - 필터
    - 중복 등록과 충돌
7. 의존관계 자동 주입
    - 다양한 의존관계 주입 방법
    - 옵션 처리
    - 생성자 주입을 선택하라!
    - 롬복과 최신 트랜드
    - 조회 빈이 2개 이상 - 문제
    - @Autowired 필드 명, @Qualifier, @Primary
    - 애노테이션 직접 만들기
    - 조회한 빈이 모두 필요할 때, List, Map
    - 자동, 수종의 올바른 실무 운영 기준
8. 빈 생명주기 콜백
    - 빈 생명주기 콜백 시작
    - 인터페이스 InitializingBean, DisposableBean
    - 빈 등록 초기화, 소멸 메서드 지정
    - 애노테이션 @PostConstruct, @PreDestroy
9. 빈 스코프
    - 빈 스코프란?
    - 프로토타입 스코프
    - 프로토타입 스코프 - 싱글톤 빈과 함께 사용시 문제점
    - 프로토타입 스코프 - 싱글톤 빈과 사용시 Provider로 문제 해결
    - 웹 스코프
    - request 스코프 예제 만들기
    - 스코프와 Provider
    - 스코프와 프록시

[[이전으로]](https://github.com/heechul90/study-spring-start) [[다음으로]](https://github.com/heechul90/study-springmvc-servlet)
